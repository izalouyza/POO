package N4_EstruturasdeRepeticao;

import java.util.Scanner;

public class Questao7 {
    public static void somaQuadrados(){
        Scanner input = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Informe um número entre 1 e 9: ");
            numero = input.nextInt();
        } while (numero <= 0 || numero >= 10);

        int somaQuadrados = 0;
        int contador = 0;
        int atual = numero;

        while (contador < 20) {
            if (atual % 2 != 0) {
                somaQuadrados += atual * atual;
                contador++;
            }
            atual++;
        }

        System.out.printf("Soma dos quadrados dos 20 primeiros números ímpares a partir de %d: %d\n", numero, somaQuadrados);
    }
}
