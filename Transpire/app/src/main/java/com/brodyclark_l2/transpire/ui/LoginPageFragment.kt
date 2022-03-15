package com.brodyclark_l2.transpire.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.brodyclark_l2.transpire.databinding.LoginPageBinding


class LoginPageFragment: Fragment() {

    private var _binding: LoginPageBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = LoginPageBinding.inflate(inflater, container, false)
        val loginButton = binding.loginButton
        loginButton.setOnClickListener {
            Log.d("hi", "hi")
            val action = LoginPageFragmentDirections.actionLoginPageToHomePageFragment()
            view?.findNavController()
                ?.navigate(action)
        }
        return binding.root
    }
}