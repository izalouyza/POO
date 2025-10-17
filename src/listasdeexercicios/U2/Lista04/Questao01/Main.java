package Questao01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Fatura fatura = new Fatura();

        System.out.print("Informe o número de cópias que deseja imprimir: ");
        int numeroDeCopias = input.nextInt();
        fatura.imprimir(numeroDeCopias);
    }
}