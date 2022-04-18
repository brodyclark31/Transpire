package com.brodyclark_l2.transpire.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.brodyclark_l2.transpire.data.MeetingLocation
import com.brodyclark_l2.transpire.databinding.HomePageBinding
import com.brodyclark_l2.transpire.viewmodels.UserDataViewModel
import com.brodyclark_l2.transpire.viewmodels.ViewModelFactory

class HomePageFragment: Fragment() {

    private lateinit var userDataViewModel: UserDataViewModel

    private var _binding: HomePageBinding? = null
    private val binding get() = _binding!!
    private lateinit var barChoosen: MeetingLocation



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = HomePageBinding.inflate(inflater, container, false)

        val factory =  ViewModelFactory(requireContext())
        userDataViewModel = ViewModelProvider(this, factory).get(UserDataViewModel::class.java)

        barChoosen = userDataViewModel.returnMeetingLocation //need to put in the users age idk where we made that or how to make that

        setBarTextViewModel()

        val directionsButton = binding.directionsButton
        directionsButton.setOnClickListener {
            val action = HomePageFragmentDirections
                .actionHomePageFragmentToMapsFragment()
            view?.findNavController()
                ?.navigate(action)
        }
        val ridesButton = binding.ridesButton
        ridesButton.setOnClickListener {
            val action = HomePageFragmentDirections
                .actionHomePageFragmentToUberFragment()
            view?.findNavController()
                ?.navigate(action)
        }
        val locationsButton = binding.locationNavButton
        locationsButton.setOnClickListener {
            val action = HomePageFragmentDirections
                .actionHomePageFragmentToLocationDetailsFragment()
            view?.findNavController()
                ?.navigate(action)
        }
        val historyButton = binding.historyNavButton
        historyButton.setOnClickListener {
            val action = HomePageFragmentDirections
                .actionHomePageFragmentToPhotosFragment()
            view?.findNavController()
                ?.navigate(action)
        }
        val settingsButton = binding.settingNavButton
        settingsButton.setOnClickListener {
            val action = HomePageFragmentDirections
                .actionHomePageFragmentToUpdateAccountFormFragment()
            view?.findNavController()
                ?.navigate(action)
        }
        return binding.root
    }

    private fun setBarTextViewModel(){
        binding.locationTextId.text = barChoosen.name
    }



}