package com.example.androidmvvmprojectbase.ui

import androidx.lifecycle.MutableLiveData
import com.example.androidmvvmprojectbase.base.BaseViewModel
import com.example.androidmvvmprojectbase.data.Pokemon

class SharedViewModel : BaseViewModel() {

    val pokemonList = MutableLiveData<MutableList<Pokemon>>()

    val pokemon = MutableLiveData<Pokemon>()

    val index = MutableLiveData<Int>()

    fun getNextPokemon(value: Int) {
        if (pokemonList.value == null || index.value == null) {
            return
        }
        val nextIndex = index.value!! + value
        val currentList = pokemonList.value!!
        if (nextIndex >= currentList.size || nextIndex < 0) {
            return
        }
        index.value = nextIndex
        pokemon.value = currentList[nextIndex]
    }
}