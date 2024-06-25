package com.example.androidmvvmprojectbase.ui.detail

import androidx.lifecycle.MutableLiveData
import com.example.androidmvvmprojectbase.base.BaseViewModel
import com.example.androidmvvmprojectbase.data.Pokemon

class DetailViewModel : BaseViewModel() {

    val pokemon = MutableLiveData<Pokemon>()

    fun setPokemon(pokemon: Pokemon) {
        this.pokemon.value = pokemon
    }
}