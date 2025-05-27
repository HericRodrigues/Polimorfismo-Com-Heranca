package TestePolimorfismo1;

public class Main {
    public static void main(String[] args) {
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();

        meuGato.fazerSom();
        meuCachorro.fazerSom();


    }
}

//Descrição:
//Crie uma classe base chamada Animal com o método fazerSom().
//Depois, crie as classes Cachorro e Gato que herdam de Animal e sobrescrevem
//o método fazerSom() para exibir sons característicos de cada animal.
//No programa principal, crie objetos das subclasses e chame o método fazerSom().