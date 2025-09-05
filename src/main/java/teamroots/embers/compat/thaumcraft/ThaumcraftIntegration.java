package teamroots.embers.compat.thaumcraft;

import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import teamroots.embers.Tags;
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

    }
}
