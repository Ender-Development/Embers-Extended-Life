package teamroots.embers.mixin.thaumicperiphery;

import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import teamroots.embers.compat.thaumcraft.TieredEmberCaster;
import thaumicperiphery.Config;
import thaumicperiphery.handler.HUDHandler;

@Mixin(value = HUDHandler.class, remap = false)
public class HUDHandlerMixin {
    @Shadow
    private static void renderEmberCasterHUD(Minecraft mc, float renderTickTime, EntityPlayer player, long time) {

    }

    @Inject(method = "renderTick", at = @At(value = "INVOKE_ASSIGN", target = "Lnet/minecraft/entity/player/EntityPlayer;getHeldItemMainhand()Lnet/minecraft/item/ItemStack;"), cancellable = true)
    private static void renderTickMixin(TickEvent.RenderTickEvent event, CallbackInfo ci, @Local Minecraft mc, @Local EntityPlayer player, @Local long time) {
        if (Config.emberCaster && (player.getHeldItemMainhand().getItem() instanceof TieredEmberCaster || player.getHeldItemOffhand().getItem() instanceof TieredEmberCaster)) {
            renderEmberCasterHUD(mc, event.renderTickTime, player, time);
            ci.cancel();
        }
    }
}
