package com.codecrack.address.service;

import com.codecrack.address.entity.Address;
import com.codecrack.address.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }


    public Address getAddressById(Long addressId) {
        return addressRepository.findById(addressId).get();
    }
}
