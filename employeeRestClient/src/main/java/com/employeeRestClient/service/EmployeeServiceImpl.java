package com.employeeRestClient.service;

import com.employeeRestClient.client.AddressClient;
import com.employeeRestClient.dto.AddressResponse;
import com.employeeRestClient.dto.EmployeeResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final AddressClient addressClient;

    private final List<EmployeeResponse> employees =
            new ArrayList<>();

    public EmployeeServiceImpl(AddressClient addressClient) {

        this.addressClient = addressClient;

        employees.add(new EmployeeResponse(
                        101L,
                        "Pradip",
                        "pradip@gmail.com"
                )
        );

        employees.add(new EmployeeResponse(
                        102L,
                        "Rahul",
                        "rahul@gmail.com"
                )
        );

        employees.add(new EmployeeResponse(
                        103L,
                        "Amit",
                        "amit@gmail.com"
                )
        );
    }

    @Override
    public EmployeeResponse getEmployee(Long id) {

        return employees.stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public AddressResponse getEmployeeAddress(Long employeeId) {
        return addressClient.getAddress(employeeId);
    }
}