package com.imamriyadi.apicrudmemberspring.customer.repository

import com.imamriyadi.apicrudmemberspring.customer.entity.Customer

interface CustomerRepository {
    fun getCustomerByID(ids:String):Customer?
    fun getCustomerByName(name:String): Customer?
    fun getCustomer():List<Customer>
    fun addCustomer(customer: Customer):List<Customer>
    fun updateCustomer(ids: String,customer: Customer):Customer?
    fun deleteCustomer(ids: String):List<Customer>
}