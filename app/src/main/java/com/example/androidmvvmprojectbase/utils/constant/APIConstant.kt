package com.example.androidmvvmprojectbase.utils.constant

object APIConstant {

    const val BASE_URL = "https://663b532dfee6744a6ea139c8.mockapi.io/api/"

    object EndPoint {
        const val POKEMON = "pokemon"
        const val POKEMON_BY_ID = "pokemon/{id}"
    }

    object TimeOut {
        const val CONNECT_TIME_OUT = 20L
    }
}