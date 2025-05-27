package TestePolimorfismo5;

public class Main {
    public static void main(String args[]){
        Pagamentos pagamento1 = new CartaoCredito("1234-5678-9012-3456",
                1000.00);
        Pagamentos pagamento2 =
                new BoletoBancario("23790.12345 67890.123456 78901.234567 8 12345678901234");

        pagamento1.realizarPagamentos(250.00);
        System.out.println();

        pagamento2.realizarPagamentos(500.00);
    }

}

//Descrição:
//Crie uma interface Pagamento com o método realizarPagamento(double valor).
//Implemente esta interface nas classes CartaoCredito e BoletoBancario,
//cada uma com uma lógica diferente para processar o pagamento.