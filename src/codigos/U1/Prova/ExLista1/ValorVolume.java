package ExLista1;

import java.util.Scanner;

public class ValorVolume {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o raio: ");
        double raio = input.nextDouble();

        System.out.print("Informe a altura: ");
        double altura = input.nextDouble();

        double valorVolume = 3.14159 * (raio * raio) * altura;

        System.out.printf("Valor do volume da lata de óleo: %.2f", valorVolume);
    }
}
