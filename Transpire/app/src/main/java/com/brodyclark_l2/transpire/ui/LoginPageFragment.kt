package com.brodyclark_l2.transpire.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.brodyclark_l2.transpire.databinding.LoginPageBinding
import com.brodyclark_l2.transpire.viewmodels.UserDataViewModel
import com.brodyclark_l2.transpire.viewmodels.ViewModelFactory


class LoginPageFragment: Fragment() {

    private lateinit var userdataViewModel: UserDataViewModel

    private var _binding: LoginPageBinding? = null
    private val binding get() = _binding!!
//    private val tr: TranspireRepository


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val factory = ViewModelFactory(requireContext())
        userdataViewModel = ViewModelProvider(this, factory).get(UserDataViewModel::class.java)
        _binding = LoginPageBinding.inflate(inflater, container, false)
        val loginButton = binding.loginButton
        loginButton.setOnClickListener {
            val username = binding.usernameText.text.toString()
            val password = binding.passwordText.text.toString()
//            context?.deleteDatabase("transpire-database");

            userdataViewModel.setUserInfo(username = username, password = password)
            Log.d("asfas", userdataViewModel.userLoginInfo?.value.toString())
//            val action = LoginPageFragmentDirections
//                .actionLoginPageToHomePageFragment()
//            view?.findNavController()
//                ?.navigate(action)
        }
        val createAccountButton = binding.createAccountButton
        createAccountButton.setOnClickListener {
            val action = LoginPageFragmentDirections
                .actionLoginPageToNewAccountFormFragment()
            view?.findNavController()
                ?.navigate(action)
        }
        return binding.root
    }
}