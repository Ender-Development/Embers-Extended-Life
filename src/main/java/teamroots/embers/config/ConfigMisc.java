package teamroots.embers.config;

import net.minecraftforge.common.config.Config;
import teamroots.embers.Embers;

@Config(modid = Embers.MODID, category = "misc", name = Embers.CFG_FOLDER + "misc")
@Config.LangKey("cfg.embers.misc")
public class ConfigMisc {
    @Config.Name("Metal Coefficient")
    @Config.Comment({
            "Tweak the coefficient of blocks used for the Ember Refinery.",
            "Attention! The given oreDict must contain a block!",
            "Format: [oreDict];[coefficient]",
            "Example: blockIron;1.0"
    })
    public static String[] block_coefficient = {
            "blockGold;1.0",
            "blockSilver;1.0",
            "blockCopper;1.0",
            "blockElectrum;1.0",
            "blockAluminum;0.9",
            "blockNickel;0.9",
            "blockTin;0.9",
            "blockIron;0.75",
            "blockLead;0.75",
            "blockBronze;0.75"
    };

    @Config.Name("Ember Fuel")
    @Config.Comment({
            "Tweak the fuel value of various items to create ember energy.",
            "Format: [modname]:[registryName];[fuelValue]",
            "Example: embers:shard_ember;400"
    })
    public static String[] ember_fuel = {
            "embers:dust_ember;0",
            "embers:shard_ember;400",
            "embers:crystal_ember;2400",
            "embers:ember_cluster;3600",
    };
    @Config.Name("Everybody is considered an Enemy")
    @Config.Comment("If true, Embers homing projectiles will go for neutral players.")
    public static boolean pvpEverybodyIsEnemy = false;

    @Config.RequiresMcRestart
    @Config.Name("Should categories be locked by default?")
    @Config.Comment("Codex category is shut. Progression is open.")
    public static boolean codexCategoryIsProgress = true;

    @Config.RequiresMcRestart
    @Config.Name("Should entries be hidden by default?")
    @Config.Comment("Codex entry is shut and hidden. Progression is open and shown.")
    public static boolean codexEntryIsProgress = true;

    @Config.RequiresMcRestart
    @Config.Name("Enable WIP stuff.")
    @Config.Comment("Enable and register a few WIP things that were never fully implemented.")
    public static boolean enableWipStuff = false;

    @Config.RequiresMcRestart
    @Config.Name("Block to Fluid ratio")
    @Config.Comment("What is the liquid equivalent to a block in mb?")
    public static int blockFluidAmount = 1296;

    @Config.RequiresMcRestart
    @Config.Name("Ingot to Fluid ratio")
    @Config.Comment("What is the liquid equivalent to an ingot in mb?")
    public static int ingotFluidAmount = 144;

    @Config.RequiresMcRestart
    @Config.Name("Nugget to Fluid ratio")
    @Config.Comment("What is the liquid equivalent to a nugget in mb?")
    public static int nuggetFluidAmount = 16;

    @Config.Name("Inflictor Gems can only be applied to cloaks")
    @Config.Comment("If true, inflictor gems can only be applied to cloaks. If false, they can be applied to any armor piece.")
    public static boolean inflictorGemsOnlyCloaks = false;
}
