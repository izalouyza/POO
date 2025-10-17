//Crie um programa que:
//
//Crie um array de 5 inteiros
//
//Peça ao usuário (via Scanner) para digitar 5 números
//
//Mostre todos os números digitados na tela
//
//🪄 Dica: use for para percorrer o array.

package ArrayArrayListList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayBasico {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        Scanner input = new Scanner(System.in);

        System.out.println("Digite cinco números: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();
        int n5 = input.nextInt();

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(numeros[4]);
        System.out.println(numeros[5]);

    }
}
