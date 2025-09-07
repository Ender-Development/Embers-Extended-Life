// mods.embers.alchemy.removeAll()
mods.embers.alchemy.recipeBuilder()
    .input(
            item('minefantasyreforged:plate').withNbt(['mf_custom_materials': ['main_material': 'dawnstone']]),
            item('minefantasyreforged:plate').withNbt(['mf_custom_materials': ['main_material': 'iron']])
    )
    .output(item('minecraft:anvil'))
    .setAspect('dawnstone', 1, 3)
    .register()

mods.embers.melter.recipeBuilder()
    .input(item('minefantasyreforged:bar').withNbt(['mf_custom_materials': ['main_material': 'dawnstone']]))
    .fluidOutput(fluid('dawnstone') * 144)
    .register()

mods.embers.melter.recipeBuilder()
    .input(item('minefantasyreforged:bar').withNbt(['mf_custom_materials': ['main_material': 'pig_iron']]))
    .fluidOutput(fluid('pig_iron') * 144)
    .register()