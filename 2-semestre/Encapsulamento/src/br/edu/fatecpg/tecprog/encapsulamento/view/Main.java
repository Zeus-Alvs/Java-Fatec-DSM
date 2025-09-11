package br.edu.fatecpg.tecprog.encapsulamento.view;
import br.edu.fatecpg.tecprog.encapsulamento.model.Carro;
import br.edu.fatecpg.tecprog.encapsulamento.model.ContaBancaria;
import br.edu.fatecpg.tecprog.encapsulamento.model.Produto;

public class Main {

	public static void main(String[] args) {
		Carro meuCarro = new Carro("Renault","Logan", 2015);
		
		meuCarro.setAno(2020);
		meuCarro.setCapacidadeTanque(50);
		
		System.out.println(meuCarro.getModelo());
		
		String marca = meuCarro.getMarca();
		System.out.println(marca);
		
		meuCarro.calcularTanque(8.50);
		meuCarro.ligar();
		meuCarro.acelerar();
		
		////////
		//Conta bancaria
		
		ContaBancaria minhaConta = new ContaBancaria("Ronaldo", 2000);
		
		minhaConta.depositar(500);
		minhaConta.sacar(1000);
		
		//////
		//Produto
		
		Produto meuProduto = new Produto();
		Produto meuProduto2 = new Produto();
		
		meuProduto.setNome("arroz");
		meuProduto.setPreco(10.00);
		meuProduto.setQuantidadeEstoque(13);
		System.out.println(meuProduto.getNome() + " R$" + meuProduto.getPreco() + " Qtde " + meuProduto.getQuantidadeEstoque());
		
		meuProduto2.setNome("feijao");
		meuProduto2.setPreco(-3.00);
		meuProduto2.setQuantidadeEstoque(-5);
		System.out.println(meuProduto2.getNome() + " R$" + meuProduto2.getPreco() + " Qtde " + meuProduto2.getQuantidadeEstoque());
	}

}
