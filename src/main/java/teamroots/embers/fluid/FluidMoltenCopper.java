package teamroots.embers.fluid;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import teamroots.embers.Embers;
import teamroots.embers.register.BlockRegister;

import java.awt.*;

public class FluidMoltenCopper extends Fluid {
	public FluidMoltenCopper() {
		super("copper",new ResourceLocation(Embers.MODID,"blocks/molten_copper_still"),new ResourceLocation(Embers.MODID,"blocks/molten_copper_flowing"));
		setViscosity(6000);
		setDensity(2000);
		setLuminosity(15);
		setTemperature(900);
		setBlock(BlockRegister.BLOCK_MOLTEN_COPPER);
		setUnlocalizedName("copper");
	}
	
	@Override
	public int getColor(){
		return Color.WHITE.getRGB();
	}
}
