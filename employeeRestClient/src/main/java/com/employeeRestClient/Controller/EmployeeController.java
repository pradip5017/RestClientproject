package com.employeeRestClient.Controller;

import com.employeeRestClient.dto.AddressResponse;
import com.employeeRestClient.dto.EmployeeResponse;
import com.employeeRestClient.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/{id}")
    public EmployeeResponse getEmployee(@PathVariable Long id) {
        return employeeService.getEmployee(id);
    }



    @GetMapping("/{id}/address")
    public AddressResponse getEmployeeAddress(@PathVariable Long id) {

        return employeeService.getEmployeeAddress(id);
    }
}