package br.edu.fatecpg.fatec;
import br.edu.fatecpg.fatec.model.*;
import br.edu.fatecpg.fatec.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class FatecApplication implements CommandLineRunner {
	@Autowired
	private AlunoRepository rep;

	public static void main(String[] args) {
		SpringApplication.run(FatecApplication.class, args);
	}

	@Override
		public void run(String... args) throws Exception{
//			Aluno a1 = new Aluno("Ale","123.456.789.00");
//			Aluno a2 = new Aluno("Maria","321.456.789.00");
//			Aluno a3 = new Aluno("Joao","222.456.789.00");
//			rep.save(a1);
//			rep.save(a2);
//			rep.save(a3);

			List<Aluno> alunos = rep.findAll();
			alunos.forEach(System.out::println);
		}

}
