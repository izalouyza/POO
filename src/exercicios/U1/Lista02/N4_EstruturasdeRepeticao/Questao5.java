package N4_EstruturasdeRepeticao;

import java.util.Scanner;

public class Questao5 {
    public static void imprimirTabuada() {
        Scanner input = new Scanner(System.in);

        int opcao, numTabuada;

        System.out.println("""
                TABUADA
                --------------
                1 - Adição
                2 - Subtração
                3 - Multiplicação
                4 - Divisão
                
                Escolha uma opção: """);
        opcao = input.nextInt();

        System.out.print("Informe o número: ");
        numTabuada = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("\nTABUADA DA ADIÇÃO");
                for (int i = 0; i <= 10; i++) {
                    System.out.printf("%d + %d = %d\n", numTabuada, i, numTabuada + i);
                }
                break;
            case 2:
                System.out.println("\nTABUADA DA SUBTRAÇÃO");
                for (int i = 0; i <= 10; i++) {
                    System.out.printf("%d - %d = %d\n", numTabuada, i, numTabuada - i);
                }
                break;
            case 3:
                System.out.println("\nTABUADA DA MULTIPLICAÇÃO");
                for (int i = 0; i <= 10; i++) {
                    System.out.printf("%d x %d = %d\n", numTabuada, i, numTabuada * i);
                }
                break;
            case 4:
                System.out.println("\nTABUADA DA DIVISÃO");
                for (int i = 1; i <= 10; i++) {
                    double resultado = (double) numTabuada / i;
                    System.out.printf("%d ÷ %d = %.2f\n", numTabuada, i, resultado);
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
