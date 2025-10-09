package br.edu.fatecpg.provac.view;
import br.edu.fatecpg.provac.model.*;

public class Main {

	public static void main(String[] args) {
		
		//Main 6) Celular
		
		Celular novoCelular = new Celular();
		novoCelular.marca = "Motorola";
		novoCelular.modelo = "G41";
		novoCelular.preco = 600;
		System.out.println("Marca: " + novoCelular.marca + 
							" Modelo: " + novoCelular.modelo +
							" Preco: " + novoCelular.preco);
		
		//Main 7) conta bancaria
		
		ContaBancaria novaConta = new ContaBancaria();
		novaConta.setTitular("Joao");
		novaConta.setNumeroConta(153035);
		novaConta.setSaldo(5000);
		
		System.out.println("Titular: " + novaConta.getTitular() +
							" Numero da Conta: " + novaConta.getNumeroConta() +
							" Saldo: " + novaConta.getSaldo());
	}

}
