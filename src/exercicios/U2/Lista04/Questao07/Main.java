package Questao07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a cor do carro: ");
        String corDigitada = input.nextLine();

        Carro meuCarro = new Carro(corDigitada);
        meuCarro.exibirInfo();
    }
}