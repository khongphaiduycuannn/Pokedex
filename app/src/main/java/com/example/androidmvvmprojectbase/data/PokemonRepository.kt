package com.example.androidmvvmprojectbase.data

import com.example.androidmvvmprojectbase.base.BaseRepository
import com.example.androidmvvmprojectbase.base.DataState
import com.example.androidmvvmprojectbase.data.source.network.APIService

class PokemonRepository(
    private val apiService: APIService
) : BaseRepository() {

    suspend fun getPokemonList(): DataState<List<Pokemon>> =
        getResult { apiService.getAllPokemon() }
}