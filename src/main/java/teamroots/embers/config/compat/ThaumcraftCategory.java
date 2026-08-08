package teamroots.embers.config.compat;

import net.minecraftforge.common.config.Config;

public class ThaumcraftCategory {

    @Config.RequiresMcRestart
    @Config.Name("Enable Thaumcraft Integration")
    @Config.Comment("If true, Embers will register items, blocks and recipes providing Thaumcraft integration.")
    public boolean enableThaumcraftIntegration = true;
}
