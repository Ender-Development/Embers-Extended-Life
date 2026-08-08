package teamroots.embers.mixin.thaumicperiphery;

import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import teamroots.embers.register.ItemRegister;
import thaumicperiphery.proxy.CommonProxy;

@Mixin(value = CommonProxy.class, remap = false)
public class CommonProxyMixin {
    @Redirect(method = "initResearch", at = @At(value = "FIELD", target = "Lteamroots/embers/RegistryManager;shard_ember:Lnet/minecraft/item/Item;"))
    private Item shard_ember() {
        return ItemRegister.SHARD_EMBER;
    }

    @Redirect(method = "initResearch", at = @At(value = "FIELD", target = "Lteamroots/embers/RegistryManager;wildfire_core:Lnet/minecraft/item/Item;"))
    private Item wildfire_core() {
        return ItemRegister.WILDFIRE_CORE;
    }
}
