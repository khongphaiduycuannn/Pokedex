package com.example.androidmvvmprojectbase.data.source

import com.example.androidmvvmprojectbase.data.Pokemon
import com.example.androidmvvmprojectbase.data.Status

object SampleData {

    val pokemonList = mutableListOf(
        Pokemon(
            id = "1",
            name = "Bulbasaur",
            image = "https://img.pokemondb.net/artwork/large/bulbasaur.jpg",
            description = "Bulbasaur is a small, mainly turquoise amphibian Pokémon with red eyes and a green bulb on its back. It is based on a frog/toad, with the bulb resembling a plant bulb that grows into a flower as it evolves.",
            type = listOf(
                "Grass",
                "Poison"
            ),
            height = 0.7,
            weight = 6.9,
            status = Status(
                hp = 45,
                attack = 49,
                defense = 49,
                spAtk = 65,
                spDef = 65,
                speed = 45
            )
        ),
        Pokemon(
            id = "7",
            name = "Squirtle",
            image = "https://img.pokemondb.net/artwork/large/squirtle.jpg",
            description = "Squirtle is a bipedal, reptilian Pokémon. It has a blue body with purple eyes, a light brown belly, and a tough red-brown shell on its back. It has a long tail that curls into a spiral.",
            type = listOf(
                "Water"
            ),
            height = 0.5,
            weight = 9.0,
            status = Status(
                hp = 44,
                attack = 48,
                defense = 65,
                spAtk = 50,
                spDef = 64,
                speed = 43
            )
        ),
        Pokemon(
            id = "10",
            name = "Caterpie",
            image = "https://img.pokemondb.net/artwork/large/caterpie.jpg",
            description = "Caterpie is a Bug type Pokémon introduced in Generation 1.",
            type = listOf(
                "Bug"
            ),
            height = 0.3,
            weight = 2.9,
            status = Status(
                hp = 45,
                attack = 30,
                defense = 35,
                spAtk = 20,
                spDef = 20,
                speed = 45
            )
        ),
        Pokemon(
            id = "16",
            name = "Pidgey",
            image = "https://img.pokemondb.net/artwork/large/pidgey.jpg",
            description = "Pidgey is a Normal/Flying type Pokémon introduced in Generation 1.",
            type = listOf(
                "Normal",
                "Flying"
            ),
            height = 0.3,
            weight = 1.8,
            status = Status(
                hp = 40,
                attack = 45,
                defense = 40,
                spAtk = 35,
                spDef = 35,
                speed = 56
            )
        ),
        Pokemon(
            id = "25",
            name = "Pikachu",
            image = "https://img.pokemondb.net/artwork/pikachu.jpg",
            description = "Pikachu is an Electric type Pokémon introduced in Generation 1.",
            type = listOf(
                "Electric"
            ),
            height = 0.4,
            weight = 6.0,
            status = Status(
                hp = 35,
                attack = 55,
                defense = 40,
                spAtk = 50,
                spDef = 50,
                speed = 90
            )
        ),
        Pokemon(
            id = "29",
            name = "Nidoran (female)",
            image = "https://img.pokemondb.net/artwork/nidoran-f.jpg",
            description = "Nidoran♀ is a Poison type Pokémon introduced in Generation 1.",
            type = listOf(
                "Poison"
            ),
            height = 0.4,
            weight = 7.0,
            status = Status(
                hp = 55,
                attack = 47,
                defense = 52,
                spAtk = 40,
                spDef = 40,
                speed = 41
            )
        ),
        Pokemon(
            id = "151",
            name = "Mew",
            image = "https://img.pokemondb.net/artwork/mew.jpg",
            description = "Mew is a Psychic type Pokémon introduced in Generation 1.",
            type = listOf(
                "Psychic"
            ),
            height = 0.4,
            weight = 4.0,
            status = Status(
                hp = 100,
                attack = 100,
                defense = 100,
                spAtk = 100,
                spDef = 100,
                speed = 100
            )
        )
    )
}