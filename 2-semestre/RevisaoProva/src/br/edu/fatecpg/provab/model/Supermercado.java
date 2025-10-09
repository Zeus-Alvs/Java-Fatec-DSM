package br.edu.fatecpg.provab.model;

public class Supermercado {
	private String[] nomesProdutos = new String[10];
	private double[] precos = new double[10];
	private double[] descontos = new double[10];
	
	public void getSupermercado() {
		for(int i = 0; i < precos.length; i++) {
			System.out.println("Produto: " + nomesProdutos[i] + " Preço sem desconto: R$" + precos[i]);
			System.out.println("Produto: " + nomesProdutos[i] + " Preco com desconto: R$" + 
								(precos[i] - (precos[i] / 100 * descontos[i])));
		}
	}
	
	public void totalCompra() {
		int total = 0;
		for(int i = 0; i < precos.length; i++) {
			total += precos[i] - (precos[i] / 100 * descontos[i]);
		}
		System.out.println("Valor total com desconto aplicado: R$" + total);
	}
	
	public void maiorEconomia() {
		double economia = precos[0] / 100 * descontos[0];
		int MC = 0;
		for(int i = 0; i < precos.length; i++) {
			if (economia < (precos[i] / 100 * descontos[i])) {
				economia = precos[i] / 100 * descontos[i];
				MC = i;
			}
		}
		System.out.println("Produto maior economia: " + nomesProdutos[MC] + " com economia de: R$" + economia);
	}
	
	public void Comprar(int i) {
		this.nomesProdutos[i - 1] = null;
		this.precos[i - 1] = 0;
		this.descontos[i - 1] = 0;
	}
	public void Repor(String nome, double preco, double desconto) {
		for(int i = 0; i < precos.length; i++) {
			if(this.nomesProdutos[i] == null) {
				this.nomesProdutos[i] = nome;
				this.precos[i] = preco;
				this.descontos[i] = desconto;
				break;
			}
			else if(i == (precos.length - 1)){
				System.out.println("Sem espaço no estoque.");
			}
		}
	}
}
