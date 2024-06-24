package com.example.androidmvvmprojectbase.ui.list

import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.androidmvvmprojectbase.base.BaseFragment
import com.example.androidmvvmprojectbase.databinding.FragmentListBinding

class ListFragment : BaseFragment<FragmentListBinding>(FragmentListBinding::inflate) {
    override val viewModel: ListViewModel
        get() = ViewModelProvider(this)[ListViewModel::class]

    private val pokemonAdapter = PokemonAdapter()

    override fun initData() {
        viewModel.getData()
    }

    override fun bindData() {
        binding.rclPokemonList.adapter = pokemonAdapter
        binding.rclPokemonList.layoutManager = GridLayoutManager(context, 3)
    }

    override fun observeData() {
        viewModel.pokemonList.observe(viewLifecycleOwner) {
            pokemonAdapter.setDataList(it)
        }
    }

    override fun setOnClick() {

    }
}