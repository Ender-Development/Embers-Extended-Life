package teamroots.embers.config;

import net.minecraftforge.common.config.Config;
import teamroots.embers.Embers;
import teamroots.embers.config.machine.*;

@Config(modid = Embers.MODID, category = "machine", name = Embers.CFG_FOLDER + "machine")
@Config.LangKey("cfg.embers.machine")
public class ConfigMachine {

    @Config.Name("Beam Cannon")
    @Config.LangKey("cfg.embers.machine.beam_cannon")
    @Config.Comment("Options about the Beam Cannon")
    public static final BeamCanonCategory BEAM_CANNON = new BeamCanonCategory();

    @Config.Name("Catalytic Plug")
    @Config.LangKey("cfg.embers.machine.catalytic_plug")
    @Config.Comment("Options about the Catalytic Plug")
    public static final CatalyticPlugCategory CATALYTIC_PLUG = new CatalyticPlugCategory();

    @Config.Name("Catalyzer")
    @Config.LangKey("cfg.embers.machine.catalyzer")
    @Config.Comment("Options about the Catalyzer")
    public static final CatalyzerCategory CATALYZER = new CatalyzerCategory();

    @Config.Name("Charger")
    @Config.LangKey("cfg.embers.machine.charger")
    @Config.Comment("Options about the Charger")
    public static final ChargerCategory CHARGER = new ChargerCategory();

    @Config.Name("Cinder Plinth")
    @Config.LangKey("cfg.embers.machine.cinder_plinth")
    @Config.Comment("Options about the Cinder Plinth")
    public static final CinderPlinthCategory CINDER_PLINTH = new CinderPlinthCategory();

    @Config.Name("Combustor")
    @Config.LangKey("cfg.embers.machine.combustor")
    @Config.Comment("Options about the Combustor")
    public static final CombustorCategory COMBUSTOR = new CombustorCategory();

    @Config.Name("Copper Cell")
    @Config.LangKey("cfg.embers.machine.copper_cell")
    @Config.Comment("Options about the Copper Cell")
    public static final CopperCellCategory COPPER_CELL = new CopperCellCategory();

    @Config.Name("Creative Ember Source")
    @Config.LangKey("cfg.embers.machine.creative_ember_source")
    @Config.Comment("Options about the Copper Cell")
    public static final CreativeEmberSourceCategory CREATIVE_EMBER_SOURCE = new CreativeEmberSourceCategory();

    @Config.Name("Crystal Cell")
    @Config.LangKey("cfg.embers.machine.crystal_cell")
    @Config.Comment("Options about the Crystal Cell")
    public static final CrystalCellCategory CRYSTAL_CELL = new CrystalCellCategory();

    @Config.Name("Dawnstone Anvil")
    @Config.LangKey("cfg.embers.machine.dawnstone_anvil")
    @Config.Comment("Options about the Dawnstone Anvil")
    public static final DawnStoneAnvilCategory DAWNSTONE_ANVIL = new DawnStoneAnvilCategory();

    @Config.Name("Ember Activator")
    @Config.LangKey("cfg.embers.machine.activator")
    @Config.Comment("Options about the Ember Activator")
    public static final ActivatorCategory ACTIVATOR = new ActivatorCategory();

    @Config.Name("Ember Bore")
    @Config.LangKey("cfg.embers.machine.ember_bore")
    @Config.Comment("Options about the Ember Bore")
    public static final EmberBoreCategory EMBER_BORE = new EmberBoreCategory();

    @Config.Name("Ember Conduit")
    @Config.LangKey("cfg.embers.machine.ember_conduit")
    @Config.Comment("Options about the Ember Conduit")
    public static final EmberConduitCategory EMBER_CONDUIT = new EmberConduitCategory();

    @Config.Name("Ember Ejector")
    @Config.LangKey("cfg.embers.machine.pulser")
    @Config.Comment("Options about the Ember Ejector")
    public static final EjectorCategory EJECTOR = new EjectorCategory();

