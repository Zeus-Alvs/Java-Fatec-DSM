package br.edu.fatecpg.tecpprog.estruturada.view;
import br.edu.fatecpg.tecpprog.estruturada.model.*;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro();
		Carro NovoCarro = new Carro();
		carro.ligar();
		carro.acelerar();
		carro.desligar();
		
		
		NovoCarro.desligar();
		NovoCarro.ligar();
		NovoCarro.buzinar();
		NovoCarro.acelerar();
		NovoCarro.desligar();
		NovoCarro.frear();
		NovoCarro.desligar();
		
		Bombeiro bombeiro = new Bombeiro();
		Bombeiro bombeiro2 = new Bombeiro();
		
		System.out.println("Nome do bombeiro: " + bombeiro2.Nome);
		bombeiro.CombaterIncendios();
		
		Policial policial = new Policial();
		Policial policial2 = new Policial();
		
		System.out.println("Nome do policial: " + policial.Nome);
		policial2.Patrulhar();
		
		Motorista motorista = new Motorista();
		Motorista motorista2 = new Motorista();
		
		System.out.println("Nome do motorista: " + motorista.Nome);
		motorista2.Respeito();
		motorista2.FoconoTransito();
		motorista2.Conduzir();
	}

}
