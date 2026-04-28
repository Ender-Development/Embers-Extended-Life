package teamroots.embers.util;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.StreamSupport;

public class IngredientSpecial extends Ingredient {
    private static Set<IngredientSpecial> uncachedIngredients = Collections.newSetFromMap(new WeakHashMap<>());
    private ItemStack[] matchingStacks = new ItemStack[0];
    private boolean matchingStacksCached;
    private final Predicate<ItemStack> matcher;

    public IngredientSpecial(Predicate<ItemStack> matcher) {
        super(0);
        this.matcher = matcher;
        uncachedIngredients.add(this);
    }

    @Override
    public boolean apply(@Nullable ItemStack stack) {
        if (stack == null)
            stack = ItemStack.EMPTY;

        return matcher.test(stack);
    }

    @Override
    public ItemStack[] getMatchingStacks() {
        if (!matchingStacksCached)
            cacheMatchingStacks();
        return matchingStacks;
    }

    private static void cacheMatchingStacks() {

        //Forge's registries don't have a parallelStream() method, so we have to use StreamSupport
        Map<IngredientSpecial, List<ItemStack>> matches = StreamSupport.stream(ForgeRegistries.ITEMS.spliterator(), true)
            .flatMap(item -> {
                CreativeTabs[] tabs = item.getCreativeTabs();
                NonNullList<ItemStack> items = NonNullList.create();
                for (CreativeTabs tab : tabs) {
                    if (tab == null)
                        continue;
                    item.getSubItems(tab, items);
                }
                return items.stream();
            })
            //We have to use this collect as ConcurrentHashMap adds significant overhead to computeIfAbsent (hashCode)
            .collect(
                HashMap::new,
                (map, stack) -> {
                    for (IngredientSpecial ingredient : uncachedIngredients) {
                        if (ingredient.test(stack)) {
                            map.computeIfAbsent(ingredient, k -> new ArrayList<>()).add(stack);
                        }
                    }
                },
                (left, right) -> {
                    right.forEach((key, list) -> {
                        left.computeIfAbsent(key, k -> new ArrayList<>()).addAll(list);
                    });
                }
            );

        for (Map.Entry<IngredientSpecial, List<ItemStack>> entry : matches.entrySet()) {
            entry.getKey().matchingStacks = entry.getValue() == null ? new ItemStack[0] : entry.getValue().toArray(new ItemStack[0]);
            entry.getKey().matchingStacksCached = true;
        }
        uncachedIngredients.clear();
    }

}