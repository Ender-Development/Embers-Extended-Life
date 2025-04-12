package teamroots.embers.mixin.jaopca;

import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import teamroots.embers.register.ItemRegister;


@Mixin(targets = "thelm.jaopca.modules.ModuleEmbers", remap = false)
public class ModuleEmbersMixin {
    @Redirect(method = "init", at = @At(value = "FIELD", target = "Lteamroots/embers/RegistryManager;stamp_bar:Lnet/minecraft/item/Item;"))
    private Item stamp_bar() {
        return ItemRegister.STAMP_BAR;
    }

    @Redirect(method = "init", at = @At(value = "FIELD", target = "Lteamroots/embers/RegistryManager;stamp_plate:Lnet/minecraft/item/Item;"))
    private Item stamp_plate() {
        return ItemRegister.STAMP_PLATE;
    }
}
