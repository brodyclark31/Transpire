package com.brodyclark_l2.transpire.data.database

import androidx.room.TypeConverter
import java.util.*

class TranspireTypeConverters {
    @TypeConverter
    fun fromUUID(uuid: UUID?) = uuid?.toString()

    @TypeConverter
    fun toUUID(uuidString: String?) = UUID.fromString(uuidString)
}