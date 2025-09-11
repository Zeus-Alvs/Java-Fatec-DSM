package br.edu.fatecpg.tecprog.encapsulamento.model;

public class ContaBancaria {
	private String titular;
	private int saldo;
	
	public ContaBancaria(String titular, int saldo){
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void depositar(int valor) {
		if(valor > 0) {
			saldo = saldo + valor;
			System.out.println("O valor na conta de " + titular + " é: " + saldo);
		}
		else {
			System.out.println("Valor invalido.");
		}
	}
	
	public void sacar(int valor) {
		if (valor <= saldo) {
			saldo = saldo - valor;
			System.out.println("O valor na conta de " + titular + " é: " + saldo);
		}
		else {
			System.out.println("Quantidade indisponivel.");
		}
	}
}
