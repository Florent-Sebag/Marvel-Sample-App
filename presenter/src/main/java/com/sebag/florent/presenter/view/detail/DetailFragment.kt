package com.sebag.florent.presenter.view.detail

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.navArgs
import com.sebag.florent.presenter.R
import com.sebag.florent.presenter.databinding.FragmentDetailBinding
import com.sebag.florent.presenter.view.base.BaseFragment

class DetailFragment : BaseFragment<FragmentDetailBinding, DetailVM>() {

    private val args: DetailFragmentArgs by navArgs()

    override fun layoutRes(): Int = R.layout.fragment_detail

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewmodel = viewModel
        viewModel.getCharacterDetails(args.id, args.position)
    }
}