package com.brodyclark_l2.transpire.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.brodyclark_l2.transpire.databinding.UpdateAccountBinding

class UpdateAccountFormFragment: Fragment() {

    private var _binding: UpdateAccountBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = UpdateAccountBinding.inflate(inflater, container, false)

        val submitButton = binding.submitButton
        submitButton.setOnClickListener {
            val action = UpdateAccountFormFragmentDirections
                .actionUpdateAccountFormFragmentToHomePageFragment()
            view?.findNavController()
                ?.navigate(action)
        }
        return binding.root
    }
}