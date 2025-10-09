package br.edu.fatecpg.provaa.view;
import br.edu.fatecpg.provaa.model.*;

public class Main {

	public static void main(String[] args) {
		
		//Main 6) Carro
		
		Carro novoCarro = new Carro();
		
		novoCarro.marca = "Hyundai";
		novoCarro.modelo = "HB20";
		novoCarro.ano = 2020;
		System.out.println("Marca: " + novoCarro.marca + " Modelo: " + novoCarro.modelo + " Ano: " + novoCarro.ano);
		
		//Main 7) Aluno
		
		Aluno novoAluno = new Aluno();
		novoAluno.setNome("Joao");
		novoAluno.setMatricula(123);
		novoAluno.setNotaFinal(7.5);
		System.out.println("Nome: " + novoAluno.getNome() +
							" Matricula " + novoAluno.getMatricula() +
							" Nota Final: " + novoAluno.getNotaFinal());
		
		
	}

}
