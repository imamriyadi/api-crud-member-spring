package com.imamriyadi.apicrudmemberspring.customer.repository

import com.imamriyadi.apicrudmemberspring.customer.entity.Customer
import com.imamriyadi.apicrudmemberspring.database.DatabaseComponent
import com.mongodb.client.MongoCollection
import org.litote.kmongo.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class CustomerRepositoryImpl : CustomerRepository {
    @Autowired
    private lateinit var databaseComponent: DatabaseComponent

    private fun customerCollection(): MongoCollection<Customer> =
        databaseComponent.database.getDatabase("customers").getCollection()

    override fun getCustomerByID(ids: String): Customer? {
        return customerCollection().findOne { Customer::id eq ids }
    }

    override fun getCustomerByName(name: String): Customer? {
        return customerCollection().findOne { Customer::name eq name }
    }

    override fun getCustomer(): List<Customer> {
        return customerCollection().find().toList()
    }

    override fun addCustomer(customer: Customer): List<Customer> {
        val insert = customerCollection().insertOne(customer)
        return if (insert.wasAcknowledged()) {
            getCustomer()
        } else {
            throw IllegalStateException("Insert failed")
        }
    }

    override fun updateCustomer(ids: String, customer: Customer): Customer? {
        val update = customerCollection().updateOne(
            Customer::id eq ids,
            set(
                Customer::name setTo customer.name,
                Customer::age setTo customer.age,
                Customer::gender setTo customer.gender
            )
        )
        return if (update.wasAcknowledged()) {
            getCustomerByID(ids)
        } else {
            throw IllegalStateException("Delete failed")
        }
    }

    override fun deleteCustomer(ids: String): List<Customer> {
        val delete = customerCollection().deleteOne(Customer::id eq ids)
        return if (delete.wasAcknowledged()) {
            getCustomer()
        } else {
            throw IllegalStateException("Delete failed")
        }
    }
}