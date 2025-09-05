package teamroots.embers.mixin.thaumicperiphery;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistryEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import teamroots.embers.compat.thaumcraft.ThaumcraftIntegration;
import thaumicperiphery.ModContent;

@Mixin(value = ModContent.class, remap = false)
public class ModContentMixin {

    @ModifyArg(method = "registerItems", at = @At(value = "INVOKE", target = "Lnet/minecraftforge/registries/IForgeRegistry;register(Lnet/minecraftforge/registries/IForgeRegistryEntry;)V", ordinal = 0), index = 0)
    private static IForgeRegistryEntry modifyEmberCaster(IForgeRegistryEntry value) {
        return ThaumcraftIntegration.EMBER_CASTER;
    }

    @WrapOperation(method = "registerModels", at = @At(value = "INVOKE", target = "Lnet/minecraftforge/client/model/ModelLoader;setCustomModelResourceLocation(Lnet/minecraft/item/Item;ILnet/minecraft/client/renderer/block/model/ModelResourceLocation;)V", ordinal = 0))
    private static void wrapSetCustomModelResourceLocation(Item item, int metadata, ModelResourceLocation model, Operation<Void> original) {

    }
}
