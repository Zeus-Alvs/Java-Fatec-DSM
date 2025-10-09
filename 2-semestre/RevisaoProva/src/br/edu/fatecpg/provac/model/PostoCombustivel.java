package br.edu.fatecpg.provac.model;

public class PostoCombustivel {
	private String[] tiposCombustivel = new String[5];
	private double[] precosLitro = new double[5];
	private int[] litrosDisponiveis = new int[5];
	
	public void setPostoCombustivel(String nome, int litros, double preco) {
		for(int i = 0; i < tiposCombustivel.length; i++) {
			if(this.tiposCombustivel[i] == null) {
				this.tiposCombustivel[i] = nome;
				this.precosLitro[i] = preco;
				this.litrosDisponiveis[i] = litros;
			}
			else if(i == (tiposCombustivel.length - 1)){
				System.out.println("Sem espaço no posto.");
			}
		}
	}
	
	public void getPostoCombustivel() {
		for(int i = 0; i < tiposCombustivel.length; i++) {
			System.out.println("Tipo de Combustivel: " + tiposCombustivel[i] + 
								" Quantidade disponivel: " + litrosDisponiveis[i] +
								" Preco por litro: R$" + precosLitro[i]);
		}
	}
	
	public void valorTotal() {
		for(int i = 0; i < tiposCombustivel.length; i++) {
			System.out.println(tiposCombustivel[i] + " Tem em estoque R$" + (precosLitro[i] * litrosDisponiveis[i]));
		}
	}
	
	public void maiorEstoque() {
		int maior = 0;
		int menor = 0;
		for(int i = 0; i < tiposCombustivel.length; i++){
			if(litrosDisponiveis[maior] < litrosDisponiveis[i]) {
				maior = i;
			}
			if(litrosDisponiveis[menor] < litrosDisponiveis[i]) {
				menor = i;
			}
		}
		System.out.println("Combustivel maior estoque: " + tiposCombustivel[maior] + " Com " + litrosDisponiveis[maior] + "L");
		System.out.println("Combustivel menor estoque: " + tiposCombustivel[menor] + " Com " + litrosDisponiveis[menor] + "L");
	}
	
	public void venda(int i, int qtde) {
		litrosDisponiveis[i - 1] -= qtde;
	}
	
	public void reabastecer(int i, int qtde) {
		litrosDisponiveis[i - 1] += qtde;
	}
}
