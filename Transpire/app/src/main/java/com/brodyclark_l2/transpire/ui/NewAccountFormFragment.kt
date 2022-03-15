package com.brodyclark_l2.transpire.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.brodyclark_l2.transpire.databinding.NewAccountFormBinding


class NewAccountFormFragment: Fragment() {

    private var _binding: NewAccountFormBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = NewAccountFormBinding.inflate(inflater, container, false)
        val submitButton = binding.submitButton
        submitButton.setOnClickListener {
            val action = NewAccountFormFragmentDirections
                .actionNewAccountFormFragmentToHomePageFragment()
            view?.findNavController()
                ?.navigate(action)
        }
        return binding.root
    }
}