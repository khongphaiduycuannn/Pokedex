package com.example.androidmvvmprojectbase.ui.list

import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.androidmvvmprojectbase.R
import com.example.androidmvvmprojectbase.base.BaseFragment
import com.example.androidmvvmprojectbase.databinding.FragmentListBinding
import com.example.androidmvvmprojectbase.ui.SharedViewModel

class ListFragment : BaseFragment<FragmentListBinding>(FragmentListBinding::inflate) {
    override val viewModel: ListViewModel
        get() = ViewModelProvider(this)[ListViewModel::class]

    private val sharedViewModel: SharedViewModel
        get() = ViewModelProvider(requireActivity())[SharedViewModel::class]

    private val pokemonAdapter = PokemonAdapter() { position, pokemon ->
        sharedViewModel.index.value = position
        sharedViewModel.pokemon.value = pokemon
        findNavController().navigate(R.id.action_listFragment_to_detailFragment)
    }

    override fun initData() {
        viewModel.getData()
    }

    override fun bindData() {
        binding.rclPokemonList.adapter = pokemonAdapter
        binding.rclPokemonList.layoutManager = GridLayoutManager(context, 3)
    }

    override fun observeData() {
        viewModel.pokemonList.observe(viewLifecycleOwner) {
            sharedViewModel.pokemonList.value = it
            pokemonAdapter.setDataList(it)
        }
    }

    override fun setOnClick() {

    }

    override fun onResume() {
        super.onResume()
        activity?.apply {
            window.statusBarColor = getColor(R.color.colorPrimary)
        }
    }
}