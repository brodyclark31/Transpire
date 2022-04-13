package com.brodyclark_l2.transpire.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.brodyclark_l2.transpire.data.Location
import kotlin.random.Random.Default.nextInt
import com.brodyclark_l2.transpire.databinding.HomePageBinding
import java.util.*
import kotlin.math.min
import kotlin.random.Random.Default.nextInt

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

    val rockRestLodge = Location("Rock Rest Lodge", "16005 Mt Vernon Rd, Golden, CO 80401", 21, 50,4.3)
    val aceHigh = Location("Ace-Hi Tavern", "1216 Washington Ave, Golden, CO 80401", 35, 80, 4.3)
    val barrelsBottlesBrewery = Location("Barrels & Bottles Brewery", "600 12th St #160, Golden, CO 80401", 25, 80, 4.7)
    val theUnderground = Location("The Underground", "1224 Washington Ave, Golden, CO 80401", 21, 45, 4.3)
    val minersSaloon = Location("Miners Saloon", "1109 Miner's Alley, Golden, CO 80401", 23, 70, 4.5)
    val bars = listOf<Location>(rockRestLodge, aceHigh, barrelsBottlesBrewery, theUnderground, minersSaloon)

    fun returnBar(bars: List<Location>, age: Int): Location{
        while(true){
            var index: Int = (0..5).random()
            if(bars[index].lowAge <= age <= bars[index].highAge)
        }
    }
}