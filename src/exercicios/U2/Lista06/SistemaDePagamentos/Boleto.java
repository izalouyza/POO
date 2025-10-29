package SistemaDePagamentos;

public class Boleto implements ProcessadorPagamento {
    @Override
    public boolean processar(double valor) {
        System.out.printf("\nBoleto de R$ %.2f gerado. Aguardando pagamento.\n", valor);
        return true;
    }
}
