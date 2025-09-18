package br.edu.fatecpg.tecprog.avaliacao.model;

public class Biblioteca {
	private String[] livros;
	private int[] diasAtraso;
	private double[] multaPorDia;
	private String[] livroAlugado; 
	private int[] diasAtrasoAlugado; 
	private double[] multaPorDiaAlugado; 
	
	// Construtor para o tamanho dos array
	public Biblioteca(int qtd) {
			livros = new String[qtd];
			diasAtraso = new int[qtd];
			multaPorDia = new double[qtd];
			livroAlugado = new String[qtd];
			diasAtrasoAlugado = new int[qtd];
			multaPorDiaAlugado = new double[qtd];
	}
	
	// Setter para definir os livros da biblioteca
	public void setLivros(int i, String n, double p, int q) {
		this.livros[i-1] = n;
		this.multaPorDia[i-1] = p;
		this.diasAtraso[i-1] = q;
	}
	
	// Mostrar todos os livros cadastrados com seus respectivos dias de atraso e multa por dia.
	public void getLivros() {
		for (int i = 0; i < this.livros.length; i++) {
			System.out.println("Nome: " + this.livros[i] + 
								" Dias atrasado: " + this.diasAtraso[i] + 
								" Multa por dia: " + this.multaPorDia[i]);
		}
	}
	
	// Calcular a multa total acumulada para todos os livros atrasados.
	public void multaTotal() {
		int valorTotal = 0;
		for(int i = 0; i<this.livros.length; i++) {
			valorTotal += this.multaPorDia[i] * this.diasAtraso[i];
		}
		System.out.println("Valor total de multa: R$" + valorTotal);
	}
	
	// Calcular a média de dias de atraso dos livros devolvidos com atraso
	public void mediaAtraso() {
		int media = 0;
		
		for(int i = 0; i < this.livros.length;i++) {
				media += this.diasAtraso[i];
		}
		media = media / this.livros.length;
		System.out.println("Media de atraso é: " + media);
	}
	
	
	// Emprestar um livro, removendo-o temporariamente do array de disponíveis.
	public void alugar(int n) {  
		this.livroAlugado[n-1] = this.livros[n-1]; 
		this.diasAtrasoAlugado[n-1] = this.diasAtraso[n-1];
		this.multaPorDiaAlugado[n-1] = this.multaPorDia[n-1];
		this.livros[n-1] = null;
		this.diasAtraso[n-1] = 0;
		this.multaPorDia[n-1] = 0;
		System.out.println("Emprestou o livro " + this.livroAlugado[n-1]);
	}
	
	// Devolver um livro informando os dias de atraso, atualizando o cálculo de multa
	public void devolver(int n, int d) {
		this.livros[n-1] = this.livroAlugado[n-1];
		this.diasAtraso[n-1] = this.diasAtrasoAlugado[n-1] + d;
		this.multaPorDia[n-1] = this.multaPorDiaAlugado[n-1];
		this.livroAlugado[n-1] = null;
		this.diasAtrasoAlugado[n-1] = 0;
		this.multaPorDiaAlugado[n-1] = 0;
		System.out.println("Livro devolvido, dias atrasados: " + d);
	}
}
