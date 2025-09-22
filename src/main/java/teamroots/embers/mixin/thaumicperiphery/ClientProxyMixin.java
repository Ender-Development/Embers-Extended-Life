package teamroots.embers.mixin.thaumicperiphery;

import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import teamroots.embers.compat.thaumicperiphery.ThaumicPeripheryIntegration;
import thaumicperiphery.proxy.ClientProxy;

@Mixin(value = ClientProxy.class, remap = false)
public class ClientProxyMixin {
    @Redirect(method = "registerColorHandlers", at = @At(value = "FIELD", target = "Lthaumicperiphery/ModContent;caster_ember:Lnet/minecraft/item/Item;"))
    private Item getEmberCaster() {
        return ThaumicPeripheryIntegration.EMBER_CASTER;
    }
}
