package com.brodyclark_l2.transpire.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.brodyclark_l2.transpire.databinding.LocationDetailsBinding
import com.brodyclark_l2.transpire.viewmodels.UserDataViewModel
import com.brodyclark_l2.transpire.viewmodels.ViewModelFactory

class LocationDetailsFragment: Fragment() {

    private lateinit var userDataViewModel: UserDataViewModel

    private var _binding: LocationDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = LocationDetailsBinding.inflate(inflater, container, false)

        val factory =  ViewModelFactory(requireContext())
        userDataViewModel = ViewModelProvider(this, factory).get(UserDataViewModel::class.java)
        setValues()
        return binding.root
    }

    private fun setValues(){
        binding.location.text = userDataViewModel.returnMeetingLocation.name
        binding.address.text = userDataViewModel.returnMeetingLocation.addressLink
        binding.yelpReview.text = userDataViewModel.returnMeetingLocation.rating.toString()

    }
}