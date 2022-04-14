package com.brodyclark_l2.transpire.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.brodyclark_l2.transpire.R
import com.brodyclark_l2.transpire.data.UserData
import com.brodyclark_l2.transpire.databinding.NewAccountFormBinding
import com.brodyclark_l2.transpire.viewmodels.UserDataViewModel
import com.brodyclark_l2.transpire.viewmodels.ViewModelFactory
import java.lang.Integer.parseInt


class NewAccountFormFragment: Fragment() {

    private lateinit var userdataViewModel: UserDataViewModel
    private var _binding: NewAccountFormBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val factory = ViewModelFactory(requireContext())
        userdataViewModel = ViewModelProvider(this, factory).get(UserDataViewModel::class.java)
        _binding = NewAccountFormBinding.inflate(inflater, container, false)
        val submitButton = binding.submitButton
        submitButton.setOnClickListener {
//            var newUser
            val username = binding.userNameText.text.toString()
            val firstname = binding.firstNameText.text.toString()
            val lastname = binding.lastNameText.text.toString()
            val password = binding.passwordText.text.toString()
            val age = binding.ageText.text.toString()
            val female = binding.femaleButton.isChecked
            val male = binding.maleButton.isChecked
            val city = binding.cityText.text.toString()
            val state = binding.stateSpinner.selectedItem.toString()
            val travelDistance = binding.travelDistanceText.text.toString()
            var gender: Char = ' '
            if (female) gender = 'F'
            if (male) gender = 'M'
            if (username == "" || firstname == "" || lastname == "" || password == ""
                || age == ""|| firstname == ""|| gender == ' ' || city == "" || travelDistance == "") {
                Toast.makeText(requireContext(), R.string.invalid_form_toast, Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            var userData = UserData( username= username, firstname = firstname, lastname = lastname, password = password,
                                    age = parseInt(age), gender = gender, city = city, state = state, travelWillingness = parseInt(travelDistance) )
            userdataViewModel.addUser(userData)
            val action = NewAccountFormFragmentDirections
                .actionNewAccountFormFragmentToHomePageFragment()
            view?.findNavController()
                ?.navigate(action)
        }
        return binding.root
    }
}