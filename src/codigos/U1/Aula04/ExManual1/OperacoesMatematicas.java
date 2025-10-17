package ExManual1;

import java.util.Scanner;

public class OperacoesMatematicas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe dois números: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        int soma = n1 + n2;
        int subtracao = n1 - n2;
        int multiplicacao = n1 * n2;
        double divisao = n1/n2;

        System.out.printf("%d + %d = %d", n1, n2, soma);
        System.out.printf("%d - %d = %d", n1, n2, subtracao);
        System.out.printf("%d * %d = %d", n1, n2, multiplicacao);
        System.out.printf("%d / %d = %.1f", n1, n2, divisao);
    }
}
