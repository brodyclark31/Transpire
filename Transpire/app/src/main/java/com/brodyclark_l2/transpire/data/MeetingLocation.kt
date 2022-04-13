
package com.brodyclark_l2.transpire.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
import java.util.*

@Entity(tableName = "meeting_location")
data class MeetingLocation(val name:String,
                           val addressLink:String,
                           val lowAge:Int,
                           val highAge:Int,
                           val rating: Double,
                           @PrimaryKey var id: UUID = UUID.randomUUID()): Serializable {

                    }