package br.edu.fatecpg.tecprog.polimorfismo.model;

public class Conversor {
	public int converter(int n1) {
		return (n1 * 9/5) + 32;
	}
	public double converter(double n1) {
		return n1 / 1.609;
	}
	public String converter(String p) {
		return p.toUpperCase();
	}
}
