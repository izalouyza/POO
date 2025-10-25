package N5_VetoreseMatrizes;

import java.util.Scanner;

public class Questao2 {
    public static void produtoEscalar(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de elementos dos vetores: ");
        int n = input.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        System.out.println("Digite os elementos do vetor x:");
        for (int i = 0; i < n; i++) {
            x[i] = input.nextInt();
        }

        System.out.println("Digite os elementos do vetor y:");
        for (int i = 0; i < n; i++) {
            y[i] = input.nextInt();
        }

        int produtoEscalar = 0;
        for (int i = 0; i < n; i++) {
            produtoEscalar += x[i] * y[i];
        }

        System.out.printf("O produto escalar dos vetores é: %d\n", produtoEscalar);
    }
}
