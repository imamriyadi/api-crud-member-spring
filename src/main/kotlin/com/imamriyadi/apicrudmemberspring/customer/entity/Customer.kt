package com.imamriyadi.apicrudmemberspring.customer.entity

import java.util.UUID

data class Customer(
    var id:String = UUID.randomUUID().toString(),
    var name:String = "Anon",
    var age:Int = 0,
    var gender:Int= 0
)
