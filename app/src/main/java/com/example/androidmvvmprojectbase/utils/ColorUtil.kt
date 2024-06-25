package com.example.androidmvvmprojectbase.utils

import com.example.androidmvvmprojectbase.R

fun getResourceTypeColor(type: String): Int {
    return when (type) {
        "Bug" -> R.drawable.bg_tv_type_bug
        "Dark" -> R.drawable.bg_tv_type_dark
        "Dragon" -> R.drawable.bg_tv_type_dragon
        "Electric" -> R.drawable.bg_tv_type_electric
        "Fairy" -> R.drawable.bg_tv_type_fairy
        "Fighting" -> R.drawable.bg_tv_type_fighting
        "Fire" -> R.drawable.bg_tv_type_fire
        "Flying" -> R.drawable.bg_tv_type_flying
        "Ghost" -> R.drawable.bg_tv_type_ghost
        "Normal" -> R.drawable.bg_tv_type_normal
        "Grass" -> R.drawable.bg_tv_type_grass
        "Ground" -> R.drawable.bg_tv_type_ground
        "Ice" -> R.drawable.bg_tv_type_ice
        "Poison" -> R.drawable.bg_tv_type_poison
        "Psychic" -> R.drawable.bg_tv_type_psychic
        "Rock" -> R.drawable.bg_tv_type_rock
        "Steel" -> R.drawable.bg_tv_type_steel
        "Water" -> R.drawable.bg_tv_type_water
        else -> {R.drawable.bg_tv_type_grass}
    }
}

fun getTypeColor(type: String): Int {
    return when (type) {
        "Bug" -> R.color.bug
        "Dark" -> R.color.dark
        "Dragon" -> R.color.dragon
        "Electric" -> R.color.electric
        "Fairy" -> R.color.fairy
        "Fighting" -> R.color.fighting
        "Fire" -> R.color.fire
        "Flying" -> R.color.flying
        "Ghost" -> R.color.ghost
        "Normal" -> R.color.normal
        "Grass" -> R.color.grass
        "Ground" -> R.color.ground
        "Ice" -> R.color.ice
        "Poison" -> R.color.poison
        "Psychic" -> R.color.psychic
        "Rock" -> R.color.rock
        "Steel" -> R.color.steel
        "Water" -> R.color.water
        else -> {R.color.grass}
    }
}
fun getTypeBackgroundColor(type: String): Int {
    return when (type) {
        "Bug" -> R.color.bug
        "Dark" -> R.color.dark_25
        "Dragon" -> R.color.dragon_25
        "Electric" -> R.color.electric_25
        "Fairy" -> R.color.fairy_25
        "Fighting" -> R.color.fighting_25
        "Fire" -> R.color.fire_25
        "Flying" -> R.color.flying_25
        "Ghost" -> R.color.ghost_25
        "Normal" -> R.color.normal_25
        "Grass" -> R.color.grass_25
        "Ground" -> R.color.ground_25
        "Ice" -> R.color.ice_25
        "Poison" -> R.color.poison_25
        "Psychic" -> R.color.psychic_25
        "Rock" -> R.color.rock_25
        "Steel" -> R.color.steel_25
        "Water" -> R.color.water_25
        else -> {R.color.grass_25}
    }
}
