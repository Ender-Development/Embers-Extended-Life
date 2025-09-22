package teamroots.embers.compat.thaumicaugmentation;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.oredict.ShapedOreRecipe;
import teamroots.embers.Tags;
import teamroots.embers.recipe.RecipeRegistry;
import teamroots.embers.register.ItemRegister;

public class ThaumicAugmentationIntegration {
    public static final Item TIERED_EMBER_CASTER = new TieredEmberCaster().setRegistryName(Tags.MOD_ID, "tiered_ember_caster").setTranslationKey(Tags.MOD_ID + ".tiered_ember_caster");

    public static void registerAll() {
        ItemRegister.INSTANCE.add(ThaumicAugmentationIntegration.TIERED_EMBER_CASTER);
    }

    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        event.getRegistry().register(new ShapedOreRecipe(RecipeRegistry.getRL("thaumium_ember_caster"), new ItemStack(ThaumicAugmentationIntegration.TIERED_EMBER_CASTER, 1, 0), true, new Object[]{
                "ASA",
                "SPS",
                "ASA",
                'P', ItemRegister.FOCAL_LENS,
                'S', "plateThaumium",
                'A', ItemRegister.WINDING_GEARS}).setRegistryName(RecipeRegistry.getRL("thaumium_ember_caster")));
        event.getRegistry().register(new ShapedOreRecipe(RecipeRegistry.getRL("void_ember_caster"), new ItemStack(ThaumicAugmentationIntegration.TIERED_EMBER_CASTER, 1, 1), true, new Object[]{
                "ASA",
                "SPS",
                "ASA",
                'P', new ItemStack(ThaumicAugmentationIntegration.TIERED_EMBER_CASTER, 1, 0),
                'S', "plateVoid",
                'A', ItemRegister.WILDFIRE_CORE}).setRegistryName(RecipeRegistry.getRL("void_ember_caster")));
    }
}
