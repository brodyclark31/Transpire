package com.brodyclark_l2.transpire.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.brodyclark_l2.transpire.data.UserData

@Dao
interface UserDao {
    @Insert
    fun addUser(user: UserData)

    @Update
    fun updateUser(user: UserData)

    @Query("SELECT * FROM userdata WHERE username=(:username) and password=(:password)")
    fun getUser(username: String, password: String): LiveData<UserData>
}