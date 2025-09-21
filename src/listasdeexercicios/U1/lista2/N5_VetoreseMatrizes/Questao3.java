package N5_VetoreseMatrizes;

import java.util.Scanner;

public class Questao3 {
    public static void numerosVetor(){
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];

        System.out.println("Digite 10 números inteiros positivos:");
        for (int i = 0; i < 10; i++) {
            do {
                System.out.printf("Número %d ", (i + 1));
                vetor[i] = input.nextInt();
                if (vetor[i] <= 0) {
                    System.out.println("Número deve ser maior que zero. Tente novamente.");
                }
            } while (vetor[i] <= 0);
        }

        int X;
        do {
            System.out.print("Digite um número inteiro positivo X: ");
            X = input.nextInt();
            if (X <= 0) {
                System.out.println("Número deve ser maior que zero. Tente novamente.");
            }
        } while (X <= 0);

        int maiores = 0, menores = 0, iguais = 0;
        for (int i = 0; i < 10; i++) {
            if (vetor[i] > X) {
                maiores++;
            } else if (vetor[i] < X) {
                menores++;
            } else {
                iguais++;
            }
        }

        System.out.printf("\nQuantidade de números maiores que X: %d", maiores);
        System.out.printf("\nQuantidade de números menores que X: %d", menores);
        System.out.printf("\nQuantidade de números iguais a X: %d\n", iguais);

    }
}
