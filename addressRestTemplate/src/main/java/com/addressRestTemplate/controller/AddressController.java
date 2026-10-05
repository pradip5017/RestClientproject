package com.addressRestTemplate.controller;

import com.addressRestTemplate.dto.AddressResponse;
import com.addressRestTemplate.service.AddressService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addresses")
public class AddressController {


    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }


    @GetMapping("/{employeeId}")
    public AddressResponse getAddress(@PathVariable Long employeeId) {
        return addressService.getAddress(employeeId);
    }
}