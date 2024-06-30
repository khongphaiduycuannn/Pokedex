package com.example.androidmvvmprojectbase.ui.list

import androidx.lifecycle.MutableLiveData
import com.example.androidmvvmprojectbase.base.BaseViewModel
import com.example.androidmvvmprojectbase.data.Pokemon
import com.example.androidmvvmprojectbase.data.PokemonRepository
import com.example.androidmvvmprojectbase.data.source.network.APIService
import com.example.androidmvvmprojectbase.data.source.network.RetrofitClient

class ListViewModel : BaseViewModel() {

    private val pokemonRepository =
        PokemonRepository(RetrofitClient.getInstance().create(APIService::class.java))

    private var originalList = mutableListOf<Pokemon>()

    val pokemonList = MutableLiveData<MutableList<Pokemon>>()

    val error = MutableLiveData<String>(null)

    fun getData() {
        executeTask(
            request = {
                pokemonRepository.getPokemonList()
            },
            onSuccess = {
                originalList = it.toMutableList()
                pokemonList.value = it.toMutableList()
            },
            onError = {
                error.value = it.message
            }
        )
    }

    fun searchPokemon(searchKey: String) {
        val searchList = originalList.filter {
            it.name.contains(searchKey)
        }
        pokemonList.value = searchList.toMutableList()
    }
}