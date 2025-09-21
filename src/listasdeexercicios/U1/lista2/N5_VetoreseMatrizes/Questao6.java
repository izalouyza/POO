package N5_VetoreseMatrizes;

import java.util.Scanner;
import java.util.Random;

public class Questao6 {
    public static void sorteiaNumero(){
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(101);
        int tentativa;
        int contador = 0;

        System.out.println("Tente adivinhar o número sorteado (entre 0 e 100):");

        do {
            System.out.print("Digite sua tentativa: ");
            tentativa = input.nextInt();
            contador++;

            if (tentativa < numeroSorteado) {
                System.out.println("O número sorteado é maior.");
            } else if (tentativa > numeroSorteado) {
                System.out.println("O número sorteado é menor.");
            } else {
                System.out.printf("Parabéns! Você acertou em %d tentativas.\n", contador);
            }

        } while (tentativa != numeroSorteado);

    }
}
