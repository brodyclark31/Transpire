package com.brodyclark_l2.transpire.viewmodels

import android.content.Context
import androidx.lifecycle.ViewModel
import com.brodyclark_l2.transpire.data.UserData
import com.brodyclark_l2.transpire.data.database.TranspireRepository

class UserDataViewModel(private val transpireRepository: TranspireRepository, context: Context): ViewModel() {
    fun addUser(user: UserData) {
        transpireRepository.addUser(user)
    }
    fun getUser(username: String, password: String) {
        return transpireRepository.getUser(username, password)
    }

    private val barBank: MutableList<MeetingLocation> = mutableListOf()

    init {
        barBank.add(MeetingLocation("Rock Rest Lodge", "16005 Mt Vernon Rd, Golden, CO 80401", 21, 50,4.3))
        barBank.add(MeetingLocation("Ace-Hi Tavern", "1216 Washington Ave, Golden, CO 80401", 35, 80, 4.3))
        barBank.add(MeetingLocation("Barrels & Bottles Brewery", "600 12th St #160, Golden, CO 80401", 25, 80, 4.7))
        barBank.add(MeetingLocation("The Underground", "1224 Washington Ave, Golden, CO 80401", 21, 45, 4.3))
        barBank.add(MeetingLocation("Miners Saloon", "1109 Miner's Alley, Golden, CO 80401", 23, 70, 4.5))
    }


}