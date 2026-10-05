package com.addressRestTemplate.service;

import com.addressRestTemplate.dto.AddressResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private final List<AddressResponse> addresses =
            new ArrayList<>();

    public AddressServiceImpl() {

        addresses.add(
                new AddressResponse(
                        101L,
                        "Pune",
                        "Maharashtra",
                        "411001"
                )
        );

        addresses.add(
                new AddressResponse(
                        102L,
                        "Mumbai",
                        "Maharashtra",
                        "400001"
                )
        );

        addresses.add(
                new AddressResponse(
                        103L,
                        "Nashik",
                        "Maharashtra",
                        "422001"
                )
        );
    }

    @Override
    public AddressResponse getAddress(Long employeeId) {
        return addresses.stream()
                .filter(address -> address.getEmployeeId().equals(employeeId))
                .findFirst()
                .orElse(null);
    }
}