package teamroots.embers.compat.thaumcraft;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import teamroots.embers.config.ConfigCompat;
import teamroots.embers.util.EmberInventoryUtil;
import thaumcraft.common.items.casters.CasterManager;
import thaumcraft.common.items.casters.ItemFocus;
import thecodex6824.thaumicaugmentation.common.item.ItemTieredCasterGauntlet;

import java.util.List;

public class TieredEmberCaster extends ItemTieredCasterGauntlet {
    @Override
    public boolean consumeVis(ItemStack is, EntityPlayer player, float amount, boolean crafting, boolean sim) {;
        if (EmberInventoryUtil.getEmberTotal(player) < amount) {
            return false;
        } else {
            if (!sim) {
                EmberInventoryUtil.removeEmber(player, amount);
            }
            return true;
        }
    }

    @Override
    public float getConsumptionModifier(ItemStack is, EntityPlayer player, boolean crafting) {
        double consumptionModifier = 1.0 - CasterManager.getTotalVisDiscount(player);

        if (is.getItem() == this) {
            consumptionModifier -= getCasterVisDiscount(is);
        }

        return (float) (Math.max(consumptionModifier, 0.1) * ConfigCompat.THAUMCRAFT.emberMultiplier);
    }

    @Override
    public void onUpdate(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected) {
        // NO OP
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        if (stack.hasTagCompound()) {
            String text = "";
            ItemStack focus = this.getFocusStack(stack);
            if (focus != null && !focus.isEmpty()) {
                double amt = ((ItemFocus)focus.getItem()).getVisCost(focus) * getConsumptionModifier(stack, null, false);
                if (amt > 0) {
                    text = String.format("%s%s %s", TextFormatting.RESET, VIS_FORMATTER.format(amt), I18n.format("item.Focus.cost_ember"));
                }
            }
            tooltip.add(String.format("%s%s%s %s", TextFormatting.ITALIC, TextFormatting.RED, I18n.format("thaumicperiphery.ember.cost"), text));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
