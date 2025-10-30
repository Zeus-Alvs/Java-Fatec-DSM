package br.edu.fatecpg.tecprog.polimorfismo.model;

public class Produto {
	private String nome;
	private double preco;
	private int qtde;
	
	public Produto(String nome) {
		this.nome = nome;
	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public Produto(String nome, double preco, int qtde) {
		this.nome = nome;
		this.preco = preco;
		this.qtde = qtde;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", qtde=" + qtde + "]";
	}

	
	
}
