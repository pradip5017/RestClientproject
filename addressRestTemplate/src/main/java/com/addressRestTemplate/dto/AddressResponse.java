package com.addressRestTemplate.dto;

public class AddressResponse {

    private Long employeeId;
    private String city;
    private String state;
    private String pincode;

    public AddressResponse() {
    }

    public AddressResponse(
            Long employeeId,
            String city,
            String state,
            String pincode) {

        this.employeeId = employeeId;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}