package com.example.androidmvvmprojectbase.ui.detail

import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.androidmvvmprojectbase.base.BaseFragment
import com.example.androidmvvmprojectbase.data.Pokemon
import com.example.androidmvvmprojectbase.databinding.FragmentDetailBinding
import com.example.androidmvvmprojectbase.ui.SharedViewModel
import com.example.androidmvvmprojectbase.utils.getTypeBackgroundColor
import com.example.androidmvvmprojectbase.utils.getTypeColor

class DetailFragment : BaseFragment<FragmentDetailBinding>(FragmentDetailBinding::inflate) {
    override val viewModel: DetailViewModel
        get() = ViewModelProvider(this)[DetailViewModel::class]

    private val sharedViewModel: SharedViewModel
        get() = ViewModelProvider(requireActivity())[SharedViewModel::class]

    private val typeAdapter = TypeAdapter()

    override fun initData() {


    }

    override fun bindData() {
        binding.rclTypeList.adapter = typeAdapter
        binding.rclTypeList.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
    }

    override fun observeData() {
        viewModel.pokemon.observe(viewLifecycleOwner) {
            val mainType = it.type[0]
            setBackgroundColor(mainType)
            setHeaderTextColor(mainType)
            setPokemonData(it)
        }

        sharedViewModel.pokemon.observe(viewLifecycleOwner) {
            viewModel.setPokemon(it)
        }

        sharedViewModel.index.observe(viewLifecycleOwner) {
            val listSize = sharedViewModel.pokemonList.value!!.size
            when (it) {
                0 -> {
                    binding.btnPrev.visibility = View.GONE
                }
                listSize - 1 -> {
                    binding.btnNext.visibility = View.GONE
                }
                else -> {
                    binding.btnPrev.visibility = View.VISIBLE
                    binding.btnNext.visibility = View.VISIBLE
                }
            }
        }
    }

    override fun setOnClick() {
        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.btnNext.setOnClickListener {
            sharedViewModel.getNextPokemon(1)
        }

        binding.btnPrev.setOnClickListener {
            sharedViewModel.getNextPokemon(-1)
        }
    }

    private fun setBackgroundColor(type: String) {
        activity?.apply {
            window.statusBarColor = getColor(getTypeColor(type))
            binding.clDetailCard.setBackgroundColor(getColor(getTypeColor(type)))
        }
    }

    private fun setHeaderTextColor(type: String) {
        activity?.apply {
            with(binding) {
                tvAbout.setTextColor(getColor(getTypeColor(type)))
                tvBaseStatus.setTextColor(getColor(getTypeColor(type)))

                tvHp.setTextColor(getColor(getTypeColor(type)))
                tvAtk.setTextColor(getColor(getTypeColor(type)))
                tvDef.setTextColor(getColor(getTypeColor(type)))
                tvSAtk.setTextColor(getColor(getTypeColor(type)))
                tvSDef.setTextColor(getColor(getTypeColor(type)))
                tvSpeed.setTextColor(getColor(getTypeColor(type)))

                pvHpValue.colorBackground = getColor(getTypeBackgroundColor(type))
                pvAtkValue.colorBackground = getColor(getTypeBackgroundColor(type))
                pvDefValue.colorBackground = getColor(getTypeBackgroundColor(type))
                pvSAtkValue.colorBackground = getColor(getTypeBackgroundColor(type))
                pvSDefValue.colorBackground = getColor(getTypeBackgroundColor(type))
                pvSpeedValue.colorBackground = getColor(getTypeBackgroundColor(type))

                pvHpValue.highlightView.color = getColor(getTypeColor(type))
                pvAtkValue.highlightView.color = getColor(getTypeColor(type))
                pvDefValue.highlightView.color = getColor(getTypeColor(type))
                pvSAtkValue.highlightView.color = getColor(getTypeColor(type))
                pvSDefValue.highlightView.color = getColor(getTypeColor(type))
                pvSpeedValue.highlightView.color = getColor(getTypeColor(type))
            }
        }
    }

    private fun setPokemonData(pokemon: Pokemon) {
        with(binding) {
            typeAdapter.setDataList(pokemon.type.toMutableList())

            while (pokemon.id.length < 3) {
                pokemon.id = "0" + pokemon.id
            }
            tvIndex.text = "#${pokemon.id}"

            tvName.text = pokemon.name
            Glide.with(requireContext()).load(pokemon.image).into(ivImage)
            tvHeight.text = "${pokemon.height} m"
            tvWeight.text = "${pokemon.weight} kg"
            tvDescription.text = pokemon.description

            tvHpValue.text = pokemon.status.hp.toString()
            tvAtkValue.text = pokemon.status.attack.toString()
            tvDefValue.text = pokemon.status.defense.toString()
            tvSAtkValue.text = pokemon.status.spAtk.toString()
            tvSDefValue.text = pokemon.status.spDef.toString()
            tvSpeedValue.text = pokemon.status.speed.toString()

            pvHpValue.progress = pokemon.status.hp.toFloat()
            pvAtkValue.progress = pokemon.status.attack.toFloat()
            pvDefValue.progress = pokemon.status.defense.toFloat()
            pvSAtkValue.progress = pokemon.status.spAtk.toFloat()
            pvSDefValue.progress = pokemon.status.spDef.toFloat()
            pvSpeedValue.progress = pokemon.status.speed.toFloat()
        }
    }
}