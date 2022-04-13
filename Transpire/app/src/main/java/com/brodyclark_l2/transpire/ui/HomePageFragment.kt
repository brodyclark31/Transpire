package com.brodyclark_l2.transpire.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.brodyclark_l2.transpire.data.location
import com.brodyclark_l2.transpire.databinding.HomePageBinding

class HomePageFragment: Fragment() {

    private var _binding: HomePageBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = HomePageBinding.inflate(inflater, container, false)
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

    val rockRestLodge = location("Rock Rest Lodge", "https://www.google.com/maps/dir//Rock+Rest+Lodge,+16005+Mt+Vernon+Rd,+Golden,+CO+80401/@39.7379778,-105.185181,16z/data=!4m8!4m7!1m0!1m5!1m1!1s0x876b84f33b931fe3:0x13783701204153c9!2m2!1d-105.179533!2d39.7338221", 21, 50,4.3)
    val bars = listOf<location>()
}