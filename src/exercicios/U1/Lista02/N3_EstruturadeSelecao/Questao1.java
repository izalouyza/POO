package N3_EstruturadeSelecao;

import java.util.Scanner;

public class Questao1 {
    public static void calculadora() {
        Scanner input = new Scanner(System.in);

        int opcao, n1, n2;

        System.out.println("""
                CALCULADORA
                
                1 - Adição
                2 - Subtração
                3 - Multiplicação
                4 - Divisão""");

        System.out.print("Escolha uma opção: ");
        opcao = input.nextInt();

        System.out.print("Informe um número: ");
        n1 = input.nextInt();

        System.out.print("Informe outro número: ");
        n2 = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Resultado da soma: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Resultado da subtração: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Resultado da multiplicação: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Resultado da divisão: " + ((double) n1 / n2));
                } else {
                    System.out.println("Erro: divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
