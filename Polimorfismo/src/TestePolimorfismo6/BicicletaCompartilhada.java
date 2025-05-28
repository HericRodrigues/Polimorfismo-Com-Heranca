package TestePolimorfismo6;

public class BicicletaCompartilhada implements Transporte {
    private double tarifaPorMinuto = 0.50;
    private int minutosUsados;

    public BicicletaCompartilhada(int minutosUsados) {
        this.minutosUsados = minutosUsados;
    }

    @Override
    public double calcularTarifa() {
        return tarifaPorMinuto * minutosUsados;
    }

    @Override
    public String getTipo() {
        return "Bicicleta Compartilhada";
    }

}
