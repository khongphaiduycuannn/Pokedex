package com.example.androidmvvmprojectbase.data.source.network

import com.example.androidmvvmprojectbase.data.Pokemon
import com.example.androidmvvmprojectbase.utils.constant.APIConstant
import retrofit2.http.GET

interface APIService {

    @GET(APIConstant.EndPoint.POKEMON)
    suspend fun getAllPokemon() : List<Pokemon>
}