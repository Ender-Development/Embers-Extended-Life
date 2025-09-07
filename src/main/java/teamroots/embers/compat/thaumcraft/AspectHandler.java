package teamroots.embers.compat.thaumcraft;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import teamroots.embers.compat.Util;
import teamroots.embers.register.BlockRegister;
import teamroots.embers.register.ItemRegister;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectEventProxy;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.aspects.AspectRegistryEvent;

public class AspectHandler {
    @SubscribeEvent(priority = EventPriority.LOW)
    public static void onAspectRegistryEvent(AspectRegistryEvent event) {
        registerAspects(event.register);
    }

    //Special thanks to Mangoose for writing all of this.
    private static void registerAspects(AspectEventProxy register) {
        registerOreAspects(register);
        registerItemAspects(register);
        registerBlockAspects(register);

        //No equivalent with new api
        ThaumcraftApi.registerEntityTag("ancient_golem", new AspectList().add(Aspect.MECHANISM, 20).add(Aspect.MOTION, 5).add(Aspect.EARTH, 15).add(Aspect.ALCHEMY, 5));

        if (Util.isThaumicPeripheryIntegrationEnabled()) {
            register.registerComplexObjectTag(new ItemStack(ThaumcraftIntegration.EMBER_CASTER, 1, 0), (new AspectList()).add(Aspect.MAGIC, 5).add(Aspect.METAL, 5).add(Aspect.FIRE, 5));
            if (Util.isThaumicAugmentationIntegrationEnabled()) {
                register.registerComplexObjectTag(new ItemStack(ThaumcraftIntegration.TIERED_EMBER_CASTER, 1, 0), (new AspectList()).add(Aspect.MAGIC, 8));
                register.registerComplexObjectTag(new ItemStack(ThaumcraftIntegration.TIERED_EMBER_CASTER, 1, 1), (new AspectList()).add(Aspect.ELDRITCH, 27).add(Aspect.VOID, 23));
            }
        }
    }

