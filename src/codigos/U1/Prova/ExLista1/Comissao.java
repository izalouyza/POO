package ExLista1;

import java.util.Scanner;

public class Comissao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String identificacao;
        int codigoPeca;
        double precoUnitario;
        int qtdVendida;

        System.out.print("Informe a identificação do vendedor: ");
        identificacao = input.nextLine();
        System.out.print("Informe o código da peça: ");
        codigoPeca = input.nextInt();
        System.out.print("Informe o preço unitário da peça: ");
        precoUnitario = input.nextDouble();
        System.out.print("Informe a quantidade de peças vendida: ");
        qtdVendida = input.nextInt();

         double comissao = (precoUnitario * qtdVendida) * 0.05;

        System.out.printf("O valor de comissão do vendedor %s é %.2f", identificacao, comissao);
    }
}
