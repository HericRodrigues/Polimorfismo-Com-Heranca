package TestePolimorfismo5;

class CartaoCredito implements Pagamentos {

    private String numeroCartao;
    private double limiteCartao;

    public CartaoCredito(String numeroCartao, double limiteCartao){
        this.numeroCartao = numeroCartao;
        this.limiteCartao = limiteCartao;
    }
    @Override
    public void realizarPagamentos(double valor) {
        if (valor <= limiteCartao){
            limiteCartao -= valor;
            System.out.println("Pagamento de R$" + String.format("%.2f", valor) +
                    "Realizado com o Cartão de Crédito");
            System.out.println("Novo Limite  Disponível: R$" + String.format("%.2f",limiteCartao));
        }else {
            System.out.println("Pagamento recusado! Limite INSUFICIENTE!");
        }

    }
}
