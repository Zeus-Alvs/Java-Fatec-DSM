public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private int anoDeServico;

    public Funcionario(String nome, String departamento, double salario, int anoDeServico) {
        this.anoDeServico = anoDeServico;
        this.departamento = departamento;
        this.nome = nome;
        this.salario = salario;
    }

    public int getAnoDeServico() {
        return anoDeServico;
    }

    public void setAnoDeServico(int anoDeServico) {
        this.anoDeServico = anoDeServico;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "anoDeServico=" + anoDeServico +
                ", nome='" + nome + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                '}';
    }
}
