package com.brodyclark_l2.transpire.data.database

import androidx.room.Dao
import androidx.room.Insert
import com.brodyclark_l2.transpire.data.UserData

@Dao
interface UserDao {
    @Insert
    fun addUser(user: UserData)
}