package com.example.androidmvvmprojectbase.ui.detail

import androidx.lifecycle.MutableLiveData
import com.example.androidmvvmprojectbase.base.BaseViewModel
import com.example.androidmvvmprojectbase.data.Pokemon
import com.example.androidmvvmprojectbase.data.source.SampleData

class DetailViewModel : BaseViewModel() {

    val pokemon = MutableLiveData<Pokemon>()

    fun getPokemon() {
        pokemon.value = SampleData.pokemonList[1]
    }
}