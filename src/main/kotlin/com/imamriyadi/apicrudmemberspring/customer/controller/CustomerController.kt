package com.imamriyadi.apicrudmemberspring.customer.controller

import com.imamriyadi.apicrudmemberspring.BaseResponse
import com.imamriyadi.apicrudmemberspring.customer.entity.Customer
import com.imamriyadi.apicrudmemberspring.customer.services.CustomerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/customer")
class CustomerController {
    @Autowired
    private lateinit var customerService: CustomerService

    @GetMapping("/by-id/{ids}")
    fun getCustomerById(
        @PathVariable(value="ids") ids:String
        ):BaseResponse<Customer>{
        return BaseResponse(
            status = true,
            message = "Success",
            data = customerService.getCustomerByID(ids)
        )
    }

    @GetMapping("/by-name/{name}")
    fun getCustomerByName(
        @PathVariable(value = "name") name:String
    ):BaseResponse<Customer>{
        return BaseResponse(
            status = true,
            message = "Success",
            data = customerService.getCustomerByName(name)
        )
    }

    @GetMapping()
    fun getCustomers():BaseResponse<List<Customer>>{
        return BaseResponse(
            status = true,
            message = "Success",
            data = customerService.getCustomer()
        )
    }

    @PostMapping()
    fun addCustomer(
        @RequestBody customer: Customer
    ):BaseResponse<List<Customer>>{
        return BaseResponse(
            status = true,
            message = "Success",
            data = customerService.addCustomer(customer)
        )
    }

    @PutMapping("/{ids}")
    fun updateCustomerById(
        @PathVariable(value="ids") ids:String,
        @RequestBody customer: Customer
    ):BaseResponse<Customer>{
        return BaseResponse(
            status = true,
            message = "Success",
            data = customerService.updateCustomer(ids,customer)
        )
    }

    @DeleteMapping("/{ids}")
    fun deleteCustomerById(
        @PathVariable(value="ids") ids:String
    ):BaseResponse<List<Customer>>{
        return BaseResponse(
            status = true,
            message = "Success",
            data = customerService.deleteCustomer(ids)
        )
    }
}