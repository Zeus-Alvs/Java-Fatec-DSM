package br.edu.fatecpg.tecpprog.estruturada.model;

public class Carro {
	public String cor;
	public String modelo;
	public double CapacidadeTanque;
	public boolean ligado = false;
	public boolean acelera = false;
	
	public void ligar() {
		if(ligado) {
			System.out.println("O carro está ligado");
		}else {
			System.out.println("Ligando o carro");
			ligado = true;
		}
	}
	public void acelerar() {
		if(ligado) {
			System.out.println("Acelerando...");
			acelera = true;
		}else {
			System.out.println("O carro está desligado");
		}
	}
	public void frear() {
		if(acelera) {
			System.out.println("Freando...");
			acelera = false;
		}else {
			System.out.println("O carro está parado");
		}
	}
	public void buzinar() {
		if(ligado) {
			System.out.println("BI BI BI BI");
		}else {
			System.out.println("O carro está desligado");
		}
	}
	public void desligar() {
		if(ligado && !acelera) {
			System.out.println("Desligando...");
			ligado = false;
		}
		if(acelera) {
			System.out.println("O carro ta andando.");
		}
		else {
			System.out.println("O carro já está desligado");
		}
	}
}
