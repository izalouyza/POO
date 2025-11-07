package ClassesAbstratasEInterfaces.HierarquiaFuncionarios;

import java.util.Scanner;

public class Desenvolvedor extends Funcionario {
    private double salarioBase;
    private double salarioFinal;

    public Desenvolvedor(){}

    //construtor
    public Desenvolvedor(String nome, int codigoCargo, double salarioBase, double salarioFinal){
        super(nome, codigoCargo);
        this.salarioBase = salarioBase;
        this.salarioFinal = salarioFinal;
    }

    public double calcularBonificacao(){
        switch (codigoCargo) {
            case 1:
                salarioFinal += (salarioBase) * 0.1;
                System.out.printf("Desenvolvedor Júnior | Bonificação: R$ %.2f\n", salarioFinal);
                break;
            case 2:
                salarioFinal += (salarioBase) * 0.15;
                System.out.printf("Desenvolvedor Pleno | Bonificação: R$ %.2f\n", salarioFinal);
                break;
            case 3:
                salarioFinal += (salarioBase) * 0.2;
                System.out.printf("Desenvolvedor Sênior | Bonificação: R$ %.2f\n", salarioFinal);
                break;
            default:
                salarioFinal += (salarioBase) * 0.05;
                System.out.printf("Outro | Bonificação: R$ %.2f\n", salarioFinal);
                break;
        }
        return salarioFinal;
    }
}
