package br.edu.fatecpg.tecprog.encapsulamento.model;

public class Carro {
	private String marca;
	private String modelo;
	private int ano;
	private double tanque;
	private double capacidadeTanque;
	
	public Carro(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	//marca
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String novaMarca) {
		this.marca = novaMarca;
	}
	
	//modelo
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String novoModelo) {
		this.modelo = novoModelo;
	}
	
	//ano
	public int getAno() {
		return this.ano;
	}
	public void setAno(int novoAno) {
		this.ano = novoAno;
	}
	
	//tanque
	public double getTanque() {
		return this.tanque;
	}
	public void setTanque(double novoTanque) {
		this.tanque = novoTanque;
	}
	
	//Capacidade Tanque
	public double getCapacidadeTanque() {
		return this.capacidadeTanque;
	}
	public void setCapacidadeTanque(double novoCapacidadeTanque) {
		this.capacidadeTanque = novoCapacidadeTanque;
	}
	
	//////////
	
	public void ligar() {
		System.out.println("Carro ligado!");
	}
	public void acelerar() {
		System.out.println("Acelerando...");
	}
	
	public void calcularTanque(double preco) {
		double valorTotal = capacidadeTanque * preco;
		System.out.println("O valor para encher o tanque é: R$" + valorTotal);
	}
}
