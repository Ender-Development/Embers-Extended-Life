package teamroots.embers.config.world;

import net.minecraftforge.common.config.Config;

public class SmallRuinCategory {
    @Config.RequiresMcRestart
    @Config.Name("Dimension Blacklist")
    @Config.Comment("A list of all dimension IDs in which Embers small ruin generation is prohibited.")
    public int[] blacklist = new int[]{
            0
    };

    @Config.RequiresMcRestart
    @Config.Name("Is Whitelist?")
    @Config.Comment("Whether the small ruin generation blacklist is a whitelist.")
    public boolean isWhiteList = true;

    @Config.RequiresMcRestart
    @Config.Name("Chance")
    @Config.Comment({
            "Spawning frequency of the small ruin structure.",
            "A value of 0 will prevent spawning altogether."
    })
    public int chance = 5;

    @Config.RequiresMcRestart
    @Config.Name("Contain Golem")
    @Config.Comment("Whether the small ruin structure can contain an Ancient Golem.")
    public boolean containGolem = true;
}
