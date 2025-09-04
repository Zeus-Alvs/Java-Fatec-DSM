package br.edu.fatecpg.tecpprog.estruturada.model;

public class Motorista {
	public String Nome = "Roberto"; 
	public int Idade = 20; 
	public String Categoria = "B"; 
	public boolean Habilitacao = true; 
	public String Experiencia = "10 Anos";
	public boolean respeito = false;
	public boolean foco = false;

	public void Conduzir(){
		if (Idade > 18 && Habilitacao && respeito && foco) {
			System.out.println("Dirigindo...");
		}
	}
	public void Respeito(){
		respeito = true;
		
	}
	public void FoconoTransito(){
		foco = true;
	}
}
