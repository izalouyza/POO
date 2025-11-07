package DesafiosProgressao.SistemaPagamentos;

public class Checkout {
    public void finalizarCompra(ProcessadorPagamento metodo, double valorTotal) {
        System.out.println("=====================");
        System.out.println("Finalizando compra de R$ " + valorTotal);

        boolean sucesso = metodo.processar(valorTotal);

        if (sucesso) {
            System.out.println("Transação concluída com sucesso!");
        } else {
            System.out.println("Falha na transação.");
        }
    }
}
