package TestePolimorfismo4;

public class Main {
    public static void main(String arg[]){

        Veiculo[] veiculos = new Veiculo[2];

        veiculos[0] = new Carro();
        veiculos[1] = new Moto();

        for (Veiculo v : veiculos){
            v.acelerar();
            v.frear();
            System.out.println();
        }


    }
}

//Descrição:
//Crie uma classe Veiculo com métodos acelerar() e frear().
//Depois, crie as classes Carro e Moto que herdam de Veiculo e
//sobrescrevem os métodos com comportamentos específicos.
//No programa principal, utilize um array de Veiculo para armazenar
//objetos Carro e Moto e, com polimorfismo, chame os métodos.