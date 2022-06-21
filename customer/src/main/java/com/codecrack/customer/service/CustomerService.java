package com.codecrack.customer.service;

import com.codecrack.customer.VO.Address;
import com.codecrack.customer.VO.RequestTemplateVO;
import com.codecrack.customer.VO.ResponseTemplateVO;
import com.codecrack.customer.entity.Customer;
import com.codecrack.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private RestTemplate restTemplate;

    public ResponseTemplateVO saveCustomer(RequestTemplateVO requestTemplateVO) {
        Address address = restTemplate.postForObject("http://ADDRESS-SERVICE/address/addAddress",requestTemplateVO.getAddress(),Address.class);
        Customer customer = requestTemplateVO.getCustomer();
        customer.setAddressId(address.getAddressId());
        Customer savedCustomer =  customerRepository.save(requestTemplateVO.getCustomer());
         return new ResponseTemplateVO(savedCustomer,address);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public ResponseTemplateVO getCustomerById(Long customerId) {
        Customer customer =  customerRepository.findByCustomerId(customerId);
        Address address = restTemplate.getForObject("http://ADDRESS-SERVICE/address/getAddressById/"+ customer.getAddressId(),Address.class);
        return new ResponseTemplateVO(customer,address);
    }
}
