package br.edu.fatecpg.tecpprog.estruturada.model;

public class Policial {
	public String Nome = "Ronaldo";
	public int idade = 30; 
	public int patente = 3; 
	public String AreadeAtuação = "Rua"; 
	public String departamento = "Crimes";
	
	
	public void Abordar() {
		if(patente > 1) {
			System.out.println("Começar Abordagem...");
		}
		else {
			System.out.println("Patente muito baixa para abordar.");
		}
	}
	public void Patrulhar() {
		if(patente > 2) {
			System.out.println("Patrulhando...");
		}
		else {
			System.out.println("Patente muito baixa para abordar.");
		}
	}
	public void Investigar() {
		if(patente > 3) {
			System.out.println("Começar Investigação...");
		}
		else {
			System.out.println("Patente muito baixa para investigar");
		}
	}
}
