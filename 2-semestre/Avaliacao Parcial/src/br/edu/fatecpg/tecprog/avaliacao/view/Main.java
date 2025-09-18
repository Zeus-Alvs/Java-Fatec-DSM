package br.edu.fatecpg.tecprog.avaliacao.view;
import br.edu.fatecpg.tecprog.avaliacao.model.*;

public class Main {

	public static void main(String[] args) {
		
		
		// loja
		Loja minhaLoja = new Loja(3);
		minhaLoja.setProdutos(1, "miojo", 3, 10);
		minhaLoja.setProdutos(2, "arroz", 10, 7);
		minhaLoja.setProdutos(3, "feijao", 5, 9);
		
		minhaLoja.getProdutos();
		minhaLoja.comprar(1, 3);
		minhaLoja.getProdutos();
		minhaLoja.caroBarato();
		minhaLoja.repor(2, 5);
		minhaLoja.valorTotalEstoque();
		
		
		//video locadora
		Videolocadora minhaVideolocadora = new Videolocadora(3);
		
		minhaVideolocadora.setFilmes(1, "Senhor dos aneis", 15, 8);
		minhaVideolocadora.setFilmes(2, "Frozen", 8, 27);
		minhaVideolocadora.setFilmes(3, "Invocação do mal", 20, 12);
		
		minhaVideolocadora.getFilmes();
		minhaVideolocadora.alugar(2);
		minhaVideolocadora.getFilmes();
		minhaVideolocadora.maisAlugado();
		minhaVideolocadora.faturamentoTotal();
		minhaVideolocadora.devolver(2);
		System.out.println(minhaVideolocadora.devolver(2));
		
		
		//biblioteca 
		Biblioteca minhaBiblioteca = new Biblioteca(3);
		
		minhaBiblioteca.setLivros(1, "pequeno principe", 5, 22);
		minhaBiblioteca.setLivros(2, "harry potter", 4, 12);
		minhaBiblioteca.setLivros(3, "turma da monica", 15, 2);
		
		minhaBiblioteca.mediaAtraso();
		minhaBiblioteca.multaTotal();
		minhaBiblioteca.alugar(2);
		minhaBiblioteca.getLivros();
		minhaBiblioteca.devolver(2, 10);
		minhaBiblioteca.getLivros();
		
		
	}

}
