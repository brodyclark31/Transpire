package com.brodyclark_l2.transpire.viewmodels

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import com.brodyclark_l2.transpire.data.UserData
import com.brodyclark_l2.transpire.data.database.TranspireRepository
//import import com.brodyclark_l2.transpire.data.MeetingLocation


class UserDataViewModel(private val transpireRepository: TranspireRepository, context: Context): ViewModel() {
    private var usernameGlobal = ""
    private var passwordGlobal = ""
    fun addUser(user: UserData) {
        transpireRepository.addUser(user)
    }
    fun setUserInfo(username: String, password: String) {
        usernameGlobal = username
        passwordGlobal = password
//        val user = transpireRepository.getUser(username, password)
//        Log.d("agasf", user.toString())
//        return transpireRepository.getUser(username, password)
    }

    val userLiveData = transpireRepository.getUser(usernameGlobal, passwordGlobal)

//    private val barBank: MutableList<MeetingLocation> = mutableListOf()
//    //private val barChoosen: MeetingLocation = returnBar()//need to put in the users age idk where we made that or how to make that
//
//    init {
//        barBank.add(MeetingLocation("Rock Rest Lodge", "16005 Mt Vernon Rd, Golden, CO 80401", 21, 50,4.3))
//        barBank.add(MeetingLocation("Ace-Hi Tavern", "1216 Washington Ave, Golden, CO 80401", 35, 80, 4.3))
//        barBank.add(MeetingLocation("Barrels & Bottles Brewery", "600 12th St #160, Golden, CO 80401", 25, 80, 4.7))
//        barBank.add(MeetingLocation("The Underground", "1224 Washington Ave, Golden, CO 80401", 21, 45, 4.3))
//        barBank.add(MeetingLocation("Miners Saloon", "1109 Miner's Alley, Golden, CO 80401", 23, 70, 4.5))
//    }
//
//
//    private fun returnBar(age: Int): MeetingLocation{
//        while(true){
//            var index: Int = (0..5).random()
//            if(barBank[index].lowAge <= age && age <= barBank[index].highAge){
//                return barBank[index]
//            }
//        }
//    }
//
//    val returnMeetingLocation: MeetingLocation
//        get() = barChoosen

}