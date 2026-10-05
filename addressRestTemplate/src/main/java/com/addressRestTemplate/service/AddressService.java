package com.addressRestTemplate.service;


import com.addressRestTemplate.dto.AddressResponse;

public interface AddressService {

    AddressResponse getAddress(Long employeeId);
}
