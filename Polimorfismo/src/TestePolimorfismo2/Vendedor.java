package TestePolimorfismo2;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, double salario, double comissao) {
        super(nome, salario);
        this.comissao = comissao;
    }

@Override
    public double calcularSalario(){
        return salario + comissao;
}
@Override
    public void exibirDados(){
        super.exibirDados();
    System.out.println("Comissão: R$" + comissao);
}
}
