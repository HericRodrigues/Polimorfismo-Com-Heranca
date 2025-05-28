package TestePolimorfismo6;

class Metro implements Transporte {
    private double tarifaBase = 5.00;

    @Override
    public double calcularTarifa() {
        return tarifaBase;
    }

    @Override
    public String getTipo(){
        return "Metrô";
    }
}
