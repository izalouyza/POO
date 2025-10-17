package ExLista1;

import java.util.Scanner;

public class TrocaValores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite dois valores inteiros: ");
        int A = input.nextInt();
        int B = input.nextInt();

        System.out.printf("""
                Valores antes da troca:
                A = %d
                B = %d\n""", A, B);

        int trocaValor = A;
        A = B;

        System.out.printf("""
                Valores trocados:
                A = %d
                B = %d""", A, trocaValor);
    }
}
