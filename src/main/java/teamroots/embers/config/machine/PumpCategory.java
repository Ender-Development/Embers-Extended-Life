package teamroots.embers.config.machine;

import net.minecraftforge.common.config.Config;

public class PumpCategory {
    @Config.RequiresMcRestart
    @Config.Name("Ember Cost")
    @Config.Comment("The ember cost per tick")
    public double emberCost = 0.5;

    @Config.RequiresMcRestart
    @Config.Name("Capacity")
    @Config.Comment("How much fluid (in mb) fits into the pump?")
    public int capacity = 1000;

    @Config.RequiresMcRestart
    @Config.Name("Free Fluids")
    @Config.Comment("Which fluids can be pumped without requiring ember?")
    public String[] freeFluids = new String[]{"water"};
}
