package N4_EstruturasdeRepeticao;

import java.util.Scanner;

public class Questao9 {
    public static void conjuntoNumMenor() {
        Scanner input = new Scanner(System.in);
        int numero;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite números positivos (um número negativo encerra):");

        while (true) {
            System.out.print("Número: ");
            numero = input.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        if (maior == Integer.MIN_VALUE) {
            System.out.println("Nenhum número positivo foi digitado.");
        } else {
            System.out.printf("Maior número: %d\n", maior);
            System.out.printf("Menor número: %d\n", menor);
        }
    }
}
