package SistemaDePagamentos;

public class Checkout {
    public void finalizarCompra(ProcessadorPagamento metodo, double valorTotal){
        System.out.println("\nProcessando pagamento...");
        boolean sucesso = metodo.processar(valorTotal);

        if(sucesso){
            System.out.println("Compra finalizada com sucesso!");
        }else{
            System.out.println("Falha ao processar o pagamento. Tente outro método.");
        }
    }
}
