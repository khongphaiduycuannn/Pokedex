package com.example.androidmvvmprojectbase.ui.detail

import com.example.androidmvvmprojectbase.base.BaseAdapter
import com.example.androidmvvmprojectbase.databinding.ItemTypeBinding
import com.example.androidmvvmprojectbase.utils.getResourceTypeColor

class TypeAdapter : BaseAdapter<String, ItemTypeBinding>(ItemTypeBinding::inflate) {

    override fun bindData(binding: ItemTypeBinding, item: String, position: Int) {
        binding.tvType.text = item
        binding.tvType.setBackgroundResource(getResourceTypeColor(item))
    }

    override fun onItemClick(binding: ItemTypeBinding, item: String, position: Int) {

    }
}