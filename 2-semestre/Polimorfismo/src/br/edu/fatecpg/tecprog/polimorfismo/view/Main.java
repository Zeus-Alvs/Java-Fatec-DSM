package br.edu.fatecpg.tecprog.polimorfismo.view;
import br.edu.fatecpg.tecprog.polimorfismo.model.*;

public class Main {

	public static void main(String[] args) {
		Calculadora novaCalc = new Calculadora();
		System.out.println(novaCalc.somar(5, 10));   
		System.out.println(novaCalc.somar(5, 7, 12));
		System.out.println(novaCalc.somar(2.6, 16.9));
		
		
		Produto prod1 = new Produto("Miojo");
		Produto prod2 = new Produto("Arroz", 10.50);
		Produto prod3 = new Produto("Feijao", 6.30, 10);
		System.out.println(prod1.toString());
		System.out.println(prod2.toString());
		System.out.println(prod3.toString());
		
		PagamentoBoleto novoBol = new PagamentoBoleto();
		PagamentoCartao novoCart = new PagamentoCartao();		
		System.out.println(novoBol.processarPagamento());
		System.out.println(novoCart.processarPagamento());
		
		Conversor novoConv = new Conversor();
		double km = 5;
		System.out.println(novoConv.converter(30));
		System.out.println(novoConv.converter(km));
		System.out.println(novoConv.converter("zeus"));
	}

}
