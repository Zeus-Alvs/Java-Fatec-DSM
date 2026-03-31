package com.example.api_pais.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Flags {

    @JsonProperty("png")
    private String png;

    public String getPng() {
        return png;
    }

    public void setPng(String png) {
        this.png = png;
    }
}
