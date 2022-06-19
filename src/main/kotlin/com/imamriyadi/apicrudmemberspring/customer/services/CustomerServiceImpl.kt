package com.imamriyadi.apicrudmemberspring.customer.services

import com.imamriyadi.apicrudmemberspring.customer.entity.Customer
import com.imamriyadi.apicrudmemberspring.customer.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerServiceImpl:CustomerService {

    @Autowired
    private lateinit var customerRepository: CustomerRepository

    override fun getCustomerByID(ids: String): Customer? {
        return customerRepository.getCustomerByID(ids)
    }

    override fun getCustomerByName(name: String): Customer? {
        return customerRepository.getCustomerByName(name)
    }

    override fun getCustomer(): List<Customer> {
        return customerRepository.getCustomer()
    }

    override fun addCustomer(customer: Customer): List<Customer> {
        return customerRepository.addCustomer(customer)
    }

    override fun updateCustomer(ids: String,customer: Customer): Customer? {
        return customerRepository.updateCustomer(ids,customer)
    }

    override fun deleteCustomer(ids: String): List<Customer> {
       return customerRepository.deleteCustomer(ids)
    }
}