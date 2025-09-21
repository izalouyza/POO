package N4_EstruturasdeRepeticao;

import java.util.Scanner;

public class Questao11 {
    public static void encontraValores(){
        Scanner input = new Scanner(System.in);

        int numero;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;

        System.out.println("Digite 10 números inteiros e positivos:");

        for (int i = 1; i <= 10; i++) {
            do {
                System.out.printf("Número %d: ", i);
                numero = input.nextInt();

                if (numero <= 0) {
                    System.out.println("Por favor, digite um número positivo.\n");
                }
            } while (numero <= 0);

            soma += numero;

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        double media = soma / 10.0;

        System.out.println("\nResultado\n");
        System.out.printf("Maior número: %d\n", maior);
        System.out.printf("Menor número: %d\n", menor);
        System.out.printf("Média dos números: %.1f\n", media);

    }
}
