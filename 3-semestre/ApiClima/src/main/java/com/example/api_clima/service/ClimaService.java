package com.example.api_clima.service;

import com.example.api_clima.model.ClimaJson;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClimaService {

    @Value("${clima.api.url}")
    private String apiUrl;

    private final RestTemplate restTemplate = new RestTemplate();
    private final ObjectMapper objectMapper = new ObjectMapper();

    public ClimaJson buscarClima(String latitude, String longitude) {
        String url = apiUrl + "latitude=" + latitude + "&longitude=" + longitude;
        try {
            String json = restTemplate.getForObject(url, String.class);
            return objectMapper.readValue(json, ClimaJson.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
