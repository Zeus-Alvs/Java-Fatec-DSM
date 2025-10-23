package br.edu.fatecpg.tecprog.heranca.model;

public class PagamentoCartao implements IPagamento{
	private double dinheiro;
	private double recibo;
	
	public PagamentoCartao(double dinheiro) {
		super();
		this.dinheiro = dinheiro;
	}

	@Override
	public double calcularPagamento(double valor) {
		this.dinheiro -= valor + valor * 0.05;
		this.recibo = valor;
		return 1;
	}

	@Override
	public String emitirRecibo() {
		return "Pagamento de R$" + recibo + " + 5% de taxa efetuado. Valor atual da conta: R$" + dinheiro;
		
	}
	
}
