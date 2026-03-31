package com.example.api_pais.controller;

import com.example.api_pais.model.Pais;
import com.example.api_pais.service.PaisService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PaisController {

    private final PaisService paisService;

    public PaisController(PaisService paisService) {
        this.paisService = paisService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/buscar")
    public String buscar(@RequestParam("pais") String pais, Model model) {
        Pais resultado = paisService.buscarPais(pais);
        model.addAttribute("pais", resultado);
        return "resultado";
    }
}
