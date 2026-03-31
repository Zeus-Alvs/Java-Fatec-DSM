package com.example.api_clima.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimaJson {

    @JsonProperty("timezone")
    private String timezone;

    @JsonProperty("current")
    private ClimaDados current;

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public ClimaDados getCurrent() {
        return current;
    }

    public void setCurrent(ClimaDados current) {
        this.current = current;
    }
}
