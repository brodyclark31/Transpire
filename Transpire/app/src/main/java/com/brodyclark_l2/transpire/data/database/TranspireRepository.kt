package com.brodyclark_l2.transpire.data.database

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import com.brodyclark_l2.transpire.data.UserData
import java.util.concurrent.Executors

class TranspireRepository private constructor(private val userdataDao: UserDao, private val meetingLocationDao: MeetingLocationDao) {
    companion object {
        @Volatile private var INSTANCE: TranspireRepository? = null
        fun getInstance(context: Context): TranspireRepository {
            synchronized(this) {
                var instance = INSTANCE
                if(instance == null) {
                    val database = TranspireDatabase.getInstance(context)
                    instance = TranspireRepository(database.userdataDao, database.meetingLocationDao)
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
    private val executor = Executors.newSingleThreadExecutor()

    fun addUser(user: UserData) {
        executor.execute {
            userdataDao.addUser(user)
        }
    }
    fun getUser(username: String, password: String): LiveData<UserData> = userdataDao.getUser(username, password)
//        executor.execute {
//            userdataDao.getUser(username, password)
//        }
//    }
    fun updateUser(user: UserData) {
        executor.execute {
            userdataDao.updateUser(user)
        }
    }
}