package teamroots.embers.mixin;

import com.Lenvill.EmberforgedMain;
import com.google.common.collect.ImmutableMap;
import com.invadermonky.survivaltools.SurvivalTools;
import net.minecraftforge.fml.common.Loader;
import thelm.jaopca.JAOPCA;
import zone.rong.mixinbooter.ILateMixinLoader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BooleanSupplier;

public class LateMixin implements ILateMixinLoader {
    private static final Map<String, BooleanSupplier> emberMixins = ImmutableMap.copyOf(new HashMap<String, BooleanSupplier>(){
        {
            put("mixins.embers.aetheriumashenarmor.json", () -> Loader.isModLoaded("aetheriumashenarmor"));
            put("mixins.embers.appliedenergistics2.json", () -> Loader.isModLoaded("appliedenergistics2"));
            put("mixins.embers.appliedintegrations.json", () -> Loader.isModLoaded("appliedintegrations"));
            put("mixins.embers.dynaores.json", () -> Loader.isModLoaded("dynaores"));
            put("mixins.embers.emberforged.json", () -> Loader.isModLoaded("emberforged") && EmberforgedMain.VERSION.split("-")[1].split("\\.")[0].equals("1"));
            put("mixins.embers.embersconstruct.json", () -> Loader.isModLoaded("embersconstruct"));
            put("mixins.embers.embersified.json", () -> Loader.isModLoaded("embersified"));
            put("mixins.embers.embersifiedextended.json", () -> Loader.isModLoaded("embersifiedextended"));
            put("mixins.embers.environmentaltech.json", () -> Loader.isModLoaded("environmentaltech"));
            put("mixins.embers.jaopca.json", () -> Loader.isModLoaded("jaopca"));
            put("mixins.embers.jaopca_legacy.json", () -> Loader.isModLoaded("jaopca"));
            put("mixins.embers.moreclimate.json", () -> Loader.isModLoaded("moreclimate"));
            put("mixins.embers.mystgears.json", () -> Loader.isModLoaded("mystgears"));
            put("mixins.embers.osv.json", () -> Loader.isModLoaded("osv"));
            put("mixins.embers.planarartifice.json", () -> Loader.isModLoaded("planarartifice"));
            put("mixins.embers.polymancy.json", () -> Loader.isModLoaded("polymancy"));
            put("mixins.embers.spartanweaponryarcana.json", () -> Loader.isModLoaded("spartanweaponryarcana"));
            put("mixins.embers.survivaltools.json", () -> Loader.isModLoaded("survivaltools") && SurvivalTools.VERSION.equals("1.12.2-1.0.0"));
            put("mixins.embers.thaumicaugmentation.json", () -> Loader.isModLoaded("thaumicaugmentation"));
            put("mixins.embers.thaumicperiphery.json", () -> Loader.isModLoaded("thaumicperiphery"));
            put("mixins.embers.valkyrielib.json", () -> Loader.isModLoaded("valkyrielib"));
        }
    });

    @Override
    public List<String> getMixinConfigs() {
        return new ArrayList<>(emberMixins.keySet());
    }

    @Override
    public boolean shouldMixinConfigQueue(String config) {
        return emberMixins.get(config).getAsBoolean();
    }
}
