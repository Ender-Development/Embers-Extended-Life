package teamroots.embers.recipe;

import com.google.common.collect.Lists;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import teamroots.embers.api.alchemy.AlchemyResult;
import teamroots.embers.api.alchemy.AspectList;
import teamroots.embers.api.alchemy.AspectList.AspectRangeList;
import teamroots.embers.util.IHasAspects;

import java.util.*;

public class AlchemyRecipe implements IHasAspects {
	//Binary compat
	@Deprecated
	public int ironAspectMin = 0, dawnstoneAspectMin = 0, copperAspectMin = 0, silverAspectMin = 0, leadAspectMin = 0;
	@Deprecated
	public int ironAspectRange = 0, dawnstoneAspectRange = 0, copperAspectRange = 0, silverAspectRange = 0, leadAspectRange = 0;
	@Deprecated
	public List<ItemStack> inputs = new ArrayList<>();
	@Deprecated
	public ItemStack centerInput = ItemStack.EMPTY;

	public Ingredient centerIngredient;
	public List<Ingredient> outsideIngredients;
	public AspectRangeList aspectRange;
	public ItemStack result = ItemStack.EMPTY;

	Random random = new Random();

	public AlchemyRecipe(AspectRangeList range, Ingredient center, List<Ingredient> outside, ItemStack result) {
		this.result = result;
		this.centerIngredient = center;
		this.outsideIngredients = outside;
		this.aspectRange = range;
	}

	@Deprecated
	public AlchemyRecipe(int ironMin, int ironMax, int dawnstoneMin, int dawnstoneMax, int copperMin, int copperMax, int silverMin, int silverMax, int leadMin, int leadMax, ItemStack center, ItemStack east, ItemStack west, ItemStack north, ItemStack south, ItemStack result){
		this.aspectRange = new AspectRangeList(
				AspectList.createStandard(ironMin,dawnstoneMin,copperMin,silverMin,leadMin),
				AspectList.createStandard(ironMax,dawnstoneMax,copperMax,silverMax,leadMax)
		);
		this.centerIngredient = Ingredient.fromStacks(center);
		this.outsideIngredients = Lists.newArrayList(Ingredient.fromStacks(east),Ingredient.fromStacks(north),Ingredient.fromStacks(west),Ingredient.fromStacks(south));
		this.result = result;
	}

	@Deprecated
	public int getIron(World world){
		return aspectRange.getExact("iron",world);
	}

	@Deprecated
	public int getDawnstone(World world){
		return aspectRange.getExact("dawnstone",world);
	}

	@Deprecated
	public int getCopper(World world){
		return aspectRange.getExact("copper",world);
	}

	@Deprecated
	public int getSilver(World world){
		return aspectRange.getExact("silver",world);
	}

	@Deprecated
	public int getLead(World world){
		return aspectRange.getExact("lead",world);
	}

	@Override
	public AspectRangeList getAspects() {
		return aspectRange;
	}

	public AlchemyResult matchAshes(AspectList list, World world) {
		return AlchemyResult.create(list, aspectRange, world);
	}

	public boolean matches(ItemStack center, List<ItemStack> test) {
		if (!centerIngredient.apply(center))
			return false;

		if (center.getTagCompound() != null) {
			if (Arrays.stream(centerIngredient.getMatchingStacks()).noneMatch(x -> {
				assert x.getTagCompound() != null;
				return x.getTagCompound().equals(center.getTagCompound());
			})) {
				return false;
			}
		}

		ArrayList<Ingredient> ingredients = new ArrayList<>(outsideIngredients);
		while (test.size() > ingredients.size()) {
			ingredients.add(Ingredient.EMPTY);
		}
		for (ItemStack stack : test) {
			Optional<Ingredient> found = ingredients.stream().filter(x -> x.apply(stack)).findFirst();
			if (found.isPresent()) {
				if (stack.getTagCompound() != null) {
					if (Arrays.stream(found.get().getMatchingStacks()).noneMatch(x -> {
						assert x.getTagCompound() != null;
						return x.getTagCompound().equals(stack.getTagCompound());
					})) {
						return false;
					}
				}
				ingredients.remove(found.get());
			} else {
				return false;
			}
		}

		return true;
	}

	public boolean isFailure(AlchemyResult result) {
		return result.getAccuracy() != 1.0;
	}

	public ItemStack getResult(TileEntity tile) {
		return this.result.copy();
	}

	public final ItemStack getResult(TileEntity tile, AspectList aspects) {
		World world = tile.getWorld();
		return getResultInternal(world, tile, aspects);
	}

	@Deprecated
	public final ItemStack getResult(World world, int iron, int dawnstone, int copper, int silver, int lead){
		AspectList inputAspects = AspectList.createStandard(iron, dawnstone, copper, silver, lead);
		return getResultInternal(world, null, inputAspects);
	}

	//Inline after removal of the old getResult method.
	private ItemStack getResultInternal(World world, TileEntity tile, AspectList inputAspects) {
		AlchemyResult result = matchAshes(inputAspects, world);
		if (isFailure(result))
			return getResult(tile);
		else
			return result.createFailure();
	}

	public final ItemStack getOutput() {
		return result;
	}

	public final Ingredient getCenter() {
		return centerIngredient;
	}
}
