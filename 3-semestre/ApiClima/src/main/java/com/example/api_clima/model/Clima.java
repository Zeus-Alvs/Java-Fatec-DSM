package com.example.api_clima.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Clima {

    @JsonProperty("timezone")
    private String timezone;

    @JsonProperty("temperature_2m")
    private String temperature;

    @JsonProperty("windspeed_10m")
    private String windspeed;

    @JsonProperty("weathercode")
    private String weather;

}
