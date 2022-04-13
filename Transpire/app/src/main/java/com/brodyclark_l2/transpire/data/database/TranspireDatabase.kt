package com.brodyclark_l2.transpire.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.brodyclark_l2.transpire.data.UserData
import com.brodyclark_l2.transpire.data.Location

@Database(entities = [UserData::class, Location::class], version = 1)
@TypeConverters(UserData::class, Location::class)
abstract class TranspireDatabase : RoomDatabase() {

}