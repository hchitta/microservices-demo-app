package com.codecrack.address.controller;

import com.codecrack.address.entity.Address;
import com.codecrack.address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/addAddress")
    public Address saveAddress(@RequestBody Address address){
        return addressService.saveAddress(address);
    }

    @GetMapping("/getAddressById/{addressId}")
    public Address getAddressById(@PathVariable Long addressId) {
        return  addressService.getAddressById(addressId);
    }

}
