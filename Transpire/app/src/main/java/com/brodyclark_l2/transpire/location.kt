
package com.brodyclark_l2.transpire

data class location(val name:String, val addressLink:String, val lowAge:int, val highAge:int, val rating: Int, var id: UUID = UUID.randomUUID()): Serializable