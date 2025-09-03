package teamroots.embers.register;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import teamroots.embers.Embers;
import teamroots.embers.block.*;
import teamroots.embers.config.ConfigMaterial;
import teamroots.embers.config.ConfigMisc;
import teamroots.embers.config.ConfigSeed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class BlockRegister implements IRegistrable<Block> {

    public static final BlockRegister INSTANCE = new BlockRegister();

    private BlockRegister() {
    }

    public static final Block ADVANCED_EDGE = new BlockAdvancedEdge(MaterialRegister.UNPUSHABLE, "advanced_edge", false).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block ALCHEMY_PEDESTAL = new BlockAlchemyPedestal(Material.ROCK, "alchemy_pedestal", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block ALCHEMY_TABLET = new BlockAlchemyTablet(Material.ROCK, "alchemy_tablet", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block ARCHAIC_BRICKS = new BlockBase(Material.ROCK, "archaic_bricks", true).setHarvestProperties("pickaxe", 0).setHardness(1.6f).setLightOpacity(16);
    public static final Block ARCHAIC_EDGE = new BlockBase(Material.ROCK, "archaic_edge", true).setHarvestProperties("pickaxe", 0).setHardness(1.6f).setLightOpacity(16);
    public static final Block ARCHAIC_GEYSIR = new BlockArchaicGeysir(Material.ROCK, "archaic_geysir", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block ARCHAIC_LIGHT = new BlockArchaicLight(Material.ROCK, "archaic_light", true).setHarvestProperties("pickaxe", 0).setHardness(1.6f).setLightOpacity(0).setLightLevel(1.0f);
    public static final Block ARCHAIC_MECH_EDGE = new BlockMechEdge(MaterialRegister.UNPUSHABLE, "archaic_mech_edge", false).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block ARCHAIC_TILE = new BlockBase(Material.ROCK, "archaic_tile", true).setHarvestProperties("pickaxe", 0).setHardness(1.6f).setLightOpacity(16);
    public static final Block ASHEN_BRICK = new BlockBase(Material.ROCK, "ashen_brick", true).setHarvestProperties("pickaxe", 0).setHardness(1.6f).setLightOpacity(16);
    public static final Block ASHEN_BRICK_SLAB_DOUBLE = new BlockDoubleSlabBase(Material.WOOD, "ashen_brick_slab_double", false).setHarvestProperties("pickaxe", 0).setHardness(1.6f).setLightOpacity(16);
    public static final Block ASHEN_BRICK_SLAB = new BlockSlabBase(ASHEN_BRICK_SLAB_DOUBLE, "ashen_brick_slab", true).setHarvestProperties("pickaxe", 0).setIsFullCube(false).setIsOpaqueCube(false).setHardness(1.6f).setLightOpacity(1);
    public static final Block ASHEN_STONE = new BlockBase(Material.ROCK, "ashen_stone", true).setHarvestProperties("pickaxe", 0).setHardness(1.6f).setLightOpacity(16);
    public static final Block ASHEN_STONE_SLAB_DOUBLE = new BlockDoubleSlabBase(Material.WOOD, "ashen_stone_slab_double", false).setHarvestProperties("pickaxe", 0).setHardness(1.6f).setLightOpacity(16);
    public static final Block ASHEN_STONE_SLAB = new BlockSlabBase(ASHEN_STONE_SLAB_DOUBLE, "ashen_stone_slab", true).setHarvestProperties("pickaxe", 0).setIsFullCube(false).setIsOpaqueCube(false).setHardness(1.6f).setLightOpacity(1);
    public static final Block ASHEN_TILE = new BlockBase(Material.ROCK, "ashen_tile", true).setHarvestProperties("pickaxe", 0).setHardness(1.6f).setLightOpacity(16);
    public static final Block ASHEN_TILE_SLAB_DOUBLE = new BlockDoubleSlabBase(Material.WOOD, "ashen_tile_slab_double", false).setHarvestProperties("pickaxe", 0).setHardness(1.6f).setLightOpacity(16);
    public static final Block ASHEN_TILE_SLAB = new BlockSlabBase(ASHEN_TILE_SLAB_DOUBLE, "ashen_tile_slab", true).setHarvestProperties("pickaxe", 0).setIsFullCube(false).setIsOpaqueCube(false).setHardness(1.6f).setLightOpacity(1);
    public static final Block AUTO_HAMMER = new BlockAutoHammer(Material.ROCK, "auto_hammer", true).setHarvestProperties("pickaxe", 0).setIsFullCube(false).setIsOpaqueCube(false).setHardness(1.6f).setLightOpacity(0);
    public static final Block BEAM_CANNON = new BlockBeamCannon(Material.ROCK, "beam_cannon", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block BEAM_SPLITTER = new BlockBeamSplitter(Material.ROCK, "beam_splitter", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block BIN = new BlockBin(Material.ROCK, "bin", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block BLOCK_ALCHEMICAL_REDSTONE = new BlockMolten(FluidRegister.FLUID_ALCHEMICAL_REDSTONE);
    public static final Block BLOCK_ALUMINUM = new BlockBase(Material.ROCK, "block_aluminum", true).setBeaconBase(true).setHarvestProperties("pickaxe", 1).setHardness(1.6f).setLightOpacity(16).setCreativeTab(Embers.resource_tab);
    public static final Block BLOCK_ASTRALITE = new BlockBase(Material.ROCK, "block_astralite", true).setHarvestProperties("pickaxe", 2).setHardness(1.6f).setLightOpacity(16).setCreativeTab(Embers.resource_tab).setCreativeTab(Embers.resource_tab);
    public static final Block BLOCK_BRONZE = new BlockBase(Material.ROCK, "block_bronze", true).setBeaconBase(true).setHarvestProperties("pickaxe", 1).setHardness(2.3f).setLightOpacity(16).setCreativeTab(Embers.resource_tab);
    public static final Block BLOCK_CAMINITE_BRICK = new BlockBase(Material.ROCK, "block_caminite_brick", true).setHarvestProperties("pickaxe", 0).setHardness(1.6f).setLightOpacity(16);
    public static final Block BLOCK_CAMINITE_BRICK_SLAB_DOUBLE = new BlockDoubleSlabBase(Material.WOOD, "block_caminite_brick_slab_double", false).setHarvestProperties("pickaxe", 0).setHardness(1.6f).setLightOpacity(16);
    public static final Block BLOCK_CAMINITE_BRICK_SLAB = new BlockSlabBase(BLOCK_CAMINITE_BRICK_SLAB_DOUBLE, "block_caminite_brick_slab", true).setHarvestProperties("pickaxe", 0).setIsFullCube(false).setIsOpaqueCube(false).setHardness(1.6f).setLightOpacity(1);
    public static final Block BLOCK_CAMINITE_LARGE_BRICK = new BlockBase(Material.ROCK, "block_caminite_large_brick", true).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block BLOCK_COPPER = new BlockBase(Material.ROCK, "block_copper", true).setBeaconBase(true).setHarvestProperties("pickaxe", 1).setHardness(1.4f).setLightOpacity(16).setCreativeTab(Embers.resource_tab);
    public static final Block BLOCK_DAWNSTONE = new BlockBase(Material.ROCK, "block_dawnstone", true).setBeaconBase(true).setHarvestProperties("pickaxe", 2).setHardness(1.6f).setLightLevel(0.0625f).setLightOpacity(16).setCreativeTab(Embers.resource_tab);
    public static final Block BLOCK_ELECTRUM = new BlockBase(Material.ROCK, "block_electrum", true).setBeaconBase(true).setHarvestProperties("pickaxe", 1).setHardness(1.6f).setLightOpacity(16).setCreativeTab(Embers.resource_tab);
    public static final Block BLOCK_FURNACE = new BlockFurnace(Material.ROCK, "block_furnace", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block BLOCK_LANTERN = new BlockLantern(Material.ROCK, "block_lantern", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f).setLightLevel(1.0f);
    public static final Block BLOCK_LEAD = new BlockBase(Material.ROCK, "block_lead", true).setBeaconBase(true).setHarvestProperties("pickaxe", 2).setHardness(1.6f).setLightOpacity(16).setCreativeTab(Embers.resource_tab);
    public static final Block BLOCK_MITHRIL = new BlockBase(Material.ROCK, "block_mithril", true).setHarvestProperties("pickaxe", 2).setHardness(1.6f).setLightLevel(0.0625f).setLightOpacity(16).setCreativeTab(Embers.resource_tab);
    public static final Block BLOCK_MOLTEN_ALUMINUM = new BlockMolten(FluidRegister.FLUID_MOLTEN_ALUMINUM);
    public static final Block BLOCK_MOLTEN_BRONZE = new BlockMolten(FluidRegister.FLUID_MOLTEN_BRONZE);
    public static final Block BLOCK_MOLTEN_COPPER = new BlockMolten(FluidRegister.FLUID_MOLTEN_COPPER);
    public static final Block BLOCK_MOLTEN_DAWNSTONE = new BlockMolten(FluidRegister.FLUID_MOLTEN_DAWNSTONE);
    public static final Block BLOCK_MOLTEN_ELECTRUM = new BlockMolten(FluidRegister.FLUID_MOLTEN_ELECTRUM);
    public static final Block BLOCK_MOLTEN_GOLD = new BlockMolten(FluidRegister.FLUID_MOLTEN_GOLD);
    public static final Block BLOCK_MOLTEN_IRON = new BlockMolten(FluidRegister.FLUID_MOLTEN_IRON);
    public static final Block BLOCK_MOLTEN_LEAD = new BlockMolten(FluidRegister.FLUID_MOLTEN_LEAD);
    public static final Block BLOCK_MOLTEN_NICKEL = new BlockMolten(FluidRegister.FLUID_MOLTEN_NICKEL);
    public static final Block BLOCK_MOLTEN_SILVER = new BlockMolten(FluidRegister.FLUID_MOLTEN_SILVER);
    public static final Block BLOCK_MOLTEN_TIN = new BlockMolten(FluidRegister.FLUID_MOLTEN_TIN);
    public static final Block BLOCK_FLUID_STEAM = new BlockMolten(FluidRegister.FLUID_STEAM);
    public static final Block BLOCK_FLUID_CRUDE_OIL = new BlockMolten(FluidRegister.FLUID_CRUDE_OIL);
    public static final Block BLOCK_FLUID_OIL = new BlockMolten(FluidRegister.FLUID_OIL);
    public static final Block BLOCK_FLUID_GAS = new BlockMolten(FluidRegister.FLUID_GAS);
    public static final Block BLOCK_NICKEL = new BlockBase(Material.ROCK, "block_nickel", true).setBeaconBase(true).setHarvestProperties("pickaxe", 1).setHardness(2.2f).setLightOpacity(16).setCreativeTab(Embers.resource_tab);
    public static final Block BLOCK_SILVER = new BlockBase(Material.ROCK, "block_silver", true).setBeaconBase(true).setHarvestProperties("pickaxe", 2).setHardness(1.6f).setLightOpacity(16).setCreativeTab(Embers.resource_tab);
    public static final Block BLOCK_TANK = new BlockTank(Material.ROCK, "block_tank", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block BLOCK_TIN = new BlockBase(Material.ROCK, "block_tin", true).setBeaconBase(true).setHarvestProperties("pickaxe", 1).setHardness(1.3f).setLightOpacity(16).setCreativeTab(Embers.resource_tab);
    public static final Block BLOCK_UMBER_STEEL = new BlockBase(Material.ROCK, "block_umber_steel", true).setHarvestProperties("pickaxe", 2).setHardness(1.6f).setLightOpacity(16).setCreativeTab(Embers.resource_tab).setCreativeTab(Embers.resource_tab);
    public static final Block BOILER = new BlockBoiler(Material.ROCK, "boiler", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block BREAKER = new BlockBreaker(Material.ROCK, "breaker", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block CAMINITE_LEVER = new BlockCaminiteLever("caminite_lever", true).setHardness(0.75f);
    public static final Block CATALYTIC_PLUG = new BlockCatalyticPlug(Material.ROCK, "catalytic_plug", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block CATALYZER = new BlockCatalyzer(Material.ROCK, "catalyzer", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static Block CHARGER = new BlockCharger(Material.ROCK, "charger", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block CINDER_PLINTH = new BlockCinderPlinth(Material.ROCK, "cinder_plinth", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block CLOCKWORK_ATTENUATOR = new BlockClockworkAttenuator(Material.ROCK, "clockwork_attenuator", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block COMBUSTOR = new BlockCombustor(Material.ROCK, "combustor", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block COPPER_CELL = new BlockCopperCell(Material.ROCK, "copper_cell", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.4f);
    public static final Block CREATIVE_EMBER_SOURCE = new BlockCreativeEmberSource(Material.ROCK, "creative_ember_source", true).setIsFullCube(true).setIsOpaqueCube(true).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block CRYSTAL_CELL = new BlockCrystalCell(Material.ROCK, "crystal_cell", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block DAWNSTONE_ANVIL = new BlockDawnstoneAnvil(Material.ANVIL, "dawnstone_anvil", true).setHarvestProperties("pickaxe", 1).setIsFullCube(false).setIsOpaqueCube(false).setHardness(1.6f).setLightOpacity(0);
    public static final Block EMBER_ACTIVATOR = new BlockActivator(Material.ROCK, "ember_activator", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block EMBER_BORE = new BlockEmberBore(Material.ROCK, "ember_bore", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static Block EMBER_EMITTER = new BlockEmberEmitter(Material.ROCK, "ember_emitter", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(0.6f);
    public static Block EMBER_FUNNEL = new BlockEmberFunnel(Material.IRON, "ember_funnel", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block EMBER_GAUGE = new BlockEmberGauge(Material.ROCK, "ember_gauge", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block EMBER_INJECTOR = new BlockEmberInjector(Material.ROCK, "ember_injector", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static Block EMBER_PIPE = new BlockEmberPipe(Material.IRON, "ember_pipe", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static Block EMBER_PULSER = new BlockEmberPulser(Material.ROCK, "ember_pulser", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static Block EMBER_RECEIVER = new BlockEmberReceiver(Material.ROCK, "ember_receiver", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(0.6f);
    public static final Block EMBER_RELAY = new BlockRelay(Material.ROCK, "ember_relay", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block EMBER_SIPHON = new BlockEmberSiphon(Material.ROCK, "ember_siphon", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block FIELD_CHART = new BlockFieldChart(Material.ROCK, "field_chart", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block FLUID_DROPPER = new BlockFluidDropper(Material.ROCK, "fluid_dropper", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block FLUID_GAUGE = new BlockFluidGauge(Material.ROCK, "fluid_gauge", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block FLUID_TRANSFER = new BlockFluidTransfer(Material.ROCK, "fluid_transfer", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block GEO_SEPARATOR = new BlockGeoSeparator(Material.IRON, "geo_separator", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block GLOW = new BlockGlow(Material.CIRCUITS, "glow", false).setIsFullCube(false).setIsOpaqueCube(false).setHardness(0.0f).setLightLevel(1.0f);
    public static final Block HEAT_COIL = new BlockHeatCoil(Material.ROCK, "heat_coil", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block INFERNO_FORGE = new BlockInfernoForge(Material.ROCK, "inferno_forge", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block INFERNO_FORGE_EDGE = new BlockInfernoForgeEdge(MaterialRegister.UNPUSHABLE, "inferno_forge_edge", false).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block ITEM_DROPPER = new BlockDropper(Material.ROCK, "item_dropper", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block ITEM_GAUGE = new BlockItemGauge(Material.ROCK, "item_gauge", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block ITEM_PIPE = new BlockItemPipe(Material.ROCK, "item_pipe", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block ITEM_PUMP = new BlockItemExtractor(Material.ROCK, "item_pump", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block ITEM_REQUEST = new BlockItemRequisition(Material.IRON, "item_request", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block ITEM_TRANSFER = new BlockItemTransfer(Material.ROCK, "item_transfer", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block KNOWLEDGE_TABLE = new BlockKnowledgeTable(Material.ROCK, "knowledge_table", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block LARGE_TANK = new BlockLargeTank(Material.ROCK, "large_tank", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block MECHANICAL_PUMP = new BlockPump(Material.ROCK, "mechanical_pump", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block MECH_ACCESSOR = new BlockMechAccessor(Material.ROCK, "mech_accessor", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block MECH_CORE = new BlockMechCore(Material.ROCK, "mech_core", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block MECH_EDGE = new BlockMechEdge(MaterialRegister.UNPUSHABLE, "mech_edge", false).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block MINI_BOILER = new BlockMiniBoiler(Material.IRON, "mini_boiler", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block MIXER = new BlockMixer(Material.ROCK, "mixer", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block ORE_ALUMINUM = new BlockBase(Material.ROCK, "ore_aluminum", true).setIsFullCube(true).setIsOpaqueCube(true).setHarvestProperties("pickaxe", 1).setHardness(1.6f).setLightOpacity(16).setCreativeTab(Embers.resource_tab);
    public static final Block ORE_COPPER = new BlockBase(Material.ROCK, "ore_copper", true).setIsFullCube(true).setIsOpaqueCube(true).setHarvestProperties("pickaxe", 1).setHardness(1.8f).setLightOpacity(16).setCreativeTab(Embers.resource_tab);
    public static final Block ORE_LEAD = new BlockBase(Material.ROCK, "ore_lead", true).setIsFullCube(true).setIsOpaqueCube(true).setHarvestProperties("pickaxe", 2).setHardness(2.5f).setLightOpacity(16).setCreativeTab(Embers.resource_tab);
    public static final Block ORE_NICKEL = new BlockBase(Material.ROCK, "ore_nickel", true).setIsFullCube(true).setIsOpaqueCube(true).setHarvestProperties("pickaxe", 1).setHardness(2.2f).setLightOpacity(16).setCreativeTab(Embers.resource_tab);
    public static final Block ORE_QUARTZ = new BlockQuartzOre(Material.ROCK, "ore_quartz", true).setIsFullCube(true).setIsOpaqueCube(true).setHarvestProperties("pickaxe", 2).setHardness(1.9f).setLightOpacity(16);
    public static final Block ORE_SILVER = new BlockBase(Material.ROCK, "ore_silver", true).setIsFullCube(true).setIsOpaqueCube(true).setHarvestProperties("pickaxe", 2).setHardness(2.5f).setLightOpacity(16).setCreativeTab(Embers.resource_tab);
    public static final Block ORE_TIN = new BlockBase(Material.ROCK, "ore_tin", true).setIsFullCube(true).setIsOpaqueCube(true).setHarvestProperties("pickaxe", 1).setHardness(1.3f).setLightOpacity(16).setCreativeTab(Embers.resource_tab);
    public static final Block PIPE = new BlockFluidPipe(Material.ROCK, "pipe", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block PUMP = new BlockFluidExtractor(Material.ROCK, "pump", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block REACTION_CHAMBER = new BlockReactionChamber(Material.IRON, "reaction_chamber", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block REACTOR = new BlockReactor(Material.ROCK, "reactor", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block SEALED_PLANKS = new BlockBase(Material.WOOD, "sealed_planks", true).setIsFullCube(true).setIsOpaqueCube(true).setHarvestProperties("axe", -1).setHardness(2.5f).setLightOpacity(16);
    @Deprecated
    public static final Block SEED = new BlockSeed(Material.ROCK, "seed", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block SEED_ALCHEMIC = Util.createSimpleSeed(Material.ROCK, "seed_alchemic", new ResourceLocation(Embers.MODID, "textures/blocks/material_alchemic.png"), (tile, i) -> new ItemStack(Item.getByNameOrId(ConfigSeed.SEED_ALCHEMIC.drop)));
    public static final Block SEED_ALUMINUM = Util.createSimpleSeed(Material.ROCK, "seed_aluminum", new ResourceLocation(Embers.MODID, "textures/blocks/material_aluminum.png"), (tile, i) -> new ItemStack(Item.getByNameOrId(ConfigSeed.SEED_ALUMINUM.drop)));
    public static final Block SEED_COPPER = Util.createSimpleSeed(Material.ROCK, "seed_copper", new ResourceLocation(Embers.MODID, "textures/blocks/material_copper.png"), (tile, i) -> new ItemStack(Item.getByNameOrId(ConfigSeed.SEED_COPPER.drop)));
    public static final Block SEED_DAWNSTONE = Util.createSimpleSeed(Material.ROCK, "seed_dawnstone", new ResourceLocation(Embers.MODID, "textures/blocks/material_dawnstone.png"), (tile, i) -> new ItemStack(Item.getByNameOrId(ConfigSeed.SEED_DAWNSTONE.drop)));
    public static final Block SEED_GOLD = Util.createSimpleSeed(Material.ROCK, "seed_gold", new ResourceLocation(Embers.MODID, "textures/blocks/material_gold.png"), (tile, i) -> new ItemStack(Item.getByNameOrId(ConfigSeed.SEED_GOLD.drop)));
    public static final Block SEED_IRON = Util.createSimpleSeed(Material.ROCK, "seed_iron", new ResourceLocation(Embers.MODID, "textures/blocks/material_iron.png"), (tile, i) -> new ItemStack(Item.getByNameOrId(ConfigSeed.SEED_IRON.drop)));
    public static final Block SEED_LEAD = Util.createSimpleSeed(Material.ROCK, "seed_lead", new ResourceLocation(Embers.MODID, "textures/blocks/material_lead.png"), (tile, i) -> new ItemStack(Item.getByNameOrId(ConfigSeed.SEED_LEAD.drop)));
    public static final Block SEED_MITHRIL = Util.createSimpleSeed(Material.ROCK, "seed_mithril", new ResourceLocation(Embers.MODID, "textures/blocks/material_mithril.png"), (tile, i) -> new ItemStack(Item.getByNameOrId(ConfigSeed.SEED_MITHRIL.drop)));
    public static final Block SEED_NICKEL = Util.createSimpleSeed(Material.ROCK, "seed_nickel", new ResourceLocation(Embers.MODID, "textures/blocks/material_nickel.png"), (tile, i) -> new ItemStack(Item.getByNameOrId(ConfigSeed.SEED_NICKEL.drop)));
    public static final Block SEED_SILVER = Util.createSimpleSeed(Material.ROCK, "seed_silver", new ResourceLocation(Embers.MODID, "textures/blocks/material_silver.png"), (tile, i) -> new ItemStack(Item.getByNameOrId(ConfigSeed.SEED_SILVER.drop)));
    public static final Block SEED_TIN = Util.createSimpleSeed(Material.ROCK, "seed_tin", new ResourceLocation(Embers.MODID, "textures/blocks/material_tin.png"), (tile, i) -> new ItemStack(Item.getByNameOrId(ConfigSeed.SEED_TIN.drop)));
    public static final Block STAIRS_ASHEN_BRICK = new BlockStairsBase(ASHEN_BRICK.getDefaultState(), "stairs_ashen_brick", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f).setLightOpacity(16);
    public static final Block STAIRS_ASHEN_STONE = new BlockStairsBase(ASHEN_STONE.getDefaultState(), "stairs_ashen_stone", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f).setLightOpacity(16);
    public static final Block STAIRS_ASHEN_TILE = (new BlockStairsBase(ASHEN_TILE.getDefaultState(), "stairs_ashen_tile", true)).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f).setLightOpacity(16);
    public static final Block STAIRS_CAMINITE_BRICK = new BlockStairsBase(BLOCK_CAMINITE_BRICK.getDefaultState(), "stairs_caminite_brick", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f).setLightOpacity(16);
    public static final Block STAMPER = new BlockStamper(Material.ROCK, "stamper", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block STAMP_BASE = new BlockStampBase(Material.ROCK, "stamper_base", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block STIRLING = new BlockStirling(Material.ROCK, "stirling", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block STONE_EDGE = new BlockStoneEdge(MaterialRegister.UNPUSHABLE, "stone_edge", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block STONE_VALVE = new BlockStoneValve(MaterialRegister.UNPUSHABLE, "stone_valve", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block STRUCTURE_MARKER = new BlockStructureMarker().setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block TURRET = new BlockTurret(Material.IRON, "turret", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block VACUUM = new BlockVacuum(Material.ROCK, "vacuum", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block WALL_ASHEN_BRICK = new BlockWallBase(ASHEN_BRICK, "wall_ashen_brick", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block WALL_ASHEN_STONE = new BlockWallBase(ASHEN_STONE, "wall_ashen_stone", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block WALL_ASHEN_TILE = (new BlockWallBase(ASHEN_TILE, "wall_ashen_tile", true)).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block WALL_CAMINITE_BRICK = new BlockWallBase(BLOCK_CAMINITE_BRICK, "wall_caminite_brick", true).setIsFullCube(false).setIsOpaqueCube(false).setHarvestProperties("pickaxe", 0).setHardness(1.6f);
    public static final Block WRAPPED_SEALED_PLANKS = (new BlockBase(Material.WOOD, "wrapped_sealed_planks", true)).setIsFullCube(true).setIsOpaqueCube(true).setHarvestProperties("axe", -1).setHardness(3.1f).setLightOpacity(16);

    private final static List<Block> REGISTRY = new ArrayList<>(Arrays.asList(
            ADVANCED_EDGE,
            ALCHEMY_PEDESTAL,
            ALCHEMY_TABLET,
            ARCHAIC_BRICKS,
            ARCHAIC_EDGE,
            ARCHAIC_LIGHT,
            ARCHAIC_MECH_EDGE,
            ARCHAIC_TILE,
            ASHEN_BRICK,
            ASHEN_BRICK_SLAB,
            ASHEN_BRICK_SLAB_DOUBLE,
            ASHEN_STONE,
            ASHEN_STONE_SLAB,
            ASHEN_STONE_SLAB_DOUBLE,
            ASHEN_TILE,
            ASHEN_TILE_SLAB,
            ASHEN_TILE_SLAB_DOUBLE,
            AUTO_HAMMER,
            BEAM_CANNON,
            BEAM_SPLITTER,
            BIN,
            BLOCK_ALCHEMICAL_REDSTONE,
            BLOCK_CAMINITE_BRICK,
            BLOCK_CAMINITE_BRICK_SLAB,
            BLOCK_CAMINITE_BRICK_SLAB_DOUBLE,
            BLOCK_CAMINITE_LARGE_BRICK,
            BLOCK_FURNACE,
            BLOCK_LANTERN,
            BLOCK_MOLTEN_ALUMINUM,
            BLOCK_MOLTEN_BRONZE,
            BLOCK_MOLTEN_COPPER,
            BLOCK_MOLTEN_DAWNSTONE,
            BLOCK_MOLTEN_ELECTRUM,
            BLOCK_MOLTEN_GOLD,
            BLOCK_MOLTEN_IRON,
            BLOCK_MOLTEN_LEAD,
            BLOCK_MOLTEN_NICKEL,
            BLOCK_MOLTEN_SILVER,
            BLOCK_MOLTEN_TIN,
            BLOCK_FLUID_STEAM,
            BLOCK_FLUID_CRUDE_OIL,
            BLOCK_FLUID_OIL,
            BLOCK_FLUID_GAS,
            BLOCK_TANK,
            BOILER,
            BREAKER,
            CAMINITE_LEVER,
            CATALYTIC_PLUG,
            CATALYZER,
            CINDER_PLINTH,
            CLOCKWORK_ATTENUATOR,
            COMBUSTOR,
            COPPER_CELL,
            CREATIVE_EMBER_SOURCE,
            CRYSTAL_CELL,
            DAWNSTONE_ANVIL,
            EMBER_ACTIVATOR,
            EMBER_BORE,
            EMBER_GAUGE,
            EMBER_INJECTOR,
            EMBER_RELAY,
            EMBER_SIPHON,
            FIELD_CHART,
            FLUID_DROPPER,
            FLUID_GAUGE,
            FLUID_TRANSFER,
            GEO_SEPARATOR,
            GLOW,
            HEAT_COIL,
            INFERNO_FORGE,
            INFERNO_FORGE_EDGE,
            ITEM_DROPPER,
            ITEM_GAUGE,
            ITEM_PIPE,
            ITEM_PUMP,
            ITEM_REQUEST,
            ITEM_TRANSFER,
            LARGE_TANK,
            MECHANICAL_PUMP,
            MECH_ACCESSOR,
            MECH_CORE,
            MECH_EDGE,
            MINI_BOILER,
            MIXER,
            ORE_QUARTZ,
            PIPE,
            PUMP,
            REACTION_CHAMBER,
            REACTOR,
            SEALED_PLANKS,
            STAIRS_ASHEN_BRICK,
            STAIRS_ASHEN_STONE,
            STAIRS_ASHEN_TILE,
            STAIRS_CAMINITE_BRICK,
            STAMPER,
            STAMP_BASE,
            STIRLING,
            STONE_EDGE,
            STONE_VALVE,
            STRUCTURE_MARKER,
            TURRET,
            VACUUM,
            WALL_ASHEN_BRICK,
            WALL_ASHEN_STONE,
            WALL_ASHEN_TILE,
            WALL_CAMINITE_BRICK,
            WRAPPED_SEALED_PLANKS
    ));

    static {
        if (ConfigMisc.enableWipStuff) {
            REGISTRY.add(ARCHAIC_GEYSIR);
            REGISTRY.add(KNOWLEDGE_TABLE);
            REGISTRY.add(SEED_ALCHEMIC);
        }
        if (ConfigMaterial.ALUMINUM.registerSeed()) {
            REGISTRY.add(SEED_ALUMINUM);
        }
        if (ConfigMaterial.ALUMINUM.mustLoad()) {
            REGISTRY.add(BLOCK_ALUMINUM);
            REGISTRY.add(ORE_ALUMINUM);
        }
        if (ConfigMaterial.ASTRALITE.mustLoad()) {
            REGISTRY.add(BLOCK_ASTRALITE);
        }
        if (ConfigMaterial.BRONZE.mustLoad()) {
            REGISTRY.add(BLOCK_BRONZE);
        }
        if (ConfigMaterial.COPPER.registerSeed()) {
            REGISTRY.add(SEED_COPPER);
        }
        if (ConfigMaterial.COPPER.mustLoad()) {
            REGISTRY.add(BLOCK_COPPER);
            REGISTRY.add(ORE_COPPER);
        }
        if (ConfigMaterial.DAWNSTONE.registerSeed()) {
            REGISTRY.add(SEED_DAWNSTONE);
        }
        if (ConfigMaterial.DAWNSTONE.mustLoad()) {
            REGISTRY.add(BLOCK_DAWNSTONE);
        }
        if (ConfigMaterial.ELECTRUM.mustLoad()) {
            REGISTRY.add(BLOCK_ELECTRUM);
        }
        if (ConfigMaterial.GOLD.registerSeed()) {
            REGISTRY.add(SEED_GOLD);
        }
        if (ConfigMaterial.IRON.registerSeed()) {
            REGISTRY.add(SEED_IRON);
        }
        if (ConfigMaterial.LEAD.registerSeed()) {
            REGISTRY.add(SEED_LEAD);
        }
        if (ConfigMaterial.LEAD.mustLoad()) {
            REGISTRY.add(BLOCK_LEAD);
            REGISTRY.add(ORE_LEAD);
        }
        if (ConfigMaterial.MITHRIL.registerSeed()) {
            REGISTRY.add(SEED_MITHRIL);
        }
        if (ConfigMaterial.MITHRIL.mustLoad()) {
            REGISTRY.add(BLOCK_MITHRIL);
        }
        if (ConfigMaterial.NICKEL.registerSeed()) {
            REGISTRY.add(SEED_NICKEL);
        }
        if (ConfigMaterial.NICKEL.mustLoad()) {
            REGISTRY.add(BLOCK_NICKEL);
            REGISTRY.add(ORE_NICKEL);
        }
        if (ConfigMaterial.SILVER.registerSeed()) {
            REGISTRY.add(SEED_SILVER);
        }
        if (ConfigMaterial.SILVER.mustLoad()) {
            REGISTRY.add(BLOCK_SILVER);
            REGISTRY.add(ORE_SILVER);
        }
        if (ConfigMaterial.TIN.registerSeed()) {
            REGISTRY.add(SEED_TIN);
        }
        if (ConfigMaterial.TIN.mustLoad()) {
            REGISTRY.add(BLOCK_TIN);
            REGISTRY.add(ORE_TIN);
        }
        if (ConfigMaterial.UMBERSTEEL.mustLoad()) {
            REGISTRY.add(BLOCK_UMBER_STEEL);
        }
        if (!Loader.isModLoaded("embersified") && !Loader.isModLoaded("embersifiedextended")) {
            REGISTRY.add(EMBER_EMITTER);
            REGISTRY.add(EMBER_RECEIVER);
        }
        if (!Loader.isModLoaded("embersifiedextended")) {
            REGISTRY.add(EMBER_FUNNEL);
            REGISTRY.add(EMBER_PULSER);
            REGISTRY.add(CHARGER);
            REGISTRY.add(EMBER_PIPE);
        }

        ((BlockDoubleSlabBase) ASHEN_TILE_SLAB_DOUBLE).setSlab(ASHEN_TILE_SLAB);
        ((BlockDoubleSlabBase) ASHEN_BRICK_SLAB_DOUBLE).setSlab(ASHEN_BRICK_SLAB);
        ((BlockDoubleSlabBase) ASHEN_STONE_SLAB_DOUBLE).setSlab(ASHEN_STONE_SLAB);
        ((BlockDoubleSlabBase) BLOCK_CAMINITE_BRICK_SLAB_DOUBLE).setSlab(BLOCK_CAMINITE_BRICK_SLAB);
    }

    @Override
    public Collection<Block> load() {
        return REGISTRY;
    }

    @Override
    public void register() {
    }

    @Override
    public void add(Block block) {
        REGISTRY.add(block);
    }
}
