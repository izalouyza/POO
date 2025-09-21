package N6_Metodos;

import java.util.Scanner;

public class Questao1 {

    public static double REAJUSTE(double valorSalario, double indiceReajuste) {
        return valorSalario * (1 + indiceReajuste / 100.0);
    }

    public static void salarioAtualizado() {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor do salário: ");
        double salario = input.nextDouble();

        System.out.print("Informe o índice de reajuste (%): ");
        double reajustePercentual = input.nextDouble();

        double salarioAtualizado = REAJUSTE(salario, reajustePercentual);

        System.out.printf("Salário atualizado: R$ %.2f%n", salarioAtualizado);
    }
}
