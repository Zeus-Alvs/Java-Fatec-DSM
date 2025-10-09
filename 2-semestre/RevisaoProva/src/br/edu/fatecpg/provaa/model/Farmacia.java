package br.edu.fatecpg.provaa.model;

public class Farmacia {
	private String[] nomesMedicamentos = new String[10];
	private int[] diasParaVencimento = new int[10];
	private double[] precos = new double[10];
	
	public void setFarmacia(String nome, int dias, double preco) {
		for(int i = 0; i < precos.length; i++) {
			if(this.nomesMedicamentos[i] == null) {
				this.nomesMedicamentos[i] = nome;
				this.precos[i] = preco;
				this.diasParaVencimento[i] = dias;
			}
			else if(i == (precos.length - 1)){
				System.out.println("Sem espaço no estoque.");
			}
		}
	}
	
	public void getFarmacia() {
		for(int i = 0; i < precos.length; i++) {
			System.out.println("Medicamento: " + nomesMedicamentos[i] + 
								" Dias para vencimento: " + diasParaVencimento[i] +
								" Preco: R$" + precos[i]);
		}
	}
	
	public void media() {
		int media = 0;
		for(int i = 0; i < precos.length; i++) {
			media += diasParaVencimento[i];
		}
		media = media / precos.length;
		System.out.println("A media de dias para vencimento e: " + media);
	}
	
	public void proximoVencer() {
		System.out.println("Produtos que estão proximos de vencer: ");
		for(int i = 0; i < precos.length; i++) {
			if(diasParaVencimento[i] < 5) {
				System.out.println(diasParaVencimento[i]);
			}
		}
	}
	
	public void desconto(){
		for(int i = 0; i < precos.length; i++) {
			if(diasParaVencimento[i] < 5) {
				precos[i] = precos[i] / 0.50;
			}
		}
	}
	
	public void vender(int i) {
		nomesMedicamentos[i - 1] = null;
		diasParaVencimento[i - 1] = 0;
		precos[i - 1] = 0;
	}
}
