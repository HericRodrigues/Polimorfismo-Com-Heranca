package TestePolimorfismo4;

public class Moto extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("A moto está a milhão");
    }
    @Override
    public void frear(){
        System.out.println("A moto está boa nos freio kkk.");
    }
}
