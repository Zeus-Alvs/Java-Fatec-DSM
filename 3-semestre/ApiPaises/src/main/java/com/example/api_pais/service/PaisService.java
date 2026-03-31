package com.example.api_pais.service;

import com.example.api_pais.model.Pais;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PaisService {

    @Value("${pais.api.url}")
    private String apiUrl;

    private final RestTemplate restTemplate = new RestTemplate();
    private final ObjectMapper objectMapper = new ObjectMapper();

    public Pais buscarPais(String pais) {
        String url = apiUrl + pais;
        try {
            String json = restTemplate.getForObject(url, String.class);
            Pais[] listaDePaises = objectMapper.readValue(json, Pais[].class);
            return listaDePaises[0];
        } catch (Exception e) {
            return null;
        }
    }
}