    @Config.Name("Ember Emitter")
    @Config.LangKey("cfg.embers.machine.emitter")
    @Config.Comment("Options about the Emitter")
    public static final EmitterCategory EMITTER = new EmitterCategory();

    @Config.Name("Ember Funnel")
    @Config.LangKey("cfg.embers.machine.ember_funnel")
    @Config.Comment("Options about the Ember Funnel")
    public static final EmberFunnelCategory EMBER_FUNNEL = new EmberFunnelCategory();

    @Config.Name("Ember Receiver")
    @Config.LangKey("cfg.embers.machine.receiver")
    @Config.Comment("Options about the Receiver")
    public static final ReceiverCategory RECEIVER = new ReceiverCategory();

    @Config.Name("Fluid Vessel")
    @Config.LangKey("cfg.embers.machine.tank")
    @Config.Comment("Options about the Fluid Vessel")
    public static final TankCategory TANK = new TankCategory();

    @Config.Name("Geo Separator")
    @Config.LangKey("cfg.embers.machine.geo_separator")
    @Config.Comment("Options about the Geo Separator")
    public static final GeoSeparatorCategory GEO_SEPARATOR = new GeoSeparatorCategory();

    @Config.Name("Hearth Coil")
    @Config.LangKey("cfg.embers.machine.heat_coil")
    @Config.Comment("Options about the Hearth Coil")
    public static final HeatCoilCategory HEAT_COIL = new HeatCoilCategory();

    @Config.Name("Ignem Reactor")
    @Config.LangKey("cfg.embers.machine.reactor")
    @Config.Comment("Options about the Ignem Reactor")
    public static final IgnemReactorCategory REACTOR = new IgnemReactorCategory();

    @Config.Name("Inferno Forge")
    @Config.LangKey("cfg.embers.machine.inferno_forge")
    @Config.Comment("Options about the Inferno Forge")
    public static final InfernoForgeCategory INFERNO_FORGE = new InfernoForgeCategory();

    @Config.Name("Melter")
    @Config.LangKey("cfg.embers.machine.melter")
    @Config.Comment("Options about the Melter")
    public static final MelterCategory MELTER = new MelterCategory();

    @Config.Name("Mini Boiler")
    @Config.LangKey("cfg.embers.machine.mini_boiler")
    @Config.Comment("Options about the Mini Boiler")
    public static final MiniBoilerCategory MINI_BOILER = new MiniBoilerCategory();

    @Config.Name("Mixer Centrifuge")
    @Config.LangKey("cfg.embers.machine.mixer")
    @Config.Comment("Options about the Mixer Centrifuge")
    public static final MixerCategory MIXER = new MixerCategory();

    @Config.Name("Pressure Refinery")
    @Config.LangKey("cfg.embers.machine.boiler")
    @Config.Comment("Options about the Pressure Refinery")
    public static final BoilerCategory BOILER = new BoilerCategory();

    @Config.Name("Reaction Chamber")
    @Config.LangKey("cfg.embers.machine.reaction_chamber")
    @Config.Comment("Options about the Reaction Chamber")
    public static final ReactionChamberCategory REACTION_CHAMBER = new ReactionChamberCategory();

    @Config.Name("Reservoir")
    @Config.LangKey("cfg.embers.machine.reservoir")
    @Config.Comment("Options about the Reservoir")
    public static final ReservoirCategory RESERVOIR = new ReservoirCategory();

    @Config.Name("Stamper")
    @Config.LangKey("cfg.embers.machine.stamper")
    @Config.Comment("Options about the Stamper")
    public static final StamperCategory STAMPER = new StamperCategory();

    @Config.Name("Steam Engine [MM]")
    @Config.LangKey("cfg.embers.machine.steam_engine")
    @Config.Comment({
            "Requires Mystical Mechanics!",
            "Options about the Steam Engine"
    })
    public static final SteamEngineCategory STEAM_ENGINE = new SteamEngineCategory();

    @Config.Name("Pump")
    @Config.LangKey("cfg.embers.machine.pump")
    @Config.Comment("Options about the Pump")
    public static final PumpCategory PUMP = new PumpCategory();
}
