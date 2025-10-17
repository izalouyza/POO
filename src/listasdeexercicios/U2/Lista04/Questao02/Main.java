package Questao02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("======== CÁLCULO DE BÔNUS ANUAL ========");

        System.out.print("Digite o nome do funcionário: ");
        String nome = input.nextLine();

        System.out.print("""
                Informe o código do cargo:
                1 - Desenvolvedor Júnior
                2 - Desenvolvedor Pleno
                3 - Desenvolvedor Sênior
                4 - Outro
                Código:\s""");
                int codigoCargo = input.nextInt();

        System.out.print("Informe o salário base (R$): ");
        double salarioBase = input.nextDouble();

        Desenvolvedor dev = new Desenvolvedor(nome, codigoCargo, salarioBase);

        System.out.println("\n======== RESULTADO ========");
        System.out.printf("Funcionário: %s\n", dev.getNome());
        System.out.printf("Código do cargo: %d\n", codigoCargo);
        System.out.printf("Bônus calculado: R$ %.2f\n", dev.calcularBonificacao());
    }
}
