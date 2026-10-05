package com.employeeRestClient.service;


import com.employeeRestClient.dto.AddressResponse;
import com.employeeRestClient.dto.EmployeeResponse;

public interface EmployeeService {

    EmployeeResponse getEmployee(Long id);

    AddressResponse getEmployeeAddress(Long employeeId);
}
