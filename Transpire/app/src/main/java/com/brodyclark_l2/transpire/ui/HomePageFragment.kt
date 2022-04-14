package com.brodyclark_l2.transpire.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.brodyclark_l2.transpire.data.MeetingLocation
import com.brodyclark_l2.transpire.databinding.HomePageBinding

class HomePageFragment: Fragment() {

    private var _binding: HomePageBinding? = null
    private val binding get() = _binding!!

    private val barBank: MutableList<MeetingLocation> = mutableListOf()
//    private val barChoosen: MeetingLocation = returnBar()//need to put in the users age idk where we made that or how to make that

    init {
        barBank.add(MeetingLocation("Rock Rest Lodge", "16005 Mt Vernon Rd, Golden, CO 80401", 21, 50,4.3))
        barBank.add(MeetingLocation("Ace-Hi Tavern", "1216 Washington Ave, Golden, CO 80401", 35, 80, 4.3))
        barBank.add(MeetingLocation("Barrels & Bottles Brewery", "600 12th St #160, Golden, CO 80401", 25, 80, 4.7))
        barBank.add(MeetingLocation("The Underground", "1224 Washington Ave, Golden, CO 80401", 21, 45, 4.3))
        barBank.add(MeetingLocation("Miners Saloon", "1109 Miner's Alley, Golden, CO 80401", 23, 70, 4.5))
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = HomePageBinding.inflate(inflater, container, false)

//        setBarTextViewModel()

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

//    private fun setBarTextViewModel(){
//        binding.locationTextId.text = barChoosen.name
//    }
    private fun returnBar(age: Int): MeetingLocation{
        while(true){
            var index: Int = (0..5).random()
            if(barBank[index].lowAge <= age && age <= barBank[index].highAge){
                return barBank[index]
            }
        }
    }


}