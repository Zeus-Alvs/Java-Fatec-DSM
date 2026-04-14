import java.util.*;
import java.util.stream.Collectors;

public class TesteStream {

    public static void main(String[] args) {

        //Populacao classe funcionario
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Joao", "TI", 2000, 5));
        funcionarios.add(new Funcionario("Ana", "Marketing", 2500, 4));
        funcionarios.add(new Funcionario("Maria", "Financeiro", 3000, 7));
        funcionarios.add(new Funcionario("Pedro", "TI", 6000, 12));
        funcionarios.add(new Funcionario("Antonio", "Financeiro", 5000, 13));
        funcionarios.add(new Funcionario("Luis", "Marketing", 2500, 9));
        funcionarios.add(new Funcionario("Marcos", "TI", 15000, 17));
        funcionarios.add(new Funcionario("Chris", "Financeiro", 9000, 7));

        //filtragem) retornar os funcionarios que ganham mais q 3000
        List<Funcionario> maioresSalario = funcionarios.stream()
                .filter(p -> p.getSalario()>3000)
                .toList();
        //Exibição
        maioresSalario.forEach(System.out::println);

        // mapeamento(map)) aumento de 5% para funcionarios que tem mais de 10 anos de servico
        List<Double> dezAnos = funcionarios.stream()
                .filter(a -> a.getAnoDeServico()>9)
                .map( a -> a.getSalario()*1.05)
                .toList();
        //Exibição
        dezAnos.forEach(System.out::println);

        //ordenacao(sorted)) ordenar os funcionarios em ordem alfabetica
        funcionarios.stream()
                .sorted(Comparator.comparing(Funcionario::getNome))
                //Exibição
                .forEach(System.out::println);

        //reducao(reduce)) calcule o total gasto com salarios, somandos os salarios de todos funcionarios
        double totalGasto = funcionarios.stream()
                .mapToDouble(f -> f.getSalario())
                .reduce(0, (soma, salario) -> soma + salario);
        //Exibição
        System.out.println("Total: " + totalGasto);

        //agrupamento(groupingby) agrupe os funcionarios por departamento para cada departamento, calculando a media dos salarios
        Map<String, Double> mediaPorDepto = funcionarios.stream()
                .collect(Collectors.groupingBy(
                        Funcionario::getDepartamento,
                        Collectors.averagingDouble(Funcionario::getSalario)
                ));
        //Exibição
        mediaPorDepto.forEach((depto, media) -> System.out.println(depto + " média: " + media));


        //Desafios adicionais
        Funcionario veterano = funcionarios.stream()
                .sorted((f1, f2) -> Integer.compare(f2.getAnoDeServico(), f1.getAnoDeServico()))
                .findFirst()
                .get();
        System.out.println("Veterano: " + veterano.getNome() + " com " + veterano.getAnoDeServico() + " anos.");

        funcionarios.forEach(f -> System.out.println(
                "Funcionário: " + f.getNome() + ", Departamento: " + f.getDepartamento() + ", Salário: R$ " + f.getSalario()
        ));

    }
}
