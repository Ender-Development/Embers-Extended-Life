package teamroots.embers.mixin.thaumicperiphery;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import teamroots.embers.compat.thaumicperiphery.ThaumicPeripheryIntegration;
import thaumicperiphery.ThaumicPeriphery;

@Mixin(value = ThaumicPeriphery.class, remap = false)
public class ThaumicPeripheryMixin {
    @Shadow
    public static CreativeTabs thaumicPeripheryTab;

    @Inject(method = "<init>", at = @At("TAIL"))
    private void getCreativeTab(CallbackInfo ci) {
        thaumicPeripheryTab = new CreativeTabs(thaumicPeripheryTab.getIndex(), thaumicPeripheryTab.getTabLabel()) {
            @Override
            @SideOnly(Side.CLIENT)
            public @NotNull ItemStack createIcon() {
                return new ItemStack(ThaumicPeripheryIntegration.EMBER_CASTER);
            }
        };
    }
}
