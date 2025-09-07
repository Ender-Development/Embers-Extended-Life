package teamroots.embers.register;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import teamroots.embers.Embers;
import teamroots.embers.compat.MysticalMechanicsIntegration;
import teamroots.embers.compat.Util;
import teamroots.embers.config.ConfigMaterial;
import teamroots.embers.config.ConfigMisc;
import teamroots.embers.config.ConfigTool;
import teamroots.embers.item.*;
import teamroots.embers.item.block.ItemBlockSlab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ItemRegister implements IRegistrable<Item> {
    public static final ItemRegister INSTANCE = new ItemRegister();

    private ItemRegister() {
    }

    public static final Item ADHESIVE = new ItemBase("adhesive", true);
    public static final Item ALCHEMIC_CHUNK = new ItemBase("alchemic_chunk", true);
    public static final Item ALCHEMIC_CLUSTER = new ItemBase("alchemic_cluster", true);
    public static final Item ALCHEMIC_MOTE = new ItemBase("alchemic_mote", true);
    public static final Item ALCHEMIC_PIECE = new ItemBase("alchemic_piece", true);
    public static final Item ALCHEMIC_SHARD = new ItemBase("alchemic_shard", true);
    public static final Item ALCHEMIC_WASTE = new ItemAlchemicWaste();
    public static final Item ANCIENT_MOTIVE_CORE = new ItemBase("ancient_motive_core", true);
    public static final Item ANTI_TINKER_LENS = new ItemBase("anti_tinker_lens", true);
    public static final Item ARCHAIC_BRICK = new ItemBase("archaic_brick", true);
    public static final Item ARCHAIC_CIRCUIT = new ItemBase("archaic_circuit", true);
    public static final Item ASHEN_CLOAK_BOOTS = new ItemAshenCloak(ArmorMaterialRegister.ARMOR_MAT_ASHEN_CLOAK, 3, EntityEquipmentSlot.FEET);
    public static final Item ASHEN_CLOAK_CHEST = new ItemAshenCloak(ArmorMaterialRegister.ARMOR_MAT_ASHEN_CLOAK, 7, EntityEquipmentSlot.CHEST);
    public static final Item ASHEN_CLOAK_HEAD = new ItemAshenCloak(ArmorMaterialRegister.ARMOR_MAT_ASHEN_CLOAK, 3, EntityEquipmentSlot.HEAD);
    public static final Item ASHEN_CLOAK_LEGS = new ItemAshenCloak(ArmorMaterialRegister.ARMOR_MAT_ASHEN_CLOAK, 5, EntityEquipmentSlot.LEGS);
    public static final Item ASHEN_CLOTH = new ItemBase("ashen_cloth", true);
    public static final Item ASPECTUS_COPPER = new ItemBase("aspectus_copper", true);
    public static final Item ASPECTUS_DAWNSTONE = new ItemBase("aspectus_dawnstone", true);
    public static final Item ASPECTUS_IRON = new ItemBase("aspectus_iron", true);
    public static final Item ASPECTUS_LEAD = new ItemBase("aspectus_lead", true);
    public static final Item ASPECTUS_SILVER = new ItemBase("aspectus_silver", true);
    public static final Item ASTER = new ItemBase("aster", true);
    public static final Item AXE_ALUMINUM = new ItemAxeBase(ToolMaterialRegister.TOOL_MAT_ALUMINUM, "axe_aluminum", true).setCreativeTab(Embers.resource_tab);
    public static final Item AXE_BRONZE = new ItemAxeBase(ToolMaterialRegister.TOOL_MAT_BRONZE, "axe_bronze", true).setCreativeTab(Embers.resource_tab);
    public static final Item AXE_CLOCKWORK = new ItemClockworkAxe("axe_clockwork", true);
    public static final Item AXE_COPPER = new ItemAxeBase2(ToolMaterialRegister.TOOL_MAT_COPPER, "axe_copper", true, 8.5f, 0.9f).setCreativeTab(Embers.resource_tab);
    public static final Item AXE_DAWNSTONE = new ItemAxeBase2(ToolMaterialRegister.TOOL_MAT_DAWNSTONE, "axe_dawnstone", true, 9.5f, 1f).setCreativeTab(Embers.resource_tab);
    public static final Item AXE_ELECTRUM = new ItemAxeBase(ToolMaterialRegister.TOOL_MAT_ELECTRUM, "axe_electrum", true).setCreativeTab(Embers.resource_tab);
    public static final Item AXE_LEAD = new ItemAxeBase2(ToolMaterialRegister.TOOL_MAT_LEAD, "axe_lead", true, 9f, 0.9f).setCreativeTab(Embers.resource_tab);
    public static final Item AXE_NICKEL = new ItemAxeBase(ToolMaterialRegister.TOOL_MAT_NICKEL, "axe_nickel", true).setCreativeTab(Embers.resource_tab);
    public static final Item AXE_SILVER = new ItemAxeBase2(ToolMaterialRegister.TOOL_MAT_SILVER, "axe_silver", true, 9f, 1.0f).setCreativeTab(Embers.resource_tab);
    public static final Item AXE_TIN = new ItemAxeBase(ToolMaterialRegister.TOOL_MAT_TIN, "axe_tin", true).setCreativeTab(Embers.resource_tab);
    public static final Item BLASTING_CORE = new ItemBase("blasting_core", true);
    public static final Item BLEND_CAMINITE = new ItemBase("blend_caminite", true);
    public static final Item BRICK_CAMINITE = new ItemBase("brick_caminite", true);
    public static final Item BURST_EMITTER = new ItemBase("burst_emitter", true);
    public static final Item CASTER_ORB = new ItemBase("caster_orb", true);
    public static final Item CODEX = new ItemCodex();
    public static final Item CORE_STONE = new ItemBase("core_stone", true);
    public static final Item CREATIVE_HEAT = new ItemHidden("creative_heat");
    public static final Item CRYSTAL_EMBER = new ItemBase("crystal_ember", true);
    public static final Item CRYSTAL_LENS = new ItemBase("crystal_lens", true);
    public static final Item DIFFRACTION_BARREL = new ItemBase("diffraction_barrel", true);
    public static final Item DUST_ASH = new ItemBase("dust_ash", true);
    public static final Item DUST_EMBER = new ItemBase("dust_ember", true);
    public static final Item DUST_METALLURGIC = new ItemMetallurgicDust("dust_metallurgic", true);
    public static final Item ELDRITCH_INSIGNIA = new ItemBase("eldritch_insignia", true);
    public static final Item EMBER_CARTRIDGE = new ItemEmberCartridge();
    public static final Item EMBER_CLUSTER = new ItemBase("ember_cluster", true);
    public static final Item EMBER_DETECTOR = new ItemEmberGauge();
    public static final Item EMBER_JAR = new ItemEmberJar();
    public static final Item EYEPIECE = new ItemBase("eyepiece", true);
    public static final Item FLAME_BARRIER = new ItemBase("flame_barrier", true);
    public static final Item FOCAL_LENS = new ItemBase("focal_lens", true);
    public static final Item FULGURITE = new ItemBase("fulgurite", true);
    public static final Item GLIMMER_LAMP = new ItemGlimmerLamp();
    public static final Item GLIMMER_SHARD = new ItemGlimmerShard();
    public static final Item GOLEMS_EYE = new ItemGolemEye("golems_eye");
    public static final Item GRANDHAMMER = new ItemGrandhammer("grandhammer", true);
    public static final Item HOE_ALUMINUM = new ItemHoeBase(ToolMaterialRegister.TOOL_MAT_ALUMINUM, "hoe_aluminum", true).setCreativeTab(Embers.resource_tab);
    public static final Item HOE_BRONZE = new ItemHoeBase(ToolMaterialRegister.TOOL_MAT_BRONZE, "hoe_bronze", true).setCreativeTab(Embers.resource_tab);
    public static final Item HOE_COPPER = new ItemHoeBase(ToolMaterialRegister.TOOL_MAT_COPPER, "hoe_copper", true).setCreativeTab(Embers.resource_tab);
    public static final Item HOE_DAWNSTONE = new ItemHoeBase(ToolMaterialRegister.TOOL_MAT_DAWNSTONE, "hoe_dawnstone", true).setCreativeTab(Embers.resource_tab);
    public static final Item HOE_ELECTRUM = new ItemHoeBase(ToolMaterialRegister.TOOL_MAT_ELECTRUM, "hoe_electrum", true).setCreativeTab(Embers.resource_tab);
    public static final Item HOE_LEAD = new ItemHoeBase(ToolMaterialRegister.TOOL_MAT_LEAD, "hoe_lead", true).setCreativeTab(Embers.resource_tab);
    public static final Item HOE_NICKEL = new ItemHoeBase(ToolMaterialRegister.TOOL_MAT_NICKEL, "hoe_nickel", true).setCreativeTab(Embers.resource_tab);
    public static final Item HOE_SILVER = new ItemHoeBase(ToolMaterialRegister.TOOL_MAT_SILVER, "hoe_silver", true).setCreativeTab(Embers.resource_tab);
    public static final Item HOE_TIN = new ItemHoeBase(ToolMaterialRegister.TOOL_MAT_TIN, "hoe_tin", true).setCreativeTab(Embers.resource_tab);
    public static final Item IGNITION_CANNON = new ItemIgnitionCannon();
    public static final Item INFLICTOR_GEM = new ItemInflictorGem();
    public static final Item INGOT_ALUMINUM = new ItemBase("ingot_aluminum", true).setCreativeTab(Embers.resource_tab);
    public static final Item INGOT_ASTRALITE = new ItemBase("ingot_astralite", true).setCreativeTab(Embers.resource_tab);
    public static final Item INGOT_BRONZE = new ItemBase("ingot_bronze", true).setCreativeTab(Embers.resource_tab);
    public static final Item INGOT_COPPER = new ItemBase("ingot_copper", true).setCreativeTab(Embers.resource_tab);
    public static final Item INGOT_DAWNSTONE = new ItemBase("ingot_dawnstone", true).setCreativeTab(Embers.resource_tab);
    public static final Item INGOT_ELECTRUM = new ItemBase("ingot_electrum", true).setCreativeTab(Embers.resource_tab);
    public static final Item INGOT_LEAD = new ItemBase("ingot_lead", true).setCreativeTab(Embers.resource_tab);
    public static final Item INGOT_MITHRIL = new ItemBase("ingot_mithril", true).setCreativeTab(Embers.resource_tab);
    public static final Item INGOT_NICKEL = new ItemBase("ingot_nickel", true).setCreativeTab(Embers.resource_tab);
    public static final Item INGOT_SILVER = new ItemBase("ingot_silver", true).setCreativeTab(Embers.resource_tab);
    public static final Item INGOT_TIN = new ItemBase("ingot_tin", true).setCreativeTab(Embers.resource_tab);
    public static final Item INGOT_UMBER_STEEL = new ItemBase("ingot_umber_steel", true).setCreativeTab(Embers.resource_tab);
    public static final Item INTELLIGENT_APPARATUS = new ItemBase("intelligent_apparatus", true);
    public static final Item INTELLIGENT_EYE = new ItemBase("intelligent_eye", true);
    public static final Item ISOLATED_MATERIA = new ItemBase("isolated_materia", true);
    public static final Item JET_AUGMENT = new ItemBase("jet_augment", true);
    public static final Item KARMA_CHARM = new ItemBase("karma_charm", true);
    public static final Item MASS_CALDERA = new ItemBase("mass_caldera", true);
    public static final Item NUGGET_ALUMINUM = new ItemBase("nugget_aluminum", true).setCreativeTab(Embers.resource_tab);
    public static final Item NUGGET_ASTRALITE = new ItemBase("nugget_astralite", true).setCreativeTab(Embers.resource_tab);
    public static final Item NUGGET_BRONZE = new ItemBase("nugget_bronze", true).setCreativeTab(Embers.resource_tab);
    public static final Item NUGGET_COPPER = new ItemBase("nugget_copper", true).setCreativeTab(Embers.resource_tab);
    public static final Item NUGGET_DAWNSTONE = new ItemBase("nugget_dawnstone", true).setCreativeTab(Embers.resource_tab);
    public static final Item NUGGET_ELECTRUM = new ItemBase("nugget_electrum", true).setCreativeTab(Embers.resource_tab);
    public static final Item NUGGET_LEAD = new ItemBase("nugget_lead", true).setCreativeTab(Embers.resource_tab);
    public static final Item NUGGET_MITHRIL = new ItemBase("nugget_mithril", true).setCreativeTab(Embers.resource_tab);
    public static final Item NUGGET_NICKEL = new ItemBase("nugget_nickel", true).setCreativeTab(Embers.resource_tab);
    public static final Item NUGGET_SILVER = new ItemBase("nugget_silver", true).setCreativeTab(Embers.resource_tab);
    public static final Item NUGGET_TIN = new ItemBase("nugget_tin", true).setCreativeTab(Embers.resource_tab);
    public static final Item NUGGET_UMBER_STEEL = new ItemBase("nugget_umber_steel", true).setCreativeTab(Embers.resource_tab);
    public static final Item PICKAXE_ALUMINUM = new ItemPickaxeBase(ToolMaterialRegister.TOOL_MAT_ALUMINUM, "pickaxe_aluminum", true).setCreativeTab(Embers.resource_tab);
    public static final Item PICKAXE_BRONZE = new ItemPickaxeBase(ToolMaterialRegister.TOOL_MAT_BRONZE, "pickaxe_bronze", true).setCreativeTab(Embers.resource_tab);
    public static final Item PICKAXE_CLOCKWORK = new ItemClockworkPickaxe("pickaxe_clockwork", true);
    public static final Item PICKAXE_COPPER = new ItemPickaxeBase(ToolMaterialRegister.TOOL_MAT_COPPER, "pickaxe_copper", true).setCreativeTab(Embers.resource_tab);
    public static final Item PICKAXE_DAWNSTONE = new ItemPickaxeBase(ToolMaterialRegister.TOOL_MAT_DAWNSTONE, "pickaxe_dawnstone", true).setCreativeTab(Embers.resource_tab);
    public static final Item PICKAXE_ELECTRUM = new ItemPickaxeBase(ToolMaterialRegister.TOOL_MAT_ELECTRUM, "pickaxe_electrum", true).setCreativeTab(Embers.resource_tab);
    public static final Item PICKAXE_LEAD = new ItemPickaxeBase(ToolMaterialRegister.TOOL_MAT_LEAD, "pickaxe_lead", true).setCreativeTab(Embers.resource_tab);
    public static final Item PICKAXE_NICKEL = new ItemPickaxeBase(ToolMaterialRegister.TOOL_MAT_NICKEL, "pickaxe_nickel", true).setCreativeTab(Embers.resource_tab);
    public static final Item PICKAXE_SILVER = new ItemPickaxeBase(ToolMaterialRegister.TOOL_MAT_SILVER, "pickaxe_silver", true).setCreativeTab(Embers.resource_tab);
    public static final Item PICKAXE_TIN = new ItemPickaxeBase(ToolMaterialRegister.TOOL_MAT_TIN, "pickaxe_tin", true).setCreativeTab(Embers.resource_tab);
    public static final Item PLATE_ALUMINUM = new ItemBase("plate_aluminum", true).setCreativeTab(Embers.resource_tab);
    public static final Item PLATE_ASTRALITE = new ItemBase("plate_astralite", true).setCreativeTab(Embers.resource_tab);
    public static final Item PLATE_BRONZE = new ItemBase("plate_bronze", true).setCreativeTab(Embers.resource_tab);
    public static final Item PLATE_CAMINITE = new ItemBase("plate_caminite", true);
    public static final Item PLATE_CAMINITE_RAW = new ItemBase("plate_caminite_raw", true);
    public static final Item PLATE_COPPER = new ItemBase("plate_copper", true).setCreativeTab(Embers.resource_tab);
    public static final Item PLATE_DAWNSTONE = new ItemBase("plate_dawnstone", true).setCreativeTab(Embers.resource_tab);
    public static final Item PLATE_ELECTRUM = new ItemBase("plate_electrum", true).setCreativeTab(Embers.resource_tab);
    public static final Item PLATE_GOLD = new ItemBase("plate_gold", true).setCreativeTab(Embers.resource_tab);
    public static final Item PLATE_IRON = new ItemBase("plate_iron", true).setCreativeTab(Embers.resource_tab);
    public static final Item PLATE_LEAD = new ItemBase("plate_lead", true).setCreativeTab(Embers.resource_tab);
    public static final Item PLATE_MITHRIL = new ItemBase("plate_mithril", true).setCreativeTab(Embers.resource_tab);
    public static final Item PLATE_NICKEL = new ItemBase("plate_nickel", true).setCreativeTab(Embers.resource_tab);
    public static final Item PLATE_SILVER = new ItemBase("plate_silver", true).setCreativeTab(Embers.resource_tab);
    public static final Item PLATE_TIN = new ItemBase("plate_tin", true).setCreativeTab(Embers.resource_tab);
    public static final Item PLATE_UMBER_STEEL = new ItemBase("plate_umber_steel", true).setCreativeTab(Embers.resource_tab);
    public static final Item RESONATING_BELL = new ItemBase("resonating_bell", true);
    public static final Item SHARD_ASTER = new ItemBase("shard_aster", true);
    public static final Item SHARD_EMBER = new ItemBase("shard_ember", true);
    public static final Item SHIFTING_SCALES = new ItemBase("shifting_scales", true);
    public static final Item SHOVEL_ALUMINUM = new ItemShovelBase(ToolMaterialRegister.TOOL_MAT_ALUMINUM, "shovel_aluminum", true).setCreativeTab(Embers.resource_tab);
    public static final Item SHOVEL_BRONZE = new ItemShovelBase(ToolMaterialRegister.TOOL_MAT_BRONZE, "shovel_bronze", true).setCreativeTab(Embers.resource_tab);
    public static final Item SHOVEL_COPPER = new ItemShovelBase(ToolMaterialRegister.TOOL_MAT_COPPER, "shovel_copper", true).setCreativeTab(Embers.resource_tab);
    public static final Item SHOVEL_DAWNSTONE = new ItemShovelBase(ToolMaterialRegister.TOOL_MAT_DAWNSTONE, "shovel_dawnstone", true).setCreativeTab(Embers.resource_tab);
    public static final Item SHOVEL_ELECTRUM = new ItemShovelBase(ToolMaterialRegister.TOOL_MAT_ELECTRUM, "shovel_electrum", true).setCreativeTab(Embers.resource_tab);
    public static final Item SHOVEL_LEAD = new ItemShovelBase(ToolMaterialRegister.TOOL_MAT_LEAD, "shovel_lead", true).setCreativeTab(Embers.resource_tab);
    public static final Item SHOVEL_NICKEL = new ItemShovelBase(ToolMaterialRegister.TOOL_MAT_NICKEL, "shovel_nickel", true).setCreativeTab(Embers.resource_tab);
    public static final Item SHOVEL_SILVER = new ItemShovelBase(ToolMaterialRegister.TOOL_MAT_SILVER, "shovel_silver", true).setCreativeTab(Embers.resource_tab);
    public static final Item SHOVEL_TIN = new ItemShovelBase(ToolMaterialRegister.TOOL_MAT_TIN, "shovel_tin", true).setCreativeTab(Embers.resource_tab);
    public static final Item SIGIL_CROSS = new ItemBase("sigil_cross", true);
    public static final Item SIGIL_EMPTY = new ItemBase("sigil_empty", true);
    public static final Item SIGIL_EXPLOSION = new ItemBase("sigil_explosion", true);
    public static final Item SIGIL_EYE = new ItemBase("sigil_eye", true);
    public static final Item SIGIL_FORK = new ItemBase("sigil_fork", true);
    public static final Item SIGIL_HOME = new ItemBase("sigil_home", true);
    public static final Item SIGIL_RING = new ItemBase("sigil_ring", true);
    public static final Item SIGIL_SKULL = new ItemBase("sigil_skull", true);
    public static final Item SIGIL_SUN = new ItemBase("sigil_sun", true);
    public static final Item SILVER_EYE_CLOSED = new ItemBase("silver_eye_closed", true);
    public static final Item SILVER_EYE_OPEN = new ItemBase("silver_eye_open", true);
    public static final Item SPARK_PLUG = new ItemBase("spark_plug", true);
    public static final Item STAFF_EMBER = new ItemCinderStaff();
    public static final Item STAMP_BAR = new ItemBase("stamp_bar", true);
    public static final Item STAMP_BAR_RAW = new ItemBase("stamp_bar_raw", true);
    public static final Item STAMP_FLAT = new ItemBase("stamp_flat", true);
    public static final Item STAMP_FLAT_RAW = new ItemBase("stamp_flat_raw", true);
    public static final Item STAMP_GEAR = new ItemBase("stamp_gear", true);
    public static final Item STAMP_GEAR_RAW = new ItemBase("stamp_gear_raw", true);
    public static final Item STAMP_PLATE = new ItemBase("stamp_plate", true);
    public static final Item STAMP_PLATE_RAW = new ItemBase("stamp_plate_raw", true);
    public static final Item STAMP_ROD = new ItemBase("stamp_rod", true);
    public static final Item STAMP_ROD_RAW = new ItemBase("stamp_rod_raw", true);
    public static final Item STAMP_ROUND = new ItemBase("stamp_round", true);
    public static final Item STAMP_ROUND_RAW = new ItemBase("stamp_round_raw", true);
    public static final Item SULFUR_DUST = new ItemBase("sulfur_dust", true);
    public static final Item SUPERHEATER = new ItemBase("superheater", true);
    public static final Item SWORD_ALUMINUM = new ItemSwordBase(ToolMaterialRegister.TOOL_MAT_ALUMINUM, "sword_aluminum", true).setCreativeTab(Embers.resource_tab);
    public static final Item SWORD_BRONZE = new ItemSwordBase(ToolMaterialRegister.TOOL_MAT_BRONZE, "sword_bronze", true).setCreativeTab(Embers.resource_tab);
    public static final Item SWORD_COPPER = new ItemSwordBase(ToolMaterialRegister.TOOL_MAT_COPPER, "sword_copper", true).setCreativeTab(Embers.resource_tab);
    public static final Item SWORD_DAWNSTONE = new ItemSwordBase(ToolMaterialRegister.TOOL_MAT_DAWNSTONE, "sword_dawnstone", true).setCreativeTab(Embers.resource_tab);
    public static final Item SWORD_ELECTRUM = new ItemSwordBase(ToolMaterialRegister.TOOL_MAT_ELECTRUM, "sword_electrum", true).setCreativeTab(Embers.resource_tab);
    public static final Item SWORD_LEAD = new ItemSwordBase(ToolMaterialRegister.TOOL_MAT_LEAD, "sword_lead", true).setCreativeTab(Embers.resource_tab);
    public static final Item SWORD_NICKEL = new ItemSwordBase(ToolMaterialRegister.TOOL_MAT_NICKEL, "sword_nickel", true).setCreativeTab(Embers.resource_tab);
    public static final Item SWORD_SILVER = new ItemSwordBase(ToolMaterialRegister.TOOL_MAT_SILVER, "sword_silver", true).setCreativeTab(Embers.resource_tab);
    public static final Item SWORD_TIN = new ItemSwordBase(ToolMaterialRegister.TOOL_MAT_TIN, "sword_tin", true).setCreativeTab(Embers.resource_tab);
    public static final Item TINKER_HAMMER = new ItemTinkerHammer();
    public static final Item TINKER_LENS = new ItemTinkerLens("tinker_lens", true);
    public static final Item TRUEMETAL_CLUMP = new ItemBase("truemetal_clump", true);
    public static final Item TYRFING = new ItemTyrfing(ToolMaterialRegister.TOOL_MAT_TYRFING, "tyrfing", true);
    public static final Item WILDFIRE_CORE = new ItemBase("wildfire_core", true);
    public static final Item WINDING_GEARS = new ItemBase("winding_gears", true);

    private final static List<Item> REGISTRY = new ArrayList<>(Arrays.asList(
            ADHESIVE,
            ALCHEMIC_WASTE,
            ANCIENT_MOTIVE_CORE,
            ANTI_TINKER_LENS,
            ARCHAIC_BRICK,
            ARCHAIC_CIRCUIT,
            ASHEN_CLOAK_BOOTS,
            ASHEN_CLOAK_CHEST,
            ASHEN_CLOAK_HEAD,
            ASHEN_CLOAK_LEGS,
            ASHEN_CLOTH,
            ASPECTUS_COPPER,
            ASPECTUS_DAWNSTONE,
            ASPECTUS_IRON,
            ASPECTUS_LEAD,
            ASPECTUS_SILVER,
            AXE_CLOCKWORK,
            BLASTING_CORE,
            BLEND_CAMINITE,
            BRICK_CAMINITE,
            CASTER_ORB,
            CODEX,
            CREATIVE_HEAT,
            CRYSTAL_EMBER,
            DIFFRACTION_BARREL,
            DUST_ASH,
            DUST_EMBER,
            DUST_METALLURGIC,
            ELDRITCH_INSIGNIA,
            EMBER_CARTRIDGE,
            EMBER_CLUSTER,
            EMBER_DETECTOR,
            EMBER_JAR,
            FLAME_BARRIER,
            FOCAL_LENS,
            GLIMMER_LAMP,
            GLIMMER_SHARD,
            GOLEMS_EYE,
            GRANDHAMMER,
            IGNITION_CANNON,
            INFLICTOR_GEM,
            INTELLIGENT_APPARATUS,
            ISOLATED_MATERIA,
            JET_AUGMENT,
            PICKAXE_CLOCKWORK,
            PLATE_CAMINITE,
            PLATE_CAMINITE_RAW,
            RESONATING_BELL,
            SHARD_EMBER,
            SHIFTING_SCALES,
            SPARK_PLUG,
            STAFF_EMBER,
            STAMP_BAR,
            STAMP_BAR_RAW,
            STAMP_FLAT,
            STAMP_FLAT_RAW,
            STAMP_GEAR,
            STAMP_GEAR_RAW,
            STAMP_PLATE,
            STAMP_PLATE_RAW,
            STAMP_ROD,
            STAMP_ROD_RAW,
            STAMP_ROUND,
            STAMP_ROUND_RAW,
            SUPERHEATER,
            TINKER_HAMMER,
            TINKER_LENS,
            WILDFIRE_CORE,
            WINDING_GEARS
    ));

    static {
        if (ConfigTool.METAL_TOOL.TYRFING.register) {
            REGISTRY.add(TYRFING);
        }
        if (ConfigMaterial.ALUMINUM.mustLoad()) {
            if (ConfigTool.METAL_TOOL.ALUMINUM.register) {
                REGISTRY.add(PICKAXE_ALUMINUM);
                REGISTRY.add(AXE_ALUMINUM);
                REGISTRY.add(SHOVEL_ALUMINUM);
                REGISTRY.add(SWORD_ALUMINUM);
                REGISTRY.add(HOE_ALUMINUM);
            }
            REGISTRY.add(INGOT_ALUMINUM);
            REGISTRY.add(PLATE_ALUMINUM);
            REGISTRY.add(NUGGET_ALUMINUM);
        }
        if (ConfigMaterial.ASTRALITE.isNotOff()) {
            REGISTRY.add(INGOT_ASTRALITE);
            REGISTRY.add(PLATE_ASTRALITE);
            REGISTRY.add(NUGGET_ASTRALITE);
        }
        if (ConfigMaterial.BRONZE.mustLoad()) {
            if (ConfigTool.METAL_TOOL.BRONZE.register) {
                REGISTRY.add(PICKAXE_BRONZE);
                REGISTRY.add(AXE_BRONZE);
                REGISTRY.add(SHOVEL_BRONZE);
                REGISTRY.add(SWORD_BRONZE);
                REGISTRY.add(HOE_BRONZE);
            }
            REGISTRY.add(INGOT_BRONZE);
            REGISTRY.add(PLATE_BRONZE);
            REGISTRY.add(NUGGET_BRONZE);
        }
        if (ConfigMaterial.COPPER.mustLoad()) {
            if (ConfigTool.METAL_TOOL.COPPER.register) {
                REGISTRY.add(PICKAXE_COPPER);
                REGISTRY.add(AXE_COPPER);
                REGISTRY.add(SHOVEL_COPPER);
                REGISTRY.add(HOE_COPPER);
                REGISTRY.add(SWORD_COPPER);
            }
            REGISTRY.add(INGOT_COPPER);
            REGISTRY.add(NUGGET_COPPER);
            REGISTRY.add(PLATE_COPPER);
        }
        if (ConfigMaterial.DAWNSTONE.mustLoad()) {
            if (ConfigTool.METAL_TOOL.DAWNSTONE.register) {
                REGISTRY.add(PICKAXE_DAWNSTONE);
                REGISTRY.add(AXE_DAWNSTONE);
                REGISTRY.add(SHOVEL_DAWNSTONE);
                REGISTRY.add(HOE_DAWNSTONE);
                REGISTRY.add(SWORD_DAWNSTONE);
            }
            REGISTRY.add(INGOT_DAWNSTONE);
            REGISTRY.add(NUGGET_DAWNSTONE);
            REGISTRY.add(PLATE_DAWNSTONE);
        }
        if (ConfigMaterial.ELECTRUM.mustLoad()) {
            if (ConfigTool.METAL_TOOL.ELECTRUM.register) {
                REGISTRY.add(PICKAXE_ELECTRUM);
                REGISTRY.add(AXE_ELECTRUM);
                REGISTRY.add(SHOVEL_ELECTRUM);
                REGISTRY.add(SWORD_ELECTRUM);
                REGISTRY.add(HOE_ELECTRUM);
            }
            REGISTRY.add(INGOT_ELECTRUM);
            REGISTRY.add(PLATE_ELECTRUM);
            REGISTRY.add(NUGGET_ELECTRUM);
        }
        if (ConfigMaterial.GOLD.mustLoad()) {
            REGISTRY.add(PLATE_GOLD);
        }
        if (ConfigMaterial.IRON.mustLoad()) {
            REGISTRY.add(PLATE_IRON);
        }
        if (ConfigMaterial.LEAD.mustLoad()) {
            if (ConfigTool.METAL_TOOL.LEAD.register) {
                REGISTRY.add(PICKAXE_LEAD);
                REGISTRY.add(AXE_LEAD);
                REGISTRY.add(SHOVEL_LEAD);
                REGISTRY.add(HOE_LEAD);
                REGISTRY.add(SWORD_LEAD);
            }
            REGISTRY.add(INGOT_LEAD);
            REGISTRY.add(NUGGET_LEAD);
            REGISTRY.add(PLATE_LEAD);
        }
        if (ConfigMaterial.MITHRIL.isNotOff()) {
            REGISTRY.add(INGOT_MITHRIL);
            REGISTRY.add(NUGGET_MITHRIL);
            REGISTRY.add(PLATE_MITHRIL);
        }
        if (ConfigMaterial.NICKEL.mustLoad()) {
            if (ConfigTool.METAL_TOOL.NICKEL.register) {
                REGISTRY.add(PICKAXE_NICKEL);
                REGISTRY.add(AXE_NICKEL);
                REGISTRY.add(SHOVEL_NICKEL);
                REGISTRY.add(SWORD_NICKEL);
                REGISTRY.add(HOE_NICKEL);
            }
            REGISTRY.add(INGOT_NICKEL);
            REGISTRY.add(PLATE_NICKEL);
            REGISTRY.add(NUGGET_NICKEL);
        }
        if (ConfigMaterial.SILVER.mustLoad()) {
            if (ConfigTool.METAL_TOOL.SILVER.register) {
                REGISTRY.add(PICKAXE_SILVER);
                REGISTRY.add(AXE_SILVER);
                REGISTRY.add(SHOVEL_SILVER);
                REGISTRY.add(HOE_SILVER);
                REGISTRY.add(SWORD_SILVER);
            }
            REGISTRY.add(INGOT_SILVER);
            REGISTRY.add(NUGGET_SILVER);
            REGISTRY.add(PLATE_SILVER);
        }
        if (ConfigMaterial.UMBERSTEEL.isNotOff()) {
            REGISTRY.add(INGOT_UMBER_STEEL);
            REGISTRY.add(PLATE_UMBER_STEEL);
            REGISTRY.add(NUGGET_UMBER_STEEL);
        }
        if (ConfigMaterial.TIN.mustLoad()) {
            if (ConfigTool.METAL_TOOL.TIN.register) {
                REGISTRY.add(PICKAXE_TIN);
                REGISTRY.add(AXE_TIN);
                REGISTRY.add(SHOVEL_TIN);
                REGISTRY.add(SWORD_TIN);
                REGISTRY.add(HOE_TIN);
            }
            REGISTRY.add(INGOT_TIN);
            REGISTRY.add(PLATE_TIN);
            REGISTRY.add(NUGGET_TIN);
        }
        if (ConfigMisc.enableWipStuff) {
            REGISTRY.add(ALCHEMIC_CHUNK);
            REGISTRY.add(ALCHEMIC_CLUSTER);
            REGISTRY.add(ALCHEMIC_MOTE);
            REGISTRY.add(ALCHEMIC_PIECE);
            REGISTRY.add(ALCHEMIC_SHARD);
            REGISTRY.add(ASTER);
            REGISTRY.add(BURST_EMITTER);
            REGISTRY.add(CORE_STONE);
            REGISTRY.add(CRYSTAL_LENS);
            REGISTRY.add(EYEPIECE);
            REGISTRY.add(FULGURITE);
            REGISTRY.add(INTELLIGENT_EYE);
            REGISTRY.add(KARMA_CHARM);
            REGISTRY.add(MASS_CALDERA);
            REGISTRY.add(SHARD_ASTER);
            REGISTRY.add(SIGIL_CROSS);
            REGISTRY.add(SIGIL_EMPTY);
            REGISTRY.add(SIGIL_EXPLOSION);
            REGISTRY.add(SIGIL_EYE);
            REGISTRY.add(SIGIL_FORK);
            REGISTRY.add(SIGIL_HOME);
            REGISTRY.add(SIGIL_RING);
            REGISTRY.add(SIGIL_SKULL);
            REGISTRY.add(SIGIL_SUN);
            REGISTRY.add(SILVER_EYE_CLOSED);
            REGISTRY.add(SILVER_EYE_OPEN);
            REGISTRY.add(SULFUR_DUST);
            REGISTRY.add(TRUEMETAL_CLUMP);
        }
        REGISTRY.add(new ItemBlockSlab(BlockRegister.BLOCK_CAMINITE_BRICK_SLAB, BlockRegister.BLOCK_CAMINITE_BRICK_SLAB_DOUBLE));
        REGISTRY.add(new ItemBlockSlab(BlockRegister.ASHEN_STONE_SLAB, BlockRegister.ASHEN_STONE_SLAB_DOUBLE));
        REGISTRY.add(new ItemBlockSlab(BlockRegister.ASHEN_BRICK_SLAB, BlockRegister.ASHEN_BRICK_SLAB_DOUBLE));
        REGISTRY.add(new ItemBlockSlab(BlockRegister.ASHEN_TILE_SLAB, BlockRegister.ASHEN_TILE_SLAB_DOUBLE));
    }

    @Override
    public Collection<Item> load() {
        return REGISTRY;
    }

    @Override
    public void register() {
    }

    @Override
    public void add(Item item) {
        REGISTRY.add(item);
    }
}
