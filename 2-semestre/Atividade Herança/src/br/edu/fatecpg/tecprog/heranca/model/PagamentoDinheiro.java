package br.edu.fatecpg.tecprog.heranca.model;

public class PagamentoDinheiro implements IPagamento{
	private double dinheiro;
	private double recibo;
	
	public PagamentoDinheiro(double dinheiro) {
		super();
		this.dinheiro = dinheiro;
	}

	@Override
	public double calcularPagamento(double valor) {
		this.dinheiro -= valor + valor * 0.1;
		this.recibo = valor;
		return 1;
	}

	@Override
	public String emitirRecibo() {
		return "Pagamento de R$" + recibo + " + 10% de taxa efetuado. Valor atual da conta: R$" + dinheiro;
		
	}
	
}
