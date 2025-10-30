package br.edu.fatecpg.tecprog.polimorfismo.model;

public class PagamentoBoleto extends Pagamento{

	@Override
	public String processarPagamento() {
		return "Processando pagamento via boleto bancario";
	}

}