    private static void registerItemAspects(AspectEventProxy register) {
        register.registerObjectTag(new ItemStack(ItemRegister.BRICK_CAMINITE), new AspectList().add(Aspect.EARTH, 2).add(Aspect.WATER, 1).add(Aspect.FIRE, 1));
        register.registerObjectTag(new ItemStack(ItemRegister.PLATE_CAMINITE), new AspectList().add(Aspect.EARTH, 3).add(Aspect.WATER, 1).add(Aspect.FIRE, 1));
        register.registerComplexObjectTag(new ItemStack(ItemRegister.TINKER_HAMMER), new AspectList().add(Aspect.TOOL, 10));
        register.registerObjectTag(new ItemStack(ItemRegister.STAMP_BAR), new AspectList().add(Aspect.EARTH, 6).add(Aspect.WATER, 3).add(Aspect.FIRE, 1).add(Aspect.CRAFT, 5));
        register.registerObjectTag(new ItemStack(ItemRegister.STAMP_FLAT), new AspectList().add(Aspect.EARTH, 12).add(Aspect.WATER, 6).add(Aspect.FIRE, 1).add(Aspect.CRAFT, 5));
        register.registerObjectTag(new ItemStack(ItemRegister.STAMP_PLATE), new AspectList().add(Aspect.EARTH, 6).add(Aspect.WATER, 3).add(Aspect.FIRE, 1).add(Aspect.CRAFT, 5));
        register.registerComplexObjectTag(new ItemStack(ItemRegister.EMBER_DETECTOR), new AspectList().add(Aspect.MECHANISM, 10));
        register.registerObjectTag(new ItemStack(ItemRegister.DUST_EMBER), new AspectList().add(Aspect.FIRE, 15).add(Aspect.ENERGY, 15).add(Aspect.ENTROPY, 5));
        register.registerObjectTag(new ItemStack(ItemRegister.SHARD_EMBER), new AspectList().add(Aspect.FIRE, 3).add(Aspect.ENERGY, 3).add(Aspect.CRYSTAL, 3));
        register.registerObjectTag(new ItemStack(ItemRegister.CRYSTAL_EMBER), new AspectList().add(Aspect.FIRE, 18).add(Aspect.ENERGY, 18).add(Aspect.CRYSTAL, 10));
        register.registerComplexObjectTag(new ItemStack(ItemRegister.EMBER_JAR), new AspectList().add(Aspect.VOID, 5));
        register.registerComplexObjectTag(new ItemStack(ItemRegister.EMBER_CARTRIDGE), new AspectList().add(Aspect.VOID, 10));
        register.registerComplexObjectTag(new ItemStack(ItemRegister.IGNITION_CANNON), new AspectList().add(Aspect.AVERSION, 15));
        register.registerComplexObjectTag(new ItemStack(ItemRegister.STAFF_EMBER), new AspectList().add(Aspect.AVERSION, 15));
        register.registerComplexObjectTag(new ItemStack(ItemRegister.PICKAXE_CLOCKWORK), new AspectList().add(Aspect.MECHANISM, 15));
        register.registerComplexObjectTag(new ItemStack(ItemRegister.GRANDHAMMER), new AspectList().add(Aspect.AVERSION, 8));
        register.registerObjectTag(new ItemStack(ItemRegister.DUST_ASH), new AspectList().add(Aspect.ENTROPY, 5).add(Aspect.FIRE, 3));
        register.registerObjectTag(new ItemStack(ItemRegister.ASPECTUS_IRON), new AspectList().add(Aspect.METAL, 15).add(Aspect.ALCHEMY, 10));
        register.registerObjectTag(new ItemStack(ItemRegister.ASPECTUS_COPPER), new AspectList().add(Aspect.METAL, 10).add(Aspect.EXCHANGE, 5).add(Aspect.ALCHEMY, 10));
        register.registerObjectTag(new ItemStack(ItemRegister.ASPECTUS_LEAD), new AspectList().add(Aspect.METAL, 10).add(Aspect.ORDER, 5).add(Aspect.ALCHEMY, 10));
        register.registerObjectTag(new ItemStack(ItemRegister.ASPECTUS_SILVER), new AspectList().add(Aspect.METAL, 10).add(Aspect.DESIRE, 5).add(Aspect.ALCHEMY, 10));
        register.registerObjectTag(new ItemStack(ItemRegister.ASPECTUS_DAWNSTONE), new AspectList().add(Aspect.METAL, 10).add(Aspect.MECHANISM, 5).add(Aspect.FIRE, 5).add(Aspect.ALCHEMY, 10));
        register.registerObjectTag(new ItemStack(ItemRegister.ALCHEMIC_WASTE), new AspectList().add(Aspect.ENTROPY, 7).add(Aspect.ALCHEMY, 5));
        register.registerObjectTag(new ItemStack(ItemRegister.INFLICTOR_GEM), new AspectList().add(Aspect.PROTECT, 15).add(Aspect.CRYSTAL, 15).add(Aspect.METAL, 7).add(Aspect.ALCHEMY, 2));
        register.registerObjectTag(new ItemStack(ItemRegister.GLIMMER_SHARD), new AspectList().add(Aspect.LIGHT, 25).add(Aspect.CRYSTAL, 15).add(Aspect.FIRE, 10).add(Aspect.ENERGY, 10).add(Aspect.ALCHEMY, 5));
        register.registerObjectTag(new ItemStack(ItemRegister.ASHEN_CLOTH), new AspectList().add(Aspect.ENTROPY, 4).add(Aspect.FIRE, 3).add(Aspect.CRAFT, 5).add(Aspect.BEAST, 7).add(Aspect.ALCHEMY, 1));
        register.registerObjectTag(new ItemStack(ItemRegister.ARCHAIC_BRICK), new AspectList().add(Aspect.EARTH, 3).add(Aspect.DARKNESS, 1).add(Aspect.ORDER, 1));
        register.registerObjectTag(new ItemStack(ItemRegister.ANCIENT_MOTIVE_CORE), new AspectList().add(Aspect.MIND, 10).add(Aspect.SOUL, 5).add(Aspect.ELDRITCH, 3).add(Aspect.ALCHEMY, 2));
        register.registerObjectTag(new ItemStack(ItemRegister.ISOLATED_MATERIA), new AspectList().add(Aspect.ALCHEMY, 15).add(Aspect.EXCHANGE, 10).add(Aspect.CRAFT, 10).add(Aspect.ORDER, 15));
        register.registerComplexObjectTag(new ItemStack(ItemRegister.TYRFING), new AspectList().add(Aspect.METAL, 26).add(Aspect.FIRE, 54).add(Aspect.ENERGY, 50).add(Aspect.ORDER, 4).add(Aspect.ALCHEMY, 6));
        register.registerObjectTag(new ItemStack(ItemRegister.ADHESIVE), new AspectList().add(Aspect.WATER, 5).add(Aspect.CRAFT, 5).add(Aspect.ALCHEMY, 2));
        register.registerObjectTag(new ItemStack(ItemRegister.EMBER_CLUSTER), new AspectList().add(Aspect.FIRE, 27).add(Aspect.ENERGY, 27).add(Aspect.CRYSTAL, 15).add(Aspect.ALCHEMY, 3));
        register.registerObjectTag(new ItemStack(ItemRegister.WILDFIRE_CORE), new AspectList().add(Aspect.METAL, 20).add(Aspect.FIRE, 27).add(Aspect.ENERGY, 20).add(Aspect.CRYSTAL, 11).add(Aspect.ALCHEMY, 5));
        register.registerComplexObjectTag(new ItemStack(ItemRegister.CODEX), new AspectList().add(Aspect.MIND, 10));
        register.registerObjectTag(new ItemStack(ItemRegister.BLASTING_CORE), new AspectList().add(Aspect.METAL, 41).add(Aspect.FIRE, 10).add(Aspect.ENTROPY, 10).add(Aspect.ENERGY, 7).add(Aspect.ALCHEMY, 4));
        register.registerObjectTag(new ItemStack(ItemRegister.FLAME_BARRIER), new AspectList().add(Aspect.FIRE, 24).add(Aspect.METAL, 30).add(Aspect.MECHANISM, 11).add(Aspect.AVERSION, 10).add(Aspect.PROTECT, 10).add(Aspect.ALCHEMY, 2));
        register.registerObjectTag(new ItemStack(ItemRegister.ELDRITCH_INSIGNIA), new AspectList().add(Aspect.DARKNESS, 3).add(Aspect.ELDRITCH, 5).add(Aspect.EARTH, 11).add(Aspect.PROTECT, 15).add(Aspect.SOUL, 15).add(Aspect.ALCHEMY, 4));
        register.registerObjectTag(new ItemStack(ItemRegister.INTELLIGENT_APPARATUS), new AspectList().add(Aspect.METAL, 33).add(Aspect.MIND, 10).add(Aspect.EXCHANGE, 15).add(Aspect.ORDER, 4).add(Aspect.DESIRE, 7).add(Aspect.ALCHEMY, 3));
        register.registerObjectTag(new ItemStack(ItemRegister.DUST_METALLURGIC), new AspectList().add(Aspect.METAL, 15).add(Aspect.ENTROPY, 5).add(Aspect.ALCHEMY, 5));
    }

