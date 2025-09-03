package teamroots.embers.config.mob;

import net.minecraftforge.common.config.Config;

public class EmberGolemCategory {
    @Config.RequiresMcRestart
    @Config.Name("Spawn Weight")
    @Config.Comment("Spawning weight of the Ancient Golem mob. Higher values make golems spawn more frequently.")
    public int spawnWeight = 25;

    @Config.RequiresMcRestart
    @Config.Name("Knockback Resistance")
    @Config.Comment("How much knockback resistance Ancient Golems have.")
    public double knockbackResistance = 1.0;

    @Config.RequiresMcRestart
    @Config.Name("Follow Range")
    @Config.Comment("How much follow range Ancient Golems have.")
    public double followRange = 32.0;

    @Config.RequiresMcRestart
    @Config.Name("Movement Speed")
    @Config.Comment("How much movement speed Ancient Golems have.")
    public double movementSpeed = 0.5;

    @Config.RequiresMcRestart
    @Config.Name("Attack Damage")
    @Config.Comment("How much attack damage Ancient Golems have.")
    public double attackDamage = 6.0;

    @Config.RequiresMcRestart
    @Config.Name("Max Health")
    @Config.Comment("How much health Golems have.")
    public double maxHealth = 40.0;

    @Config.RequiresMcRestart
    @Config.Name("Enable Building")
    @Config.Comment("Whether Ancient Golems can be build.")
    public boolean enableBuilding = true;

    @Config.RequiresMcRestart
    @Config.Name("Enable Wild Spawning")
    @Config.Comment("Whether Ancient Golems can spawn naturally in the world.")
    public boolean enableSpawning = true;
}
