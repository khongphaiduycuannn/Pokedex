package com.example.androidmvvmprojectbase.ui.list

import com.bumptech.glide.Glide
import com.example.androidmvvmprojectbase.base.BaseAdapter
import com.example.androidmvvmprojectbase.data.Pokemon
import com.example.androidmvvmprojectbase.databinding.ItemPokemonBinding
import com.skydoves.transformationlayout.TransformationLayout

class PokemonAdapter(
    private val onCardClick: (Int, Pokemon, TransformationLayout) -> Unit = { position, item, view -> }
) : BaseAdapter<Pokemon, ItemPokemonBinding>(ItemPokemonBinding::inflate) {

    override fun bindData(binding: ItemPokemonBinding, item: Pokemon, position: Int) {
        binding.transformationLayout.transitionName = "$position"
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
        binding.cvPokemonCard.setOnClickListener {
            onCardClick.invoke(position, item, binding.transformationLayout)
        }
    }
}