package N4_EstruturasdeRepeticao;

import java.util.Scanner;

public class Questao2 {
    public static void fatorial() {
        Scanner input = new Scanner(System.in);

        int qtd;

        System.out.print("Digite a quantidade de números a serem processados: ");
        qtd = input.nextInt();

        for (int i = 1; i <= qtd; i++) {
            System.out.printf("Digite o %dº número: ", i);
            int num = input.nextInt();

            long fatorial = 1;
            for (int j = 1; j <= num; j++) {
                fatorial *= j;
            }

            System.out.printf("O fatorial de %d é %d\n", num, fatorial);
        }
    }
}
