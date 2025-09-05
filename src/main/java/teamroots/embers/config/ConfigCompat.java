package teamroots.embers.config;

import net.minecraftforge.common.config.Config;
import teamroots.embers.Embers;
import teamroots.embers.config.compat.EnvironmentalTechCategory;
import teamroots.embers.config.compat.ThaumcraftCategory;

@Config(modid = Embers.MODID, category = "compat", name = Embers.CFG_FOLDER + "compat")
@Config.LangKey("cfg.embers.compat")
public class ConfigCompat {
    @Config.Name("Enable JEI Cheats")
    @Config.Comment({
            "If true, JEI will show the exact amount of Ash needed in an Alchemy recipe.",
            "This currently is without any functionality, but will be used in the future."
    })
    public static boolean enableJeiCheat = false;

    @Config.RequiresMcRestart
    @Config.Name("Enable Baubles Integration")
    @Config.Comment("If true, Embers will register items, blocks and recipes providing Baubles integration.")
    public static boolean enableBaublesIntegration = true;

    @Config.RequiresMcRestart
    @Config.Name("Enable EnderIO Integration")
    @Config.Comment({
            "If true, Embers will register items, blocks and recipes providing EnderIO integration.",
            "Right now this only adds grinding ball recipes if Tinkers' Construct is installed as well."
    })
    public static boolean enableEnderIOIntegration = true;

    @Config.RequiresMcRestart
    @Config.Name("Enable Environmental Tech Integration")
    @Config.Comment({
            "If true, Embers will register items, blocks and recipes providing Environmental Tech integration.",
            "This enabled a new Modifier to allow any Void Miner to access the Ember Bore loot pool."
    })
    public static boolean enableEnvironmentalTechIntegration = true;

    @Config.Name("Environmental Tech")
    @Config.LangKey("cfg.embers.compat.environmental_tech")
    @Config.Comment("Options about the Environmental Tech integration")
    public static final EnvironmentalTechCategory ENVIRONMENTAL_TECH = new EnvironmentalTechCategory();

    @Config.Name("Thaumcraft")
    @Config.LangKey("cfg.embers.compat.thaumcraft")
    @Config.Comment("Options about the Thaumcraft integration")
    public static final ThaumcraftCategory THAUMCRAFT = new ThaumcraftCategory();

    @Config.RequiresMcRestart
    @Config.Name("Enable Mystical Mechanics Integration")
    @Config.Comment("If true, Embers will register items, blocks and recipes providing Mystical Mechanics integration.")
    public static boolean enableMysticalMechanicsIntegration = true;

    @Config.RequiresMcRestart
    @Config.Name("Enable Tinkers' Construct Integration")
    @Config.Comment({
            "If true, Embers will register items, blocks and recipes providing Tinkers' Construct integration.",
            "Right now this only adds grinding ball recipes if EnderIO is installed as well",
            "as it needs to be present to load the required fluids."
    })
    public static boolean enableTinkersIntegration = true;
}
