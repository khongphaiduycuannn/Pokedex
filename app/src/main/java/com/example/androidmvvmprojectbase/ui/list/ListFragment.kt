package com.example.androidmvvmprojectbase.ui.list

import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.androidmvvmprojectbase.R
import com.example.androidmvvmprojectbase.base.BaseFragment
import com.example.androidmvvmprojectbase.databinding.FragmentListBinding
import com.example.androidmvvmprojectbase.ui.SharedViewModel
import com.skydoves.transformationlayout.onTransformationStartContainer

class ListFragment : BaseFragment<FragmentListBinding>(FragmentListBinding::inflate) {
    override val viewModel: ListViewModel
        get() = ViewModelProvider(this)[ListViewModel::class]

    private val sharedViewModel: SharedViewModel
        get() = ViewModelProvider(requireActivity())[SharedViewModel::class]

    private val pokemonAdapter = PokemonAdapter() { position, pokemon, view ->
        sharedViewModel.index.value = position
        sharedViewModel.pokemon.value = pokemon

        val extras = FragmentNavigatorExtras(view to "$position")
        val bundle = view.getBundle("TransformationParams")
        bundle.putString("transformationName", "$position")
        findNavController().navigate(
            R.id.action_listFragment_to_detailFragment,
            bundle,
            null,
            extras
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        onTransformationStartContainer()
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

        viewModel.error.observe(viewLifecycleOwner) {
            if (!it.isNullOrEmpty()) {
                Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun setOnClick() {

    }
}