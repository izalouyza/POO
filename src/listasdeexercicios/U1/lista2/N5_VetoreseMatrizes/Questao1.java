package N5_VetoreseMatrizes;

import java.util.Scanner;

public class Questao1 {
    public static void ordemInversa(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = input.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o número %d ", (i + 1));
            numeros[i] = input.nextInt();
        }

        System.out.println("\nSequência na ordem inversa:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
