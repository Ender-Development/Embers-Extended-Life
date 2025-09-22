package teamroots.embers.compat.thaumicperiphery;

import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

public class ThaumicPeripheryIntegration {
    public static final Item EMBER_CASTER = new EmberCaster();

    public static void registerAll() {}
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {}
}
