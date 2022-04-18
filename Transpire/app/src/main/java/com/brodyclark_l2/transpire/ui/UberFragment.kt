package com.brodyclark_l2.transpire.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.brodyclark_l2.transpire.databinding.UberBinding
import com.brodyclark_l2.transpire.viewmodels.UserDataViewModel
import com.brodyclark_l2.transpire.viewmodels.ViewModelFactory

class UberFragment: Fragment() {

    private lateinit var userDataViewModel: UserDataViewModel

    private var _binding: UberBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = UberBinding.inflate(inflater, container, false)

        val factory =  ViewModelFactory(requireContext())
        userDataViewModel = ViewModelProvider(this, factory).get(UserDataViewModel::class.java)
        setAddress()
        return binding.root
    }

    private fun setAddress(){
        binding.addressDisplay.text = userDataViewModel.returnMeetingLocation.addressLink
    }

}