package br.edu.fatecpg.provab.view;
import br.edu.fatecpg.provab.model.*;

public class Main {

	public static void main(String[] args) {
		
		//Main 6) Livro
		
		Livro novoLivro = new Livro();
		novoLivro.titulo = "Turma da Monica";
		novoLivro.autor = "Mauricio";
		novoLivro.anoPublicacao = 2015;
		System.out.println("Titulo: " + novoLivro.titulo + " Autor: " + novoLivro.autor + 
				" Ano de Publicacao: " + novoLivro.anoPublicacao);
		
		// Main 7) Funcionario
		
		Funcionario novoFuncionario = new Funcionario();
		novoFuncionario.setNome("Joao");
		novoFuncionario.setSalario(1800);
		novoFuncionario.setCargo("Vendedor");
		
		System.out.println("Nome: " + novoFuncionario.getNome() 
							+ " Salario: " + novoFuncionario.getSalario()
							+ " Cargo: " + novoFuncionario.getCargo());
	}

}
