package com.imamriyadi.apicrudmemberspring.customer.services

import com.imamriyadi.apicrudmemberspring.customer.entity.Customer

interface CustomerService {
    fun getCustomerByID(ids:String):Customer?
    fun getCustomerByName(name:String):Customer?
    fun getCustomer():List<Customer>
    fun addCustomer(customer: Customer):List<Customer>
    fun updateCustomer(ids: String,customer: Customer):Customer?
    fun deleteCustomer(ids: String):List<Customer>
}