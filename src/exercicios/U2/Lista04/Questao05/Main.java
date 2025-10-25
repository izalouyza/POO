package Questao05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ValidadorSeguranca validador = new ValidadorSeguranca();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        if (validador.validarFormato(senha)) {
            validador.validarAcesso(senha);
        }
    }
}
