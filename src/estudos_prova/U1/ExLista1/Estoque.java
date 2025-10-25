package ExLista1;

import java.util.Scanner;

public class Estoque {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a quantidade mínima da peça: ");
        int qtdMin = input.nextInt();
        System.out.println("Informe a quantidade máxima da peça: ");
        int qtdMax = input.nextInt();

        double estoqueMedio = (qtdMin + qtdMax) / 2.0;

        System.out.printf("Estoque médio: %.1f", estoqueMedio);
    }
}