    private static void registerOreAspects(AspectEventProxy register) {
        register.registerObjectTag("ingotDawnstone", new AspectList().add(Aspect.METAL, 10).add(Aspect.MECHANISM, 5).add(Aspect.FIRE, 5));
        register.registerObjectTag("ingotAluminum", new AspectList().add(Aspect.METAL, 10).add(Aspect.AIR, 5));
        register.registerObjectTag("ingotElectrum", new AspectList().add(Aspect.METAL, 10).add(Aspect.ENERGY, 5).add(Aspect.DESIRE, 5));
        register.registerObjectTag("ingotNickel", new AspectList().add(Aspect.METAL, 10).add(Aspect.CRAFT, 5));
        register.registerObjectTag("oreAluminum", new AspectList().add(Aspect.EARTH, 5).add(Aspect.METAL, 10).add(Aspect.AIR, 5));
        register.registerObjectTag("oreNickel", new AspectList().add(Aspect.EARTH, 5).add(Aspect.METAL, 10).add(Aspect.CRAFT, 5));
    }

    private static void registerBlockAspects(AspectEventProxy register) {
        register.registerComplexObjectTag(new ItemStack(BlockRegister.BLOCK_TANK), new AspectList().add(Aspect.VOID, 20));
        register.registerComplexObjectTag(new ItemStack(BlockRegister.PIPE), new AspectList().add(Aspect.MOTION, 5));
        register.registerComplexObjectTag(new ItemStack(BlockRegister.PUMP), new AspectList().add(Aspect.MECHANISM, 5).add(Aspect.EXCHANGE, 5));
        register.registerComplexObjectTag(new ItemStack(BlockRegister.COPPER_CELL), new AspectList().add(Aspect.ENERGY, 15));
        register.registerComplexObjectTag(new ItemStack(BlockRegister.ITEM_PIPE), new AspectList().add(Aspect.MOTION, 5));
        register.registerComplexObjectTag(new ItemStack(BlockRegister.ITEM_PUMP), new AspectList().add(Aspect.MECHANISM, 5).add(Aspect.EXCHANGE, 5));
        register.registerComplexObjectTag(new ItemStack(BlockRegister.STAMPER), new AspectList().add(Aspect.MECHANISM, 7).add(Aspect.MOTION, 7));
        register.registerObjectTag(new ItemStack(BlockRegister.EMBER_BORE), new AspectList().add(Aspect.METAL, 117).add(Aspect.MECHANISM, 20).add(Aspect.EARTH, 18).add(Aspect.ORDER, 15).add(Aspect.EXCHANGE, 11).add(Aspect.ENTROPY, 10).add(Aspect.FIRE, 9));
        register.registerComplexObjectTag(new ItemStack(BlockRegister.MECH_ACCESSOR), new AspectList().add(Aspect.MECHANISM, 15).add(Aspect.EXCHANGE, 7));
        register.registerComplexObjectTag(new ItemStack(BlockRegister.MECH_CORE), new AspectList().add(Aspect.MECHANISM, 25).add(Aspect.EXCHANGE, 10).add(Aspect.ORDER, 10));
        register.registerComplexObjectTag(new ItemStack(BlockRegister.HEAT_COIL), new AspectList().add(Aspect.FIRE, 25));
        register.registerComplexObjectTag(new ItemStack(BlockRegister.ITEM_DROPPER), new AspectList().add(Aspect.MECHANISM, 5).add(Aspect.EXCHANGE, 3));
        register.registerComplexObjectTag(new ItemStack(BlockRegister.BLOCK_LANTERN), new AspectList().add(Aspect.LIGHT, 5));
        register.registerComplexObjectTag(new ItemStack(BlockRegister.CHARGER), new AspectList().add(Aspect.ENERGY, 10));
        register.registerObjectTag(new ItemStack(BlockRegister.ASHEN_STONE), new AspectList().add(Aspect.EARTH, 5).add(Aspect.ENTROPY, 2).add(Aspect.FIRE, 1));
        register.registerObjectTag(new ItemStack(BlockRegister.ASHEN_BRICK), new AspectList().add(Aspect.EARTH, 3).add(Aspect.ENTROPY, 1));
        register.registerObjectTag(new ItemStack(BlockRegister.ASHEN_TILE), new AspectList().add(Aspect.EARTH, 3).add(Aspect.ENTROPY, 1));
        register.registerComplexObjectTag(new ItemStack(BlockRegister.ALCHEMY_PEDESTAL), new AspectList().add(Aspect.ALCHEMY, 15));
        register.registerComplexObjectTag(new ItemStack(BlockRegister.ALCHEMY_TABLET), new AspectList().add(Aspect.ALCHEMY, 25).add(Aspect.CRAFT, 15));
        register.registerComplexObjectTag(new ItemStack(BlockRegister.ITEM_TRANSFER), new AspectList().add(Aspect.MECHANISM, 10).add(Aspect.EXCHANGE, 5));
        register.registerComplexObjectTag(new ItemStack(BlockRegister.BEAM_CANNON), new AspectList().add(Aspect.AVERSION, 15));
        register.registerComplexObjectTag(new ItemStack(BlockRegister.ALCHEMY_PEDESTAL), new AspectList().add(Aspect.ALCHEMY, 15));
        register.registerObjectTag(new ItemStack(BlockRegister.ARCHAIC_TILE), new AspectList().add(Aspect.EARTH, 7).add(Aspect.DARKNESS, 2).add(Aspect.ORDER, 2));
        register.registerComplexObjectTag(new ItemStack(BlockRegister.ARCHAIC_LIGHT), new AspectList().add(Aspect.LIGHT, 10));
        register.registerComplexObjectTag(new ItemStack(BlockRegister.AUTO_HAMMER), new AspectList().add(Aspect.MECHANISM, 15).add(Aspect.TOOL, 10));
        register.registerObjectTag(new ItemStack(BlockRegister.SEALED_PLANKS), new AspectList().add(Aspect.PLANT, 3).add(Aspect.ORDER, 1));
        register.registerObjectTag(new ItemStack(BlockRegister.WRAPPED_SEALED_PLANKS), new AspectList().add(Aspect.METAL, 3).add(Aspect.PLANT, 3).add(Aspect.ORDER, 1));
        register.registerComplexObjectTag(new ItemStack(BlockRegister.VACUUM), new AspectList().add(Aspect.VOID, 15).add(Aspect.MECHANISM, 5).add(Aspect.EXCHANGE, 5));
        register.registerComplexObjectTag(new ItemStack(BlockRegister.BREAKER), new AspectList().add(Aspect.ENTROPY, 15).add(Aspect.MECHANISM, 10).add(Aspect.TOOL, 8));
        register.registerObjectTag(new ItemStack(BlockRegister.SEED_IRON), new AspectList().add(Aspect.METAL, 25).add(Aspect.CRYSTAL, 5).add(Aspect.ORDER, 5).add(Aspect.DESIRE, 10));
        register.registerObjectTag(new ItemStack(BlockRegister.SEED_GOLD), new AspectList().add(Aspect.METAL, 20).add(Aspect.CRYSTAL, 5).add(Aspect.ORDER, 5).add(Aspect.DESIRE, 20));
        register.registerObjectTag(new ItemStack(BlockRegister.SEED_COPPER), new AspectList().add(Aspect.METAL, 20).add(Aspect.CRYSTAL, 5).add(Aspect.ORDER, 5).add(Aspect.DESIRE, 10).add(Aspect.EXCHANGE, 5));
        register.registerObjectTag(new ItemStack(BlockRegister.SEED_LEAD), new AspectList().add(Aspect.METAL, 20).add(Aspect.CRYSTAL, 5).add(Aspect.ORDER, 10).add(Aspect.DESIRE, 10));
        register.registerObjectTag(new ItemStack(BlockRegister.SEED_SILVER), new AspectList().add(Aspect.METAL, 20).add(Aspect.CRYSTAL, 5).add(Aspect.ORDER, 5).add(Aspect.DESIRE, 15));
        register.registerObjectTag(new ItemStack(BlockRegister.SEED_ALUMINUM), new AspectList().add(Aspect.METAL, 20).add(Aspect.CRYSTAL, 5).add(Aspect.ORDER, 5).add(Aspect.DESIRE, 10).add(Aspect.AIR, 5));
        register.registerObjectTag(new ItemStack(BlockRegister.SEED_NICKEL), new AspectList().add(Aspect.METAL, 20).add(Aspect.CRYSTAL, 5).add(Aspect.ORDER, 5).add(Aspect.DESIRE, 10).add(Aspect.CRAFT, 5));
        register.registerObjectTag(new ItemStack(BlockRegister.SEED_TIN), new AspectList().add(Aspect.METAL, 20).add(Aspect.CRYSTAL, 10).add(Aspect.ORDER, 5).add(Aspect.DESIRE, 10));
        register.registerObjectTag(new ItemStack(BlockRegister.SEED_DAWNSTONE), new AspectList().add(Aspect.METAL, 20).add(Aspect.CRYSTAL, 5).add(Aspect.ORDER, 5).add(Aspect.MECHANISM, 5).add(Aspect.FIRE, 5));
        register.registerComplexObjectTag(new ItemStack(BlockRegister.FIELD_CHART), new AspectList().add(Aspect.SENSES, 15));
        register.registerComplexObjectTag(new ItemStack(BlockRegister.EMBER_PULSER), new AspectList().add(Aspect.EXCHANGE, 3));
        register.registerObjectTag(new ItemStack(BlockRegister.CAMINITE_LEVER), new AspectList().add(Aspect.EARTH, 2).add(Aspect.MECHANISM, 3));
        register.registerObjectTag(new ItemStack(BlockRegister.CATALYTIC_PLUG), new AspectList().add(Aspect.ENERGY, 50).add(Aspect.METAL, 15).add(Aspect.MOTION, 7).add(Aspect.EXCHANGE, 5).add(Aspect.CRYSTAL, 5).add(Aspect.ALCHEMY, 4));
    }
}
