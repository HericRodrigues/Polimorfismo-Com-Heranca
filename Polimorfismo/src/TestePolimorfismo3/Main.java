package TestePolimorfismo3;

public class Main {
    public static void main(String[] args) {

        Forma f1 = new Quadrado(4);
        Forma c1 = new Circulo(2.2);

        System.out.println("Área do quadrado: " + f1.calcularArea());
        System.out.println("Área do Círculo: " + c1.calcularArea());
    }
}


//Descrição:
//Crie uma classe abstrata Forma com o método calcularArea().
//Depois, crie as classes Quadrado e Circulo que estendem Forma e implementam
//o método calcularArea() com as respectivas fórmulas.
