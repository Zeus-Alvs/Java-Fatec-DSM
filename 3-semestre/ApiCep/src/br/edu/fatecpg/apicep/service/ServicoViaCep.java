package br.edu.fatecpg.apicep.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServicoViaCep {

    public static String buscarEndereco(String cepDigitado) throws IOException, InterruptedException {

        HttpClient clienteHttp = HttpClient.newHttpClient();

        HttpRequest requisicao = HttpRequest.newBuilder()
                .uri(URI.create("https://viacep.com.br/ws/" + cepDigitado + "/json/"))
                .GET()
                .build();

        HttpResponse<String> resposta =
                clienteHttp.send(requisicao, HttpResponse.BodyHandlers.ofString());

        return resposta.body();
    }
}