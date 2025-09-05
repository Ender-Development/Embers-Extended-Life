package teamroots.embers.register;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.DataSerializerEntry;
import teamroots.embers.Embers;
import teamroots.embers.api.power.IEmberCapability;
import teamroots.embers.api.upgrades.IUpgradeProvider;
import teamroots.embers.block.IBlock;
import teamroots.embers.block.IModeledBlock;
import teamroots.embers.compat.BaublesIntegration;
import teamroots.embers.compat.MysticalMechanicsIntegration;
import teamroots.embers.compat.environmentaltech.EnvironmentalTechIntegration;
import teamroots.embers.compat.Util;
import teamroots.embers.compat.thaumcraft.ThaumcraftIntegration;
import teamroots.embers.config.ConfigMob;
import teamroots.embers.entity.EntityAncientGolem;
import teamroots.embers.item.IModeledItem;
import teamroots.embers.item.ItemEmberCartridge;
import teamroots.embers.item.ItemEmberJar;
import teamroots.embers.item.ItemTyrfing;
import teamroots.embers.power.DefaultEmberCapability;
import teamroots.embers.power.EmberCapabilityStorage;
import teamroots.embers.research.capability.DefaultResearchCapability;
import teamroots.embers.research.capability.IResearchCapability;
import teamroots.embers.tileentity.TileEntityBeamCannon;
import teamroots.embers.upgrade.UpgradeCatalyticPlug;
import teamroots.embers.util.DefaultUpgradeProvider;
import teamroots.embers.util.EmbersFuelHandler;
import teamroots.embers.util.ExtraSerializers;
import teamroots.embers.world.WorldGenOres;
import teamroots.embers.world.WorldGenSmallRuin;
import thaumcraft.api.casters.ICaster;
import thaumcraft.common.items.casters.ItemFocus;
import thecodex6824.thaumicaugmentation.api.item.IDyeableItem;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

// I am currently dead!

public class RegistryManager {

    public static WorldGenOres world_gen_ores;

    public static IWorldGenerator world_gen_small_ruin;

    public static void registerAll() {
        registerCapabilities();

        FluidRegister.INSTANCE.register();
        EntityRegister.INSTANCE.register();
        ItemModifierRegister.INSTANCE.register();
        TileEntityRegister.INSTANCE.register();

        List<BiomeEntry> biomeEntries = new ArrayList<BiomeEntry>();
        biomeEntries.addAll(BiomeManager.getBiomes(BiomeType.COOL));
        biomeEntries.addAll(BiomeManager.getBiomes(BiomeType.DESERT));
        biomeEntries.addAll(BiomeManager.getBiomes(BiomeType.ICY));
        biomeEntries.addAll(BiomeManager.getBiomes(BiomeType.WARM));
        List<Biome> biomes = new ArrayList<Biome>();
        for (BiomeEntry b : biomeEntries) {
            biomes.add(b.biome);
        }
        biomes.addAll(BiomeManager.oceanBiomes);

        if (ConfigMob.EMBER_GOLEM.enableSpawning) {
            EntityRegistry.addSpawn(EntityAncientGolem.class, ConfigMob.EMBER_GOLEM.spawnWeight, 1, 1, EnumCreatureType.MONSTER, biomes.toArray(new Biome[biomes.size()]));
        }

        world_gen_ores = new WorldGenOres();
        GameRegistry.registerWorldGenerator(world_gen_ores, 1);
        GameRegistry.registerWorldGenerator(world_gen_small_ruin = new WorldGenSmallRuin(), 400);

        MinecraftForge.EVENT_BUS.register(EmbersFuelHandler.class);
        UpgradeCatalyticPlug.registerBlacklistedTile(TileEntityBeamCannon.class);

        if (Util.isBaublesIntegrationEnabled())
            BaublesIntegration.registerAll();
        if (Util.isMysticalMechanicsIntegrationEnabled())
            MysticalMechanicsIntegration.registerAll();
        if (Util.isEnvironmentalTechIntegrationEnabled())
            EnvironmentalTechIntegration.registerAll();
        if (Util.isThaumcraftIntegrationEnabled())
            ThaumcraftIntegration.registerAll();
    }

