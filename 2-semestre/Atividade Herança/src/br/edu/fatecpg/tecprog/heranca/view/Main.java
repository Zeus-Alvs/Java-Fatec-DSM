package br.edu.fatecpg.tecprog.heranca.view;
import br.edu.fatecpg.tecprog.heranca.model.*;

public class Main {

	public static void main(String[] args) {
		PagamentoCartao cartao = new PagamentoCartao(600);
		PagamentoDinheiro dinheiro = new PagamentoDinheiro(1150);
		
		dinheiro.calcularPagamento(100);
		cartao.calcularPagamento(100);
		
		System.out.println(dinheiro.emitirRecibo());
		System.out.println(cartao.emitirRecibo());
		
		SistemaDeSeguranca seguranca = new SistemaDeSeguranca();
		
		seguranca.login("admin", "1234");
		seguranca.conta();
		seguranca.logout();
		seguranca.conta();
		seguranca.login("teste", "1234");
		
	}

}
