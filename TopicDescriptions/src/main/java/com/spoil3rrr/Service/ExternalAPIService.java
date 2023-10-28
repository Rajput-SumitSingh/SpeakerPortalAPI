package com.spoil3rrr.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalAPIService {

    private final RestTemplate restTemplate;

    public ExternalAPIService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getExternalData() {
        ResponseEntity<String> response = restTemplate.getForEntity("https://speakerscanada.com/json-api/?auth-key=sbcprivatekey&action=topics", String.class);
        return response.getBody();
    }
}