    private static void registerCapabilities() {
        CapabilityManager.INSTANCE.register(IEmberCapability.class, new EmberCapabilityStorage(), DefaultEmberCapability.class);
        CapabilityManager.INSTANCE.register(IUpgradeProvider.class, new Capability.IStorage<IUpgradeProvider>() {
            @Nullable
            @Override
            public NBTBase writeNBT(Capability<IUpgradeProvider> capability, IUpgradeProvider instance, EnumFacing side) {
                return null;
            }

            @Override
            public void readNBT(Capability<IUpgradeProvider> capability, IUpgradeProvider instance, EnumFacing side, NBTBase nbt) {
                //NOOP
            }
        }, () -> {
            return new DefaultUpgradeProvider("none", null);
        });
        CapabilityManager.INSTANCE.register(IResearchCapability.class, new Capability.IStorage<IResearchCapability>() {
            @Nullable
            @Override
            public NBTBase writeNBT(Capability<IResearchCapability> capability, IResearchCapability instance, EnumFacing side) {
                NBTTagCompound compound = new NBTTagCompound();
                instance.writeToNBT(compound);
                return compound;
            }

            @Override
            public void readNBT(Capability<IResearchCapability> capability, IResearchCapability instance, EnumFacing side, NBTBase nbt) {
                NBTTagCompound compound = (NBTTagCompound) nbt;
                instance.readFromNBT(compound);
            }
        }, DefaultResearchCapability::new);
    }

    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event) {
        for (Block b : BlockRegister.INSTANCE.load()) {
            event.getRegistry().register(b);
        }
    }

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        for (Item i : ItemRegister.INSTANCE.load()) {
            event.getRegistry().register(i);
        }
        for (Block b : BlockRegister.INSTANCE.load()) {
            if (b instanceof IBlock) {
                Item itemBlock = ((IBlock) b).getItemBlock();
                if (itemBlock != null)
                    event.getRegistry().register(itemBlock);
            }
        }
    }

    @SideOnly(Side.CLIENT)
    public static void registerColorHandlers() {
        Minecraft.getMinecraft().getItemColors().registerItemColorHandler(new ItemEmberJar.ColorHandler(), ItemRegister.EMBER_JAR);
        Minecraft.getMinecraft().getItemColors().registerItemColorHandler(new ItemEmberCartridge.ColorHandler(), ItemRegister.EMBER_CARTRIDGE);
        Minecraft.getMinecraft().getItemColors().registerItemColorHandler(new ItemTyrfing.ColorHandler(), ItemRegister.TYRFING);
        if (Util.isThaumicAugmentationIntegrationEnabled()) {
            Minecraft.getMinecraft().getItemColors().registerItemColorHandler((stack, tintIndex) -> {
                if (tintIndex == 1 && stack.getItem() instanceof ICaster && ((ICaster) stack.getItem()).getFocus(stack) != null) {
                    return ((ItemFocus) ((ICaster) stack.getItem()).getFocus(stack)).getFocusColor(((ICaster) stack.getItem()).getFocusStack(stack));
                } else {
                    return tintIndex == 2 && stack.getItem() instanceof IDyeableItem ? ((IDyeableItem) stack.getItem()).getDyedColor(stack) : -1;
                }
            }, ThaumcraftIntegration.TIERED_EMBER_CASTER);
        }
    }

    @SideOnly(Side.CLIENT)
    public static void registerEntityRendering() {
        TileEntitySpecialRendererRegister.INSTANCE.register();
        EntityRenderingHandlerRegister.INSTANCE.register();
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void registerRendering(ModelRegistryEvent event) {

        for (Block block : BlockRegister.INSTANCE.load()) {
            if (block instanceof IModeledBlock) {
                ((IModeledBlock) block).initModel();
            }
        }
        for (Item item : ItemRegister.INSTANCE.load()) {
            if (item instanceof IModeledItem) {
                ((IModeledItem) item).initModel();
            }
        }

        if (Util.isThaumicPeripheryIntegrationEnabled()) {
            ModelLoader.setCustomModelResourceLocation(ThaumcraftIntegration.EMBER_CASTER, 0, new ModelResourceLocation("thaumicperiphery:caster_ember"));
            if (Util.isThaumicAugmentationIntegrationEnabled()) {
                ModelLoader.setCustomModelResourceLocation(ThaumcraftIntegration.TIERED_EMBER_CASTER, 0, new ModelResourceLocation("embers:gauntlet_thaumium"));
                ModelLoader.setCustomModelResourceLocation(ThaumcraftIntegration.TIERED_EMBER_CASTER, 1, new ModelResourceLocation("embers:gauntlet_void"));
            }
        }
    }

    @SubscribeEvent
    public void init(RegistryEvent.Register<DataSerializerEntry> event) {
        event.getRegistry().register(new DataSerializerEntry(ExtraSerializers.FLOAT_ARRAY).setRegistryName(Embers.MODID, "serializer_float_array"));
    }

    public static class tupleTileEntity {
        protected final Class<? extends TileEntity> te_class;
        protected final ResourceLocation location;

        public tupleTileEntity(Class<? extends TileEntity> te_class, String name) {
            this.te_class = te_class;
            this.location = new ResourceLocation(Embers.MODID, name);
        }
    }

    public static class tupleTESR { // TileEntitySpecialRenderer
        protected final Class<? extends TileEntity> tileEntityClass;
        protected final TileEntitySpecialRenderer<? super TileEntity> specialRenderer;

        public tupleTESR(Class<? extends TileEntity> tileEntityClass, TileEntitySpecialRenderer<? super TileEntity> specialRenderer) {
            this.tileEntityClass = tileEntityClass;
            this.specialRenderer = specialRenderer;
        }
    }

    public static class tupleERH { // EntityRenderingHandler
        protected final Class<? extends Entity> entityClass;
        protected final Render<? extends Entity> renderer;

        public tupleERH(Class<? extends Entity> entityClass, Render<? extends Entity> renderer) {
            this.entityClass = entityClass;
            this.renderer = renderer;
        }
    }
}
