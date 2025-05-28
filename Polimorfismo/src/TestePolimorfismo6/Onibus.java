package TestePolimorfismo6;

class Onibus implements Transporte {
    private double tarifaBase = 4.50;

    @Override
    public double calcularTarifa(){
        return tarifaBase;
    }

    @Override
    public String getTipo() {
        return "Ônibus";
    }


}
