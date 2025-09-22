package teamroots.embers.compat.thaumicperiphery;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
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
import thaumicperiphery.items.ItemCasterEmber;

import java.text.DecimalFormat;
import java.util.List;

public class EmberCaster extends ItemCasterEmber {
    DecimalFormat formatter = new DecimalFormat("#######.#");

    @Override
    public boolean consumeVis(ItemStack is, EntityPlayer player, float amount, boolean crafting, boolean sim) {
        double cost = amount * getConsumptionModifier(is, player, crafting);
        if (EmberInventoryUtil.getEmberTotal(player) < cost) {
            return false;
        } else {
            if (!sim) {
                EmberInventoryUtil.removeEmber(player, cost);
            }
            return true;
        }
    }

    @Override
    public float getConsumptionModifier(ItemStack is, EntityPlayer player, boolean crafting) {
        double consumptionModifier = 1.0 - CasterManager.getTotalVisDiscount(player);
        return (float) (Math.max(consumptionModifier, 0.1) * ConfigCompat.THAUMCRAFT.emberMultiplier);
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
                    text = String.format("%s%s %s", TextFormatting.RESET, formatter.format(amt), I18n.format("item.Focus.cost_ember"));
                }
            }
            tooltip.add(String.format("%s%s%s %s", TextFormatting.ITALIC, TextFormatting.RED, I18n.format("thaumicperiphery.ember.cost"), text));
        }

        ItemFocus focus = this.getFocus(stack);
        if (focus != null) {
            ItemStack focusStack = this.getFocusStack(stack);
            tooltip.add(String.format("%s%s%s%s", TextFormatting.BOLD, TextFormatting.ITALIC, TextFormatting.GREEN, focus.getItemStackDisplayName(focusStack)));
            focus.addFocusInformation(focusStack, worldIn, tooltip, flagIn);
        }
    }
}
