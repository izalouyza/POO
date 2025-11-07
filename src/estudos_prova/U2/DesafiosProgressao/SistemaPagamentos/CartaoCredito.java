package DesafiosProgressao.SistemaPagamentos;

public class CartaoCredito implements ProcessadorPagamento {
    private double limite;

    //construtor
    public CartaoCredito(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean processar(double valor) {
        if (valor <= limite) {
            System.out.printf("Pagamento de R$ %.2f aprovado no Cartão de Crédito\n", valor);
            return true;
        } else {
            System.out.printf("Pagamento de R$ %.2f não foi efetuado por falta de limite.\n", valor);
            return false;
        }
    }
}

