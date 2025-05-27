package TestePolimorfismo2;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Carlos", 3000 );
        Funcionario g1 = new Gerente("Heric", 5000, "Dev");
        Funcionario h1 = new Vendedor("Eduarda",2000, 300);

        f1.exibirDados();
        System.out.println();

        g1.exibirDados();
        System.out.println();

        h1.exibirDados();
    }
}


//Descrição:
//Crie uma classe Funcionario com atributos nome e salario.
//Crie duas subclasses: Gerente (com o atributo adicional departamento)
//e Vendedor (com o atributo comissao).
//Adicione um método calcularSalario()
//que será sobrescrito nas subclasses para incluir cálculos específicos.