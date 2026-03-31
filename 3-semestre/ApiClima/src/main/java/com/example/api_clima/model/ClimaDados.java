package com.example.api_clima.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimaDados {

    @JsonProperty("temperature_2m")
    private Double temperature;

    @JsonProperty("windspeed_10m")
    private Double windspeed;

    @JsonProperty("weathercode")
    private Integer weather;

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(Double windspeed) {
        this.windspeed = windspeed;
    }

    public Integer getWeather() {
        return weather;
    }

    public void setWeather(Integer weather) {
        this.weather = weather;
    }

    public String getDescricao() {
        if (weather == null) return "Desconhecido";

        if (weather == 0) return "Céu limpo";
        if (weather >= 1 && weather <= 3) return "Parcialmente nublado";
        if (weather >= 45 && weather <= 48) return "Neblina";
        if (weather >= 61 && weather <= 67) return "Chuva";
        if (weather >= 71 && weather <= 77) return "Neve";
        if (weather >= 80 && weather <= 82) return "Pancadas de chuva";

        return "Condição climática (" + weather + ")";
    }
}
