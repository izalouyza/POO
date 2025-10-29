package SistemaDePagamentos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Checkout checkout = new Checkout();

        ProcessadorPagamento cartaocredito = new CartaoCredito(1000);
        ProcessadorPagamento pix = new Pix();
        ProcessadorPagamento boleto = new Boleto();

        while(true) {
            System.out.print("\nInforme o valor da compra (0 para sair): ");
            double valor = input.nextDouble();

            if(valor == 0){
                System.out.print("Encerrando o sistema...");
                break;
            }

            System.out.print("""
                    Informe o método de pagamento:
                    1 - Cartão de Crédito
                    2 - PIX
                    3 - Boleto
                    Opção: \s""");
            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    checkout.finalizarCompra(cartaocredito, valor);
                    break;
                case 2:
                    checkout.finalizarCompra(pix, valor);
                    break;
                case 3:
                    checkout.finalizarCompra(boleto, valor);
                    break;
                default:
                    System.out.println("Método inválido. Tente novamente.");
                    continue;
            }
        }
    }
}
