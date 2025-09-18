package br.edu.fatecpg.tecprog.avaliacao.model;

public class Videolocadora {
	private String[] filmes;
	private int[] vezesAlugado;
	private double[] precosLocacao;
	
	// Construtor para o tamanho dos array
	public Videolocadora(int qtd) {
			filmes = new String[qtd];
			vezesAlugado = new int[qtd];
			precosLocacao = new double[qtd];
	}
	
	// Setter para definir os filmes da locadora
	public void setFilmes(int i, String n, double p, int q) {
		this.filmes[i-1] = n;
		this.precosLocacao[i-1] = p;
		this.vezesAlugado[i-1] = q;
	}
	
	// Listar os filmes com seus preços e quantas vezes já foram alugados.
	public void getFilmes() {
		for (int i = 0; i < this.vezesAlugado.length; i++) {
			System.out.println("Nome: " + this.filmes[i] + 
								" Preco: R$" + this.precosLocacao[i] + 
								" Vezes alugado: " + this.vezesAlugado[i]);
		}


	}
	
	// Calcular o faturamento total esperado se todos os filmes fossem alugados uma vez.
	public void faturamentoTotal() {
		int valorTotal = 0;
		for(int i = 0; i<this.filmes.length; i++) {
			valorTotal += this.precosLocacao[i];
		}
		System.out.println("Valor total esperado: R$" + valorTotal);
	}
	
	// Descobrir qual filme foi mais alugado.
	public void maisAlugado() {
		int mai = 0;
		
		for(int i = 0; i < this.filmes.length;i++) {
			if(this.filmes[i].equals(null)) {
				break;
			}
			else if(this.vezesAlugado[i] > this.vezesAlugado[mai]) {
				mai = i;
			}
		}
		System.out.println("Filme mais alugado: " + this.filmes[mai] + 
							" Vezes alugado:" + this.vezesAlugado[mai]);
	}
	
	
	// Alugar um filme, registrando +1 no contador do vezesAlugado.
	public void alugar(int n) {
		this.vezesAlugado[n-1] = this.vezesAlugado[n-1] + 1;
		System.out.println("Alugou o filme " + this.filmes[n-1]);
	}
	
	// Devolver um filme (apenas informar que foi devolvido, sem remover do array).
	public String devolver(int n) {
		return "Foi devolvido o filme " + this.filmes[n-1];
	}
	
}
