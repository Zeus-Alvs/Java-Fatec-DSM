package br.edu.fatecpg.jdbc.view;
import br.edu.fatecpg.jdbc.controller.TarefaController;
import br.edu.fatecpg.jdbc.model.*;
import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Iniciando teste...");

        try{
            Connection conectar = Conexao.pegarConexao();
            System.out.println("Sucesso, conectado.");
        } catch (Exception e) {
            System.out.println("Falha na conexão!");
            System.out.println("Erro: " + e.getMessage());
        }

        Scanner scanner = new Scanner(System.in);

        TarefaController controller = new TarefaController();
        int opcao = -1;

        System.out.println("Bem-vindo ao sistema de gestão de tarefas!");

        while (opcao != 0) {


            System.out.print("\n1. Nova | 2. Listar | 3. Concluir | 4. Excluir | 0. Sair\nOpção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();
                    System.out.print("ID Categoria(1-3: ");
                    controller.adicionarTarefa(titulo, descricao, scanner.nextInt());
                    break;

                case 2:
                    System.out.print("\nComo deseja listar?\n1. Todas | 2. Por Status | 3. Por Categoria\nEscolha: ");
                    int tipoLista = scanner.nextInt();
                    List<Tarefa> lista = null;

                    if (tipoLista == 1) {
                        lista = controller.listarTarefas();

                    } else if (tipoLista == 2) {
                        System.out.print("Qual status? (1 para Concluída, 0 para Pendente): ");
                        boolean status = scanner.nextInt() == 1;
                        lista = controller.listarPorStatus(status);

                    } else if (tipoLista == 3) {
                        System.out.print("Digite o ID da Categoria: ");
                        int catId = scanner.nextInt();
                        lista = controller.listarPorCategoria(catId);

                    } else {
                        System.out.println("Opção de filtro inválida!");
                        break;
                    }

                    if (lista != null) {
                        System.out.println("\n--- TAREFAS ---");
                        for (Tarefa t : lista) {
                            String status = t.isConcluida() ? "[X]" : "[ ]";
                            System.out.println(t.getId() + " - " + status + " " + t.getTitulo() + " (Cat: " + t.getCategoriaId() + ")");
                        }
                    }
                    break;

                case 3:
                    System.out.print("ID para concluir: ");
                    controller.concluirTarefa(scanner.nextInt());
                    break;

                case 4:
                    System.out.print("ID para excluir: ");
                    controller.excluirTarefa(scanner.nextInt());
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }

}

