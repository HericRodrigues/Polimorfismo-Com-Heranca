package TestePolimorfismo6;

import java.util.ArrayList;
import java.util.List;

class Usuario {
    private String nome;
    private List<Transporte> historicoTransporte;

    public Usuario(String nome) {
        this.nome = nome;
        this.historicoTransporte = new ArrayList<>();
    }

    public void utilizarTransporte(Transporte transporte){
        historicoTransporte.add(transporte);
        System.out.println(nome+ "Utilizou:  " + transporte.getTipo() +
                " - Tarifa: R$" + transporte.calcularTarifa());
    }

    public double calcularTotalGasto() {
        double total = 0;
        for (Transporte t: historicoTransporte) {
            total += t.calcularTarifa();
        }
        return total;
    }
}
