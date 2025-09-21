package N5_VetoreseMatrizes;

import java.util.Scanner;

public class Questao7 {
    public static void caracteresExistentes(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o 1º caractere (A-Z ou a-z): ");
        char c1 = input.next().charAt(0);

        System.out.print("Digite o 2º caractere (A-Z ou a-z): ");
        char c2 = input.next().charAt(0);

        if (!Character.isLetter(c1) || !Character.isLetter(c2)) {
            System.out.println("Erro: ambos os caracteres devem ser letras de A a Z.");
        }
        else if (c1 >= c2) {
            System.out.println("Erro: os caracteres não estão em ordem alfabética.");
        }
        else {
            int numEntre = c2 - c1 - 1;
            System.out.printf("Resultado: %c %c\nO número de caracteres entre eles é: %d\n", c1, c2, numEntre);
        }

    }
}
