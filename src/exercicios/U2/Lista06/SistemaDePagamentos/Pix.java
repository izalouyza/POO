package SistemaDePagamentos;

public class Pix implements ProcessadorPagamento{
    @Override
    public boolean processar(double valor) {
        System.out.printf("\nPagamento de R$ %.2f via PIX recebido com sucesso.\n", valor);
        return true;
    }
}
