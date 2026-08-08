package teamroots.embers.compat;

import net.minecraftforge.fml.common.Loader;
import teamroots.embers.config.ConfigCompat;

public final class Util {
    private Util(){}

    public static boolean isBaublesIntegrationEnabled() {
        return ConfigCompat.enableBaublesIntegration && Loader.isModLoaded("baubles");
    }

    public static boolean isMysticalMechanicsIntegrationEnabled() {
        return ConfigCompat.enableMysticalMechanicsIntegration && Loader.isModLoaded("mysticalmechanics");
    }

    public static boolean isEnderIOIntegrationEnabled() {
        return ConfigCompat.enableEnderIOIntegration && Loader.isModLoaded("enderio");
    }

    public static boolean isEnvironmentalTechIntegrationEnabled() {
        return ConfigCompat.enableEnvironmentalTechIntegration && Loader.isModLoaded("environmentaltech");
    }

    public static boolean isTinkersIntegrationEnabled() {
        return ConfigCompat.enableTinkersIntegration && Loader.isModLoaded("tconstruct");
    }

    public static boolean isThaumcraftIntegrationEnabled() {
        return ConfigCompat.THAUMCRAFT.enableThaumcraftIntegration && Loader.isModLoaded("thaumcraft");
    }
}
