
package com.brodyclark_l2.transpire.data

import java.io.Serializable
import java.util.*

data class location(val name:String, val addressLink:String, val lowAge:Int, val highAge:Int, val rating: Double, var id: UUID = UUID.randomUUID()): Serializable