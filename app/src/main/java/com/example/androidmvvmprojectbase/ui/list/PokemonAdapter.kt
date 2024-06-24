package com.example.androidmvvmprojectbase.ui.list

import com.bumptech.glide.Glide
import com.example.androidmvvmprojectbase.base.BaseAdapter
import com.example.androidmvvmprojectbase.data.Pokemon
import com.example.androidmvvmprojectbase.databinding.ItemPokemonBinding

class PokemonAdapter() : BaseAdapter<Pokemon, ItemPokemonBinding>(ItemPokemonBinding::inflate) {

    override fun bindData(binding: ItemPokemonBinding, item: Pokemon, position: Int) {
        while (item.id.length < 3) {
            item.id = "0" + item.id
        }
        with(binding) {
            tvIndex.text = "#${item.id}"
            tvName.text = item.name
            Glide.with(ivImage.context).load(item.image).into(ivImage)
        }
    }

    override fun onItemClick(binding: ItemPokemonBinding, item: Pokemon, position: Int) {

    }
}