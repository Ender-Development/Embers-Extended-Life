package teamroots.embers.config.compat;

import net.minecraftforge.common.config.Config;

public class ThaumcraftCategory {

    @Config.RequiresMcRestart
    @Config.Name("Enable Thaumcraft Integration")
    @Config.Comment("If true, Embers will register items, blocks and recipes providing Thaumcraft integration.")
    public boolean enableThaumcraftIntegration = true;

    @Config.RequiresMcRestart
    @Config.Name("Enable Thaumic Periphery Integration")
    @Config.Comment("If true, Embers will register items, blocks and recipes providing Thaumic Periphery integration.")
    public boolean enableThaumicPeripheryIntegration = true;

    @Config.RequiresMcRestart
    @Config.Name("Enable Thaumic Augmentation Integration")
    @Config.Comment({
            "If true, Embers will register items, blocks and recipes providing Thaumic Augmentation integration.",
            "Requires Thaumic Periphery to be enabled and installed as well."
    })
    public boolean enableThaumicAugmentationIntegration = true;

    @Config.Name("Ember Multiplier")
    @Config.Comment({
            "Multiplier for the amount of ember consumed when casting with an Ember Caster.",
            "Default is 7.0 times the default vis consumption.",
    })
    public double emberMultiplier = 7.0;
}
