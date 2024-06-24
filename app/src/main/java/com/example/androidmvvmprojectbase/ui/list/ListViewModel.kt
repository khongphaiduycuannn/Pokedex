package com.example.androidmvvmprojectbase.ui.list

import androidx.lifecycle.MutableLiveData
import com.example.androidmvvmprojectbase.base.BaseViewModel
import com.example.androidmvvmprojectbase.data.Pokemon
import com.example.androidmvvmprojectbase.data.source.SampleData

class ListViewModel : BaseViewModel() {

    val pokemonList = MutableLiveData<MutableList<Pokemon>>()

    fun getData() {
        pokemonList.value = SampleData.pokemonList
    }
}