package com.brodyclark_l2.transpire.viewmodels

import androidx.lifecycle.ViewModel
import com.brodyclark_l2.transpire.data.UserData
import com.brodyclark_l2.transpire.data.database.TranspireRepository

class UserDataViewModel(private val transpireRepository: TranspireRepository): ViewModel() {
    fun addUser(user: UserData) {
        transpireRepository.addUser(user)
    }
    fun getUser(username: String, password: String) {
        transpireRepository.getUser(username, password)
    }
}