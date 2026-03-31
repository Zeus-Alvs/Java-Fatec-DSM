package com.example.api_clima.controller;

import com.example.api_clima.model.ClimaJson;
import com.example.api_clima.service.ClimaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClimaController {

    private final ClimaService climaService;

    public ClimaController(ClimaService climaService) {
        this.climaService = climaService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/buscar")
    public String buscar(@RequestParam("latitude") String lat, @RequestParam("longitude") String lon, Model model) {
        ClimaJson resultado = climaService.buscarClima(lat, lon);
        model.addAttribute("clima", resultado);
        return "resultado";
    }
}
