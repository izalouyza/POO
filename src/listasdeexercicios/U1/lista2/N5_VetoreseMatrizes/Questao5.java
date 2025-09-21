package N5_VetoreseMatrizes;

import java.util.Scanner;

public class Questao5 {
    public static void valoresIdenticos(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos dos vetores (máx. 50): ");
        int N = input.nextInt();
        while (N <= 0 || N > 50) {
            System.out.println("Valor inválido! Tente novamente.");
            N = input.nextInt();
        }

        int[] V1 = new int[N];
        int[] V2 = new int[N];

        System.out.println("Digite os elementos do vetor V1:");
        for (int i = 0; i < N; i++) {
            System.out.printf("V1[%d]: ", i);
            V1[i] = input.nextInt();
        }

        System.out.println("\nDigite os elementos do vetor V2:");
        for (int i = 0; i < N; i++) {
            System.out.printf("V2[%d]: ", i);
            V2[i] = input.nextInt();
        }

        int iguais = 0;
        for (int i = 0; i < N; i++) {
            if (V1[i] == V2[i]) {
                iguais++;
            }
        }

        System.out.printf("Os vetores possuem %d valores idênticos nas mesmas posições.\n", iguais);

    }
}
