package br.edu.fatecpg.tecprog.encapsulamento.model;

public class Produto {
	private String nome;
	private double preco;
	private int quantidadeEstoque;
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public double getPreco() {
		return this.preco;
	}
	public void setPreco(double novoPreco) {
		if (novoPreco >= 0) {
			this.preco = novoPreco;
		}
		else {
			System.out.println("Invalido: Valor negativo");
		}
	}

	public int getQuantidadeEstoque() {
		return this.quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int novoQuantidadeEstoque) {
		if(novoQuantidadeEstoque >= 0) {
			this.quantidadeEstoque = novoQuantidadeEstoque;
		}
		else {
			System.out.println("Invalido: Valor negativo");
		}
	}

}
