package TestePolimorfismo6;

class Main {
    public static void main(String[] arg){
        Usuario usuario = new Usuario("Heric");

        Transporte onibus = new Onibus();
        Transporte metro = new Metro();
        Transporte bicicleta = new BicicletaCompartilhada(30);

        usuario.utilizarTransporte(onibus);
        usuario.utilizarTransporte(metro);
        usuario.utilizarTransporte(bicicleta);

        System.out.println("O Heric gastou o total de transporte: R$" +
                usuario.calcularTotalGasto() );
    }
}


//Simulador de Transporte Urbano (Interface + Herança + Polimorfismo)
//Objetivo:
//Crie uma interface Transporte com o método calcularTarifa().
//Crie classes:
//Onibus, Metro, BicicletaCompartilhada (cada uma calcula a tarifa de forma diferente).
//Extras (desafio):
//Simule viagens com diferentes tipos de transporte.
//Adicione uma classe Usuario que registra os meios de transporte que ele usou e o total gasto.

//✅ Interface → Define contrato Transporte com calcularTarifa() e getTipo().
//✅ Polimorfismo → Usuario usa qualquer transporte implementado via interface.
//✅ Encapsulamento → Tarifa específica dentro de cada classe.
//✅ Reutilização → Mesmo método utilizarTransporte() funciona para todos os tipos.