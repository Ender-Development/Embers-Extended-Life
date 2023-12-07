package teamroots.embers.recipe;

import com.google.common.collect.Lists;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import teamroots.embers.api.itemmod.ItemModUtil;
import teamroots.embers.api.itemmod.ModifierBase;
import teamroots.embers.register.ItemRegister;

import java.util.List;
import java.util.stream.Collectors;

public class AnvilAddModifierRecipe extends DawnstoneAnvilRecipe implements IWrappableRecipe {
    @Override
    public boolean matches(ItemStack input1, ItemStack input2) {
        ModifierBase modifier = ItemModUtil.getModifier(input2);
        if(modifier == null)
            return false;
        int slotsNeeded = modifier.countTowardsTotalLevel ? 1 : 0;
        return ItemModUtil.hasHeat(input1) && ItemModUtil.getLevel(input1) >= ItemModUtil.getTotalModifierLevel(input1) + slotsNeeded && ItemModUtil.isModValid(input1, modifier);
    }

    @Override
    public List<ItemStack> getResult(TileEntity tile, ItemStack input1, ItemStack input2) {
        ItemStack result = input1.copy();
        ItemModUtil.addModifier(result, input2);
        return Lists.newArrayList(result);
    }

    @Override
    public List<DawnstoneAnvilRecipe> getWrappers() {
        return ItemModUtil.getAllModifierItems().stream().filter(stack -> stack.getItem() != ItemRegister.ANCIENT_MOTIVE_CORE).map(AnvilAddModifierFakeRecipe::new).collect(Collectors.toList());
    }
}
