# Compatibility
I used Mixins to make Embers Unofficial Extended Life compatible with as many mods as possible, while also fixing a few issues I encountered during my testing. Here is a changelog for the compatibility mixins:

## [Applied Engergistics 2](https://www.curseforge.com/minecraft/mc-mods/ae2-extended-life)
- the Tiny TNT now respects the Explosion Charm

## [Applied Integrations](https://www.curseforge.com/minecraft/mc-mods/applied-integrations)
- redirect all calls from the old `RegistryManager` to `ItemRegiser`

## [Emberforged](https://www.curseforge.com/minecraft/mc-mods/emberforged)
- prior version `2.0.0`
  - redirect all calls from the old `RegistryManager` to `FluidRegister`, `ItemRegiser` and `BlockRegiser`
  - respect my fluid to ingot ratio when creating its recipes
- after version `2.0.0`
  - Emberforged now depends on our Embers fork
  - that means it's now compatible out of the box
- mixins will automatically disable themselves if Emberforged is version `2.0.0` or higher

## [Embers' Construct](https://www.curseforge.com/minecraft/mc-mods/embersconstruct)
- redirect all calls from the old `RegistryManager` to `ItemRegiser` and `BlockRegiser`
- it now uses my config fluid ratios when creating its recipes
- fixed a bug where the Bloom would drop ghost items when broken after processing a recipe
- removed the empty "test" research category in the ancient codex

## [Embersified](https://www.curseforge.com/minecraft/mc-mods/embersified)
- simplified the override methods and unified the recipe registration
- now respects my config options for the emitter and receiver

## [Embersified Extended](https://www.curseforge.com/minecraft/mc-mods/embersified-extended)
- simplified the override methods and unified the recipe registration
- now respects my config options for all blocks

## [Environmental Tech](https://www.curseforge.com/minecraft/mc-mods/environmental-tech)
- added a new modifier that allows any Void Miner to function as Ember Bore
- added config options to tweak the energy consumption of other Environmental Tech modifiers

## [JAOPCA](https://www.curseforge.com/minecraft/mc-mods/jaopca)
- redirect all calls from the old `RegistryManager` to `ItemRegiser`
- it now uses my config fluid ratios when creating its recipes

## [More Climate](https://www.curseforge.com/minecraft/mc-mods/more-climate)
- redirect all calls from the old `RegistryManager` to `BlockRegiser`

## [Mystical Gears](https://www.curseforge.com/minecraft/mc-mods/mystical-gears)
- redirect all calls from the old `RegistryManager` to `ItemRegiser`
- now respects my config options 

## [Mystical Mechanics](https://www.curseforge.com/minecraft/mc-mods/mysticalmechanics)
- most of the compatibility is done on Embers side

## [Ore Stone Variants](https://www.curseforge.com/minecraft/mc-mods/ore-stone-variants)
- hijacked its config system to respect my config options if a metal is disabled

## [Planar Artifice(TC6 Addon)](https://www.curseforge.com/minecraft/mc-mods/planar-artifice)
- redirect all calls from the old `RegistryManager` to `ItemRegiser`

## [Polymancy (TC6 Addon)](https://www.curseforge.com/minecraft/mc-mods/polymancy)
- redirect all calls from the old `RegistryManager` to `ItemRegiser` and `BlockRegiser`

## [Spartan Weaponry Arcana](https://www.curseforge.com/minecraft/mc-mods/spartan-weaponry-arcana-unofficial)
- redirect all calls from the old `RegistryManager` to `ToolMaterialRegister`

## [Survivaltools](https://www.curseforge.com/minecraft/mc-mods/survival-tools)
- redirect all calls from the old `RegistryManager` to `ItemRegiser`
- I only implemented the compatibility for the version v1.0.0 as the author wants to fix the issue himself in the future

## [Thaumic Periphery (TC6 Addon)](https://www.curseforge.com/minecraft/mc-mods/thaumic-periphery)
- redirect all calls from the old `RegistryManager` to `ItemRegiser`
- it now uses my config fluid ratios when creating its recipes

## [Tinkering with Embers](https://www.curseforge.com/minecraft/mc-mods/tinkering-with-embers)
- works out of the box, but I highly recommend using Embers' Construct instead
