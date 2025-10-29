package SistemaDePagamentos;

public class CartaoCredito implements ProcessadorPagamento {
    private double limite;

    //construtor
    public CartaoCredito(double limite){
        this.limite = limite;
    }

    @Override
    public boolean processar(double valor) {
        if(valor <= limite){
            System.out.printf("\nPagamento de R$ %.2f aprovado no Cartão de Crédito.\n", valor);
            return true;
        }else{
            System.out.printf("\nPagamento de %.2f recusado! Limite insuficiente.\n", valor);
            return false;
        }
    }
}
