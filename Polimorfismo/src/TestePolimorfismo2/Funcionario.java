package TestePolimorfismo2;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salrio){
        this.nome = nome;
        this.salario = salrio;
    }

    public Funcionario() {
    }

    public double calcularSalario(){
        return salario;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " +salario);
    }
}
