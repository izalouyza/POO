package aula4;

import java.util.Scanner;

public class utilitariosCalc {
    utilitarios utils = new utilitarios();

    public int soma(int n1, int n2) {
        return n1 + n2;
    }

    public int subtracao(int n1, int n2) {
        return n1 - n2;
    }

    public int multiplicacao(int n1, int n2) {
        return n1 * n2;
    }

    public double divisao(int n1, int n2) {
        int resultado = 0;

        if (n2 == 0) {
            utils.println("Não pode dividir por 0.");
        } else {
            resultado = n1 / n2;
        }

        return resultado;
    }

    public int defineNumero() {
        Scanner input = new Scanner(System.in);
        utils.print("Digite um número: ");
        return input.nextInt();
    }
}