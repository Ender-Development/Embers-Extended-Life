package teamroots.embers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import teamroots.embers.proxy.CommonProxy;
import teamroots.embers.recipe.RecipeRegistry;
import teamroots.embers.register.ItemRegister;
import teamroots.embers.register.RegistryManager;
import teamroots.embers.research.ResearchManager;

@Mod(modid = Embers.MODID, name = Embers.MODNAME, dependencies = Tags.DEPENDENCIES, acceptedMinecraftVersions = Embers.VERSIONS, version = Tags.VERSION)
public class Embers {

	public static final String MODID = Tags.MOD_ID;
	public static final String MODNAME = Tags.MOD_NAME;
	public static final String CFG_FOLDER = "Embers/";
	public static final String CFG_ADDONS_FOLDER = String.format("%saddons/", CFG_FOLDER);
	public static final String VERSIONS = "[1.12.2]";

	public static final Logger LOG = LogManager.getLogger(Embers.MODNAME);

	@SidedProxy(clientSide = "teamroots.embers.proxy.ClientProxy",serverSide = "teamroots.embers.proxy.ServerProxy")
    public static CommonProxy proxy;
	
	public static CreativeTabs tab = new CreativeTabs("embers") {
    	@Override
    	public String getTabLabel(){
    		return "embers";
    	}
		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack createIcon(){
			return new ItemStack(ItemRegister.CRYSTAL_EMBER,1);
		}
	};
	
	public static CreativeTabs resource_tab = new CreativeTabs("embers_resources") {
    	@Override
    	public String getTabLabel(){
    		return "embers_resources";
    	}
		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack createIcon(){
			return new ItemStack(ItemRegister.INGOT_DAWNSTONE,1);
		}
	};
	
    @Instance(Embers.MODID)
    public static Embers instance;

	static {
		FluidRegistry.enableUniversalBucket();
	}

	@EventHandler
	public void constructing(FMLConstructionEvent event) {
		proxy.constructing(event);
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		MinecraftForge.EVENT_BUS.register(new EventManager());
		MinecraftForge.EVENT_BUS.register(new RegistryManager());
		MinecraftForge.EVENT_BUS.register(new RecipeRegistry());
		MinecraftForge.EVENT_BUS.register(new ResearchManager());
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		proxy.postInit(event);
	}

	@EventHandler
	public void serverStarting(FMLServerStartingEvent event){
		//event.registerServerCommand(new CommandEmberFill());
	}
}
