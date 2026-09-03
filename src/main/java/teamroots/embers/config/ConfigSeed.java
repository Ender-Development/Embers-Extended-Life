package teamroots.embers.config;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Config;
import teamroots.embers.Embers;
import teamroots.embers.Tags;

@Config(modid = Embers.MODID, category = "seed", name = Embers.CFG_FOLDER + "seed")
@Config.LangKey("cfg.embers.seed")
public class ConfigSeed {
    @Config.Name("Alchemic Seed")
    @Config.LangKey("cfg.embers.seed.alchemic")
    @Config.Comment("Options for Alchemic Seeds")
    public static final Seed SEED_ALCHEMIC = new Seed("alchemic_piece");

    @Config.Name("Aluminum Seed")
    @Config.LangKey("cfg.embers.seed.aluminum")
    @Config.Comment("Options for Aluminum Seeds")
    public static final Seed SEED_ALUMINUM = new Seed("nugget_aluminum");

    @Config.Name("Copper Seed")
    @Config.LangKey("cfg.embers.seed.copper")
    @Config.Comment("Options for Copper Seeds")
    public static final Seed SEED_COPPER = new Seed("nugget_copper");

    @Config.Name("Dawnstone Seed")
    @Config.LangKey("cfg.embers.seed.dawnstone")
    @Config.Comment("Options for Dawnstone Seeds")
    public static final Seed SEED_DAWNSTONE = new Seed("nugget_dawnstone");

    @Config.Name("Gold Seed")
    @Config.LangKey("cfg.embers.seed.gold")
    @Config.Comment("Options for Gold Seeds")
    public static final Seed SEED_GOLD = new Seed(Items.GOLD_NUGGET);

    @Config.Name("Iron Seed")
    @Config.LangKey("cfg.embers.seed.iron")
    @Config.Comment("Options for Iron Seeds")
    public static final Seed SEED_IRON = new Seed(Items.IRON_NUGGET);

    @Config.Name("Lead Seed")
    @Config.LangKey("cfg.embers.seed.lead")
    @Config.Comment("Options for Lead Seeds")
    public static final Seed SEED_LEAD = new Seed("nugget_lead");

    @Config.Name("Mithril Seed")
    @Config.LangKey("cfg.embers.seed.mithril")
    @Config.Comment("Options for Mithril Seeds")
    public static final Seed SEED_MITHRIL = new Seed("nugget_mithril");

    @Config.Name("Nickel Seed")
    @Config.LangKey("cfg.embers.seed.nickel")
    @Config.Comment("Options for Nickel Seeds")
    public static final Seed SEED_NICKEL = new Seed("nugget_nickel");

    @Config.Name("Silver Seed")
    @Config.LangKey("cfg.embers.seed.silver")
    @Config.Comment("Options for Silver Seeds")
    public static final Seed SEED_SILVER = new Seed("nugget_silver");

    @Config.Name("Tin Seed")
    @Config.LangKey("cfg.embers.seed.tin")
    @Config.Comment("Options for Tin Seeds")
    public static final Seed SEED_TIN = new Seed("nugget_tin");

    public static class Seed {
        @Config.Name("Drop")
        @Config.Comment({
                "The item dropped from the seed. If modid isn't defined, we default to embers.",
                "Format: modid:itemname#meta"
        })
        public String drop;

        private Seed(String drop) {
            this.drop = drop;
        }

        private Seed(Item drop) {
            this.drop = drop.getRegistryName().toString();
        }

        public ItemStack getDrop(){
            String[] splitMeta = drop.split("#");
            int meta = 0;
            if (splitMeta.length == 2)
                meta = Integer.parseInt(splitMeta[1]);
            String[] splitMod = splitMeta[0].split(":");
            String mod = splitMod[0];
            if (splitMod.length == 1)
                mod = Tags.MOD_ID +  ":" + splitMod[0];

            return new ItemStack(Item.getByNameOrId(mod), meta);
        }
    }
}
