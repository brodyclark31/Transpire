package com.brodyclark_l2.transpire.data

import java.io.Serializable
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "userdata", primaryKeys = ["username"])
data class UserData (
    var username: String,
    val password: String,
    val firstname: String,
    val lastname: String,
    val age: Int,
    val gender: Char,
    val city: String,
    val state: String,
    val travelWillingness: Int,
    val id: UUID = UUID.randomUUID()) : Serializable {

                     }