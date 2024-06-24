package com.example.androidmvvmprojectbase.ui.list

import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.androidmvvmprojectbase.base.BaseFragment
import com.example.androidmvvmprojectbase.databinding.FragmentListBinding

class ListFragment : BaseFragment<FragmentListBinding>(FragmentListBinding::inflate) {
    override val viewModel: ListViewModel
        get() = ViewModelProvider(this)[ListViewModel::class]

    override fun initData() {

    }

    override fun bindData() {
        
    }

    override fun observeData() {

    }

    override fun setOnClick() {

    }
}