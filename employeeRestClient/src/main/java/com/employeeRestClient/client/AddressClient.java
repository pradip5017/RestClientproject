package com.employeeRestClient.client;
import com.employeeRestClient.dto.AddressResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class AddressClient {

    private final RestClient restClient;

    public AddressClient(RestClient restClient) {
        this.restClient = restClient;
    }

    public AddressResponse getAddress(Long employeeId) {

        return restClient.get()
                .uri(
                        "http://localhost:8082/addresses/{employeeId}",
                        employeeId
                )
                .retrieve()
                .body(AddressResponse.class);
    }
}