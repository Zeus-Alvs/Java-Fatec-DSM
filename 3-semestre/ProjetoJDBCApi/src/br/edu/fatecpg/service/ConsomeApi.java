package br.edu.fatecpg.service;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class ConsomeApi {


    public static String buscarCnpj(String cnpjDigitado) throws IOException, InterruptedException {

        HttpClient clienteHttp = HttpClient.newHttpClient();

        HttpRequest requisicao = HttpRequest.newBuilder()
                .uri(URI.create("https://brasilapi.com.br/api/cnpj/v1/" + cnpjDigitado))
                .GET()
                .build();

        HttpResponse<String> resposta =
                clienteHttp.send(requisicao, HttpResponse.BodyHandlers.ofString());

        return resposta.body();
    }
}
