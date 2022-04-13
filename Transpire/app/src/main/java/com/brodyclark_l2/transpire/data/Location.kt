
package com.brodyclark_l2.transpire.data

data class location(val name:String, val addressLink:String, val lowAge:Int, val highAge:Int, val rating: Int, var id: UUID = UUID.randomUUID()): Serializable