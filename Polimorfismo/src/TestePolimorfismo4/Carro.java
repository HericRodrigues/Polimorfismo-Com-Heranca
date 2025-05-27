package TestePolimorfismo4;

public class Carro extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("O carro está muito rápido: ");
    }

    @Override
    public void frear(){
        System.out.println("O carro está com os freios bons.");
    }
}
