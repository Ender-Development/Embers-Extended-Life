package teamroots.embers.compat.thaumcraft;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.oredict.ShapedOreRecipe;
import teamroots.embers.Tags;
import teamroots.embers.recipe.RecipeRegistry;
import teamroots.embers.register.ItemRegister;
import teamroots.embers.compat.Util;

public class ThaumcraftIntegration {
    public static final Item EMBER_CASTER = new EmberCaster();
    public static final Item TIERED_EMBER_CASTER = new TieredEmberCaster().setRegistryName(Tags.MOD_ID, "tiered_ember_caster").setTranslationKey(Tags.MOD_ID + ".tiered_ember_caster");

    public static void registerAll() {
        if (Util.isThaumicAugmentationIntegrationEnabled() && Util.isThaumicPeripheryIntegrationEnabled()) {
            ItemRegister.INSTANCE.add(TIERED_EMBER_CASTER);
        }
    }

    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        if (Util.isThaumicAugmentationIntegrationEnabled() && Util.isThaumicPeripheryIntegrationEnabled()) {
            event.getRegistry().register(new ShapedOreRecipe(RecipeRegistry.getRL("thaumium_ember_caster"), new ItemStack(TIERED_EMBER_CASTER, 1, 0), true, new Object[]{
                "ASA",
                "SPS",
                "ASA",
                'P', EMBER_CASTER,
                'S', "plateThaumium",
                'A', ItemRegister.WINDING_GEARS}).setRegistryName(RecipeRegistry.getRL("thaumium_ember_caster")));
            event.getRegistry().register(new ShapedOreRecipe(RecipeRegistry.getRL("void_ember_caster"), new ItemStack(TIERED_EMBER_CASTER, 1, 1), true, new Object[]{
                "ASA",
                "SPS",
                "ASA",
                'P', new ItemStack(TIERED_EMBER_CASTER, 1, 0),
                'S', "plateVoid",
                'A', ItemRegister.WILDFIRE_CORE}).setRegistryName(RecipeRegistry.getRL("void_ember_caster")));
        }
    }
}
