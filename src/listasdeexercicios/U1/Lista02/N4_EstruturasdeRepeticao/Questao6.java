package N4_EstruturasdeRepeticao;

import java.util.Scanner;

public class Questao6 {
    public static void conjuntoNumeros() {
        Scanner input = new Scanner(System.in);

        int numero;
        int somaPares = 0;
        int somaImpares = 0;

        System.out.println("Digite números positivos (um número negativo encerra a entrada):");

        while (true) {
            numero = input.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero % 2 == 0) {
                System.out.println("Número par.");
                somaPares += numero;
            } else {
                System.out.println("Número ímpar.");
                somaImpares += numero;
            }
        }

        System.out.printf("\nSoma dos números pares: %d\n", somaPares);
        System.out.printf("Soma dos números ímpares: %d\n", somaImpares);

    }
    }

