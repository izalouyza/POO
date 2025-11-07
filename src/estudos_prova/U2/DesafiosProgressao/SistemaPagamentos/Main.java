package DesafiosProgressao.SistemaPagamentos;

public class Main {
    public static void main(String[] args){
        Checkout checkout = new Checkout();

        ProcessadorPagamento cartao = new CartaoCredito(1000);
        ProcessadorPagamento pix = new Pix();
        ProcessadorPagamento boleto = new Boleto();

        checkout.finalizarCompra(cartao, 800);
        checkout.finalizarCompra(cartao, 1200);
        checkout.finalizarCompra(pix, 300);
        checkout.finalizarCompra(boleto, 150);
    }
}
