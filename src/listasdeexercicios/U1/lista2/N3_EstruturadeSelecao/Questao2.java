package N3_EstruturadeSelecao;

import java.util.Scanner;

public class Questao2 {
    public static void verificacao() {
        Scanner input = new Scanner(System.in);

        int n1, n2, opcao;

        System.out.println("""
                MENU
                
                1 - Verificar se um dos números lidos é ou não múltiplo do outro
                2 - Verificar se os dois números lidos são pares
                3 - Verificar se a média dos dois números é maior ou igual a 7.
                4 - Sair""");

        System.out.print("Escolha uma opção: ");
        opcao = input.nextInt();

        if (opcao != 4) {
            System.out.println("Digite dois números inteiros: ");
            n1 = input.nextInt();
            n2 = input.nextInt();
        } else {
            System.out.println("Encerrando o programa...");
            input.close();
            return;
        }

        switch (opcao) {
            case 1:
                if (n1 == 0 || n2 == 0) {
                    System.out.println("Não é possível verificar múltiplos com zero.");
                } else if (n1 % n2 == 0 || n2 % n1 == 0) {
                    System.out.println("Os números são múltiplos um do outro.");
                } else {
                    System.out.println("Os números não são múltiplos um do outro.");
                }
                break;
            case 2:
                if (n1 % 2 == 0 && n2 % 2 == 0) {
                    System.out.println("Os dois números são pares.");
                } else {
                    System.out.println("Os dois números não são pares.");
                }
                break;
            case 3:
                double media = (double) (n1 + n2) / 2;
                if (media >= 7) {
                    System.out.printf("A média dos dois números é %.1f (maior ou igual a 7).", media);
                } else {
                    System.out.printf("A média dos dois números é %.1f (menor que 7).", media);
                }
                break;
            default:
                System.out.println("Valor inválido.");
        }
    }
}
