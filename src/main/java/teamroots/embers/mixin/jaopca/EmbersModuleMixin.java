package teamroots.embers.mixin.jaopca;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import teamroots.embers.config.ConfigMisc;

@Mixin(targets = "thelm.jaopca.compat.embers.EmbersModule", remap = false)
public class EmbersModuleMixin {
    @Redirect(method = "onInit", at = @At(value = "FIELD", target = "Lteamroots/embers/ConfigManager;melterOreAmount:I"))
    private int onInit() {
        return ConfigMisc.ingotFluidAmount;
    }
}
