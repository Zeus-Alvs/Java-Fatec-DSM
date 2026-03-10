package br.edu.fatecpg.apicep.view;

import br.edu.fatecpg.apicep.model.Endereco;
import br.edu.fatecpg.apicep.service.ServicoViaCep; // Import atualizado
import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        List<String> cepsPesquisados = new ArrayList<>();
        List<Endereco> enderecosSalvos = new ArrayList<>();

        Gson conversorGson = new Gson();
        Scanner teclado = new Scanner(System.in);
        int escolha = 0;

        while (escolha != 4) {
            System.out.println("\n===== MENU VIA CEP =====");
            System.out.println("[1] Pesquisar novo CEP");
            System.out.println("[2] Remover CEP da lista");
            System.out.println("[3] Ver Histórico e Lista");
            System.out.println("[4] Encerrar programa");
            System.out.print("Sua escolha: ");

            escolha = teclado.nextInt();
            teclado.nextLine();

            switch (escolha) {
                case 1:
                    try {
                        System.out.print("Informe o CEP (com ou sem traço): ");
                        String cepInformado = teclado.nextLine();

                        boolean jaCadastrado = false;


                        String cepLimpoDigitado = cepInformado.replace("-", "");

                        for (Endereco endAtual : enderecosSalvos) {
                            String cepLimpoLista = endAtual.getCep().replace("-", "");

                            if (cepLimpoLista.equals(cepLimpoDigitado)) {
                                jaCadastrado = true;
                                System.out.println("Atenção: Esse CEP já está na nossa lista -> " + endAtual.getLogradouro());
                                break;
                            }
                        }

                        if (!jaCadastrado) {

                            String jsonRetornado = ServicoViaCep.buscarEndereco(cepInformado);
                            Endereco novoEnd = conversorGson.fromJson(jsonRetornado, Endereco.class);

                            if (novoEnd.getCep() != null) {
                                enderecosSalvos.add(novoEnd);
                                System.out.println("Endereço salvo com sucesso: " + novoEnd.getLogradouro() + ", " + novoEnd.getBairro());
                            } else {
                                System.out.println("CEP não encontrado na base de dados.");
                            }
                        }

                        cepsPesquisados.add(cepInformado);

                    } catch (IOException | InterruptedException erro) {
                        System.out.println("Falha na comunicação com a API: " + erro.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Qual CEP você quer apagar? ");
                    String cepParaApagar = teclado.nextLine();


                    boolean apagou = enderecosSalvos.removeIf(item -> item.getCep().replace("-", "").equals(cepParaApagar.replace("-", "")));

                    if (apagou) {
                        System.out.println("Endereço deletado da memória.");
                    } else {
                        System.out.println("Esse CEP não está na lista de salvos.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- REGISTRO DE CEPS PESQUISADOS ---");
                    if (cepsPesquisados.isEmpty()) {
                        System.out.println("Você ainda não pesquisou nada.");
                    } else {

                        for (String c : cepsPesquisados) {
                            System.out.println("- " + c);
                        }
                    }

                    System.out.println("\n--- ENDEREÇOS SALVOS ATUALMENTE ---");
                    for (Endereco e : enderecosSalvos) {
                        System.out.println(e.toString());
                    }
                    break;

                case 4:
                    System.out.println("Fechando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
        teclado.close();
    }
}