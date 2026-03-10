package br.edu.fatecpg.view;
import br.edu.fatecpg.db.Conexao;
import br.edu.fatecpg.service.DbService;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando teste...");

        try {
            Connection conectar = Conexao.pegarConexao();
            System.out.println("Sucesso, conectado.");
        } catch (Exception e) {
            System.out.println("Falha na conexão!");
            System.out.println("Erro: " + e.getMessage());
        }

        Scanner scanner = new Scanner(System.in);
        DbService service = new DbService();

        System.out.print("Digite o CNPJ (com ou sem pontuação): ");
        String cnpj = scanner.nextLine();

        service.cadastrarFornecedor(cnpj);

        scanner.close();
        System.out.println("Sistema encerrado.");
    }
}
