package teamroots.embers.config.compat;

import net.minecraftforge.common.config.Config;

public class ThaumcraftCategory {

    @Config.RequiresMcRestart
    @Config.Name("Enable Thaumcraft Integration")
    @Config.Comment("If true, Embers will register items, blocks and recipes providing Thaumcraft integration.")
    public boolean enableThaumcraftIntegration = true;

    @Config.Name("Ember Multiplier")
    @Config.Comment({
            "Multiplier for the amount of ember consumed when casting with an Ember Caster.",
            "Default is 7.0 times the default vis consumption.",
    })
    public double emberMultiplier = 7.0;
}
