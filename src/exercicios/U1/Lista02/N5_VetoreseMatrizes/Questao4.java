package N5_VetoreseMatrizes;

import java.util.Scanner;

public class Questao4 {
    public static void agenciaPublicidade(){
        Scanner input = new Scanner(System.in);

        String[] nomes = new String[20];
        int[] idades = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.printf("Digite o nome da candidata %d: ", i + 1);
            nomes[i] = input.nextLine();

            do {
                System.out.printf("Digite a idade de %s: ", nomes[i]);
                idades[i] = input.nextInt();
                input.nextLine();

                if (idades[i] <= 0) {
                    System.out.println("Idade deve ser maior que zero. Tente novamente.");
                }
            } while (idades[i] <= 0);
        }

        System.out.println("\nCandidatas aptas (idade entre 18 e 20 anos):");
        for (int i = 0; i < 20; i++) {
            if (idades[i] >= 18 && idades[i] <= 20) {
                System.out.println(nomes[i]);
            }
        }
    }
}
