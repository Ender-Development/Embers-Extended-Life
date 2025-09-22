package teamroots.embers.compat.thaumicaugmentation;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectEventProxy;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.aspects.AspectRegistryEvent;

public class TAAspectHandler {
    @SubscribeEvent(priority = EventPriority.LOW)
    public static void onAspectRegistryEvent(AspectRegistryEvent event) {
        registerAspects(event.register);
    }

    private static void registerAspects(AspectEventProxy register) {
        register.registerComplexObjectTag(new ItemStack(ThaumicAugmentationIntegration.TIERED_EMBER_CASTER, 1, 0), (new AspectList()).add(Aspect.MAGIC, 8));
        register.registerComplexObjectTag(new ItemStack(ThaumicAugmentationIntegration.TIERED_EMBER_CASTER, 1, 1), (new AspectList()).add(Aspect.ELDRITCH, 27).add(Aspect.VOID, 23));
    }
}
