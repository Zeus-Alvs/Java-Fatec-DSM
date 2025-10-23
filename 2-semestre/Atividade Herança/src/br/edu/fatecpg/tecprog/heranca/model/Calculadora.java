package br.edu.fatecpg.tecprog.heranca.model;

public class Calculadora implements IOperacaoMatematica {
	private double x;
	private double y;
	
	public Calculadora(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	@Override
	public double soma() {
		return x + y;
	}
	@Override
	public double subtracao() {
		return x - y;
	}
	@Override
	public double multiplicacao() {
		return x * y;
	}
	@Override
	public double divisao() {
		return x / y;
	}
	
	
}
