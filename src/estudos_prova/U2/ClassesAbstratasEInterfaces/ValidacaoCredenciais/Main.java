package ClassesAbstratasEInterfaces.ValidacaoCredenciais;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ValidadorBase validador = new ValidadorSeguranca();

        System.out.print("Digite a senha: ");
        String senha = input.nextLine();

        validador.validarAcesso(senha);
    }
}
