package br.edu.fatecpg.tecprog.polimorfismo.model;

public class PagamentoCartao extends Pagamento{

	@Override
	public String processarPagamento() {
		return "Processando pagamento via cartao de credito";
	}
	
}
