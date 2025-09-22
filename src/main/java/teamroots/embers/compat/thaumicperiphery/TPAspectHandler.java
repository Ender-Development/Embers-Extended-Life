package teamroots.embers.compat.thaumicperiphery;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectEventProxy;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.aspects.AspectRegistryEvent;

public class TPAspectHandler {
    @SubscribeEvent(priority = EventPriority.LOW)
    public static void onAspectRegistryEvent(AspectRegistryEvent event) {
        registerAspects(event.register);
    }

    private static void registerAspects(AspectEventProxy register) {
        register.registerComplexObjectTag(new ItemStack(ThaumicPeripheryIntegration.EMBER_CASTER, 1, 0), (new AspectList()).add(Aspect.MAGIC, 5).add(Aspect.METAL, 5).add(Aspect.FIRE, 5));
    }
}
