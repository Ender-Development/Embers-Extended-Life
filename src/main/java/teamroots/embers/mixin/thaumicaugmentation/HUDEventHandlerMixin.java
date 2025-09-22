package teamroots.embers.mixin.thaumicaugmentation;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import teamroots.embers.compat.thaumicaugmentation.TieredEmberCaster;
import thecodex6824.thaumicaugmentation.client.event.HUDEventHandler;

@Mixin(value = HUDEventHandler.class, remap = false)
public class HUDEventHandlerMixin {
    @Inject(method = "onRenderHUD", at = @At(value = "HEAD"), cancellable = true)
    private static void onRenderHUDMixin(RenderGameOverlayEvent event, CallbackInfo ci) {
        Minecraft mc = Minecraft.getMinecraft();
        ItemStack mainHand = mc.player.getHeldItemMainhand();
        ItemStack offHand = mc.player.getHeldItemOffhand();
        if ((mainHand.getItem() instanceof TieredEmberCaster) || (offHand.getItem() instanceof TieredEmberCaster)) {
            ci.cancel();
        }
    }
}
