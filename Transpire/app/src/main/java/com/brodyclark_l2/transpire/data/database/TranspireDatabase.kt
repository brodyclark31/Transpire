package com.brodyclark_l2.transpire.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.brodyclark_l2.transpire.data.UserData
import com.brodyclark_l2.transpire.data.Location

@Database(entities = [UserData::class, Location::class], version = 1)
@TypeConverters(UserData::class, Location::class)
abstract class TranspireDatabase : RoomDatabase() {
    abstract val userdataDao : UserDao
    abstract val locationDao : LocationDao
    companion object {
        @Volatile private var INSTANCE: TranspireDatabase? = null
        fun getInstance(context: Context): TranspireDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if(instance == null) {
                    instance = Room.databaseBuilder(context, TranspireDatabase::class.java,
                        "transpire-database").build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}