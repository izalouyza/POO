package Treino;

import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double salario, valorAumento, novoSalario;
        int porcAumento;

        while(true){
            System.out.print("""
                    Calculadora das Organizações Tabajara
                    Digite o salário: \s""");

            salario = input.nextDouble();

            if (salario < 0){
                System.out.println("Saindo...");
                break;
            }

            if (salario <= 280) {
                porcAumento = 20;
            } else if (salario <= 700) {
                porcAumento = 15;
            } else if (salario <= 1500) {
                porcAumento = 10;
            } else {
                porcAumento = 5;
            }

            valorAumento = (salario * porcAumento) / 100;
            novoSalario = salario + valorAumento;

            System.out.printf("""
                    ========= Informações =========
                    Salário antes do reajuste: R$ %.2f
                    Percentual de aumento:      %d%%
                    Valor do aumento:           R$ %.2f
                    Novo salário:               R$ %.2f
                    ==============================
                    """, salario, porcAumento, valorAumento, novoSalario);
        }

    }
}
