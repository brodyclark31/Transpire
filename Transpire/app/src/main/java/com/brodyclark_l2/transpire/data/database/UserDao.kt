package com.brodyclark_l2.transpire.data.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.brodyclark_l2.transpire.data.UserData

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addUser(user: UserData): Long

    @Update
    fun updateUser(user: UserData)

    @Query("SELECT * FROM userdata WHERE username=(:username) and password=(:password)")
    fun getUser(username: String, password: String): LiveData<UserData>

    @Query("DELETE FROM userdata")
    fun removeUser()
}