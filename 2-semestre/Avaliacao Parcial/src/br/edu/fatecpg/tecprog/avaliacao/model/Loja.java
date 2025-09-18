package br.edu.fatecpg.tecprog.avaliacao.model;

public class Loja {
	private String[] nomesProdutos;
	private int[] quantidadeEstoque;
	private double[] precosProdutos;
	
	// Construtor para o tamanho dos array
	public Loja(int qtd) {
			nomesProdutos = new String[qtd];
			quantidadeEstoque = new int[qtd];
			precosProdutos = new double[qtd];
	}
	
	// Setter para definir os produtos da loja
	public void setProdutos(int i, String n, double p, int q) {
		this.nomesProdutos[i-1] = n;
		this.precosProdutos[i-1] = p;
		this.quantidadeEstoque[i-1] = q;
	}
	
	// Exibir todos os produtos com preços e quantidades em estoque.
	public void getProdutos() {
		for (int i = 0; i < this.nomesProdutos.length; i++) {
			System.out.println("Nome: " + this.nomesProdutos[i] + 
								" Preco: R$" + this.precosProdutos[i] + 
								" Quantidade em Estoque: " + this.quantidadeEstoque[i]);
		}


	}
	
	// Calcular o produto mais caro e o mais barato da loja.
	public void caroBarato() {
		int mai = 0;
		int mei = 0;
		
		for(int i = 0; i < this.nomesProdutos.length;i++) {
			if(this.nomesProdutos[i].equals(null)) {
				break;
			}
			else if(this.precosProdutos[i] > this.precosProdutos[mai]) {
				mai = i;
			}
			else if (this.precosProdutos[i] < this.precosProdutos[mei]) {
				mei = i;
			}
		}
		System.out.println("Produto de Menor valor: " + this.nomesProdutos[mei] + " R$" + this.precosProdutos[mei]);
		System.out.println("Produto de Maior valor: " + this.nomesProdutos[mai] + " R$" + this.precosProdutos[mai]);
	}
	
	// Calcular o valor total em estoque (preço × quantidade de cada item).
	public void valorTotalEstoque() {
		int valorTotal = 0;
		for(int i = 0; i<this.nomesProdutos.length; i++) {
			valorTotal += this.precosProdutos[i] * this.quantidadeEstoque[i];
		}
		System.out.println("Valor total em estoque: R$" + valorTotal);
	}
	
	// Comprar um produto, diminuindo sua quantidade em estoque.
	public void comprar(int n, int qtd) {
		this.quantidadeEstoque[n-1] = this.quantidadeEstoque[n-1] - qtd;
		System.out.println("Comprado " + qtd + " do produto " + this.nomesProdutos[n-1]);
	}
	
	// Repor um produto, aumentando a quantidade em estoque.
	public void repor(int n, int qtd) {
		this.quantidadeEstoque[n-1] = this.quantidadeEstoque[n-1] + qtd;
		System.out.println("Foi reposto " + qtd + " unidades do produto " + this.nomesProdutos[n-1]);
	}
	
}
