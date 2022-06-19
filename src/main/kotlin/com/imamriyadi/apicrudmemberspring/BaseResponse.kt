package com.imamriyadi.apicrudmemberspring

data class BaseResponse<T>(
    var status:Boolean= false,
    var message:String="",
    var data:T? = null
)
