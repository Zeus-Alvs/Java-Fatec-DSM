package br.edu.fatecpg.fatec;

import br.edu.fatecpg.fatec.model.*;
import br.edu.fatecpg.fatec.repository.AlunoRepository;
import br.edu.fatecpg.fatec.repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class FatecApplication implements CommandLineRunner {
    @Autowired
    private AlunoRepository rep;

    @Autowired
    private ReceitaRepository receitaRep;

    public static void main(String[] args) {
        SpringApplication.run(FatecApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
        rep.deleteAll();
        receitaRep.deleteAll();

        System.out.println("Nível 1 - Básico");

        Aluno a1 = new Aluno("Ale", "123.456.789-01", "MAT001", "ale@fatec.edu.br");
        Aluno a2 = new Aluno("Maria", "321.456.789-02", "MAT002", "maria@fatec.edu.br");
        Aluno a3 = new Aluno("Joao", "222.456.789-03", "MAT003", "joao@fatec.edu.br");
        Aluno a4 = new Aluno("Carla", "444.456.789-04", "MAT004", "carla@fatec.edu.br");
        Aluno a5 = new Aluno("Lucas", "555.456.789-05", "MAT005", "lucas@fatec.edu.br");
        Aluno a6 = new Aluno("Beatriz", "666.456.789-06", "MAT006", "beatriz@fatec.edu.br");

        rep.save(a1);
        rep.save(a2);
        rep.save(a3);
        rep.save(a4);
        rep.save(a5);
        rep.save(a6);

    
        System.out.println("\n--- Lista de Alunos (Apenas Nome e E-mail) ---");
        List<Aluno> alunos = rep.findAll();
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + " | E-mail: " + aluno.getEmail());
        }


        System.out.println("Nível 2 - Intermediário");

        System.out.println("\n--- Buscando Alunos com nome 'Maria' (via JPQL) ---");
        List<Aluno> buscaNome = rep.buscarPorNome("Maria");
        buscaNome.forEach(System.out::println);

        
        Long idPrimeiro = alunos.isEmpty() ? 1L : alunos.get(0).getId();
        System.out.println("\n--- Buscando Aluno pelo ID " + idPrimeiro + " ---");
        Optional<Aluno> alunoId = rep.findById(idPrimeiro);
        alunoId.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Aluno com ID " + idPrimeiro + " não encontrado.")
        );


        Long idSegundo = alunos.size() > 1 ? alunos.get(1).getId() : 2L;
        System.out.println("\n--- Removendo Aluno com ID " + idSegundo + " ---");
        try {
            rep.deleteById(idSegundo);
            System.out.println("Aluno removido com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao deletar: " + e.getMessage());
        }

        System.out.println("\n--- Lista Geral de Alunos Atualizada (Confirmando Deleção) ---");
        rep.findAll().forEach(System.out::println);

        System.out.println("Nível 3 - Avançado");

        Receita r1 = new Receita("Bolo de Chocolate", "Sobremesa", 25.50, true);
        Receita r2 = new Receita("Lasanha Bolonhesa", "Prato Principal", 45.00, false);
        Receita r3 = new Receita("Salada Caesar", "Entrada", 18.90, true);
        Receita r4 = new Receita("Sopa de Cebola", "Entrada", 15.00, false);
        Receita r5 = new Receita("Pudim de Leite", "Sobremesa", 12.00, true);

        receitaRep.save(r1);
        receitaRep.save(r2);
        receitaRep.save(r3);
        receitaRep.save(r4);
        receitaRep.save(r5);


        System.out.println("\n--- Receitas em Promoção ---");
        List<Receita> receitasPromo = receitaRep.buscarEmPromocao();
        receitasPromo.forEach(r -> System.out.println(
                "Nome: " + r.getNome() + " | Categoria: " + r.getCategoria() + " | Preço: R$" + r.getPreco()
        ));
    }
}
