package br.edu.fatecpg.tecpprog.estruturada.model;

public class Bombeiro {
	public String Nome = "Rodrigo";
	public int Idade = 25;
	public String Especializacao = "Salvar animais";
	public int ExperienciaemAnos = 5; 
	public String Departamento = "Animal";
	public String vitima;

	public void ResgatedeVitimas(){
		if(vitima == Departamento) {
			System.out.println("Salvando...");
		}
		else {
			System.out.println("Fora do departamento.");
		}
	}
	public void CombaterIncendios(){
		if(ExperienciaemAnos > 2) {
			System.out.println("Combatendo fogo...");
		}
		else {
			System.out.println("Sem experiencia.");
		}
	}
	public void Proteger(){
		if(ExperienciaemAnos > 5) {
			System.out.println("Protegendo vitimas...");
		}
		else {
			System.out.println("Sem experiencia.");
		}
	}
}
