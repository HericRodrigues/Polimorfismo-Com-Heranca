package TestePolimorfismo5;

class BoletoBancario implements Pagamentos {
    private String codigosBarras;

    public BoletoBancario(String codigosBarras) {
        this.codigosBarras = codigosBarras;
    }
    @Override
    public void realizarPagamentos(double valor) {
        System.out.println("Boleto gerado com o código: " + codigosBarras);
        System.out.println("Pagamento de R$" + String.format("%.2f", valor) + " será processado em até 3 dias úteis.");
    }
}
