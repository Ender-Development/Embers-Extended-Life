package teamroots.embers.mixin.thaumicperiphery;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import thaumicperiphery.ModContent;

@Mixin(value = ModContent.class, remap = false)
public class ModContentClientMixin {
    @Redirect(method = "registerModels", at = @At(value = "FIELD", target = "Lthaumicperiphery/Config;emberCaster:Z"))
    private static boolean getEmberCaster() {
        return false;
    }
}
