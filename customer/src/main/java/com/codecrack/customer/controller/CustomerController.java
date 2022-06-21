package com.codecrack.customer.controller;

import com.codecrack.customer.VO.RequestTemplateVO;
import com.codecrack.customer.VO.ResponseTemplateVO;
import com.codecrack.customer.entity.Customer;
import com.codecrack.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/addCustomer")
    public ResponseTemplateVO saveCustomer(@RequestBody RequestTemplateVO requestTemplateVO) {
        return customerService.saveCustomer(requestTemplateVO);
    }

    @GetMapping("/allCustomers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/getCustomer/{customerId}")
    public ResponseTemplateVO getCustomerById(@PathVariable Long customerId) {
        return customerService.getCustomerById(customerId);
    }

}
