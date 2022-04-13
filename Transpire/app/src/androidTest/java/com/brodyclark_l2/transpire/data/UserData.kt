package com.brodyclark_l2.transpire.data

import java.io.Serializable
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "userdata")
data class UserData (val firstname: String,
                     val lastname: String,
                     val age: Int,
                     val gender: Char,
                     val city: String,
                     val state: String,
                     val travelWillingness: Int,
                     @PrimaryKey val id: UUID = UUID.randomUUID()) : Serializable {

                     }