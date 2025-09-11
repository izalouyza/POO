package codigos.aula3;

import java.util.Scanner;

import codigos.aula3.utilitarios;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        utilitarios utils = new utilitarios();
        utilitarioscalc utilCalc = new utilitarioscalc();

        int opcao;

        do {
            utils.exibeMenu();
            opcao = input.nextInt();

            if (opcao == 0){
                utils.println("Saindo...");
                break;
            }

            int n1 = utilCalc.defineNumero();
            int n2 = utilCalc.defineNumero();

            switch(opcao){
                case 1:
                    utils.printf("Resultado: %d", utilCalc.soma(n1, n2));
                    break;
                case 2:
                    utils.printf("Resultado: %d", utilCalc.subtracao(n1, n2));
                    break;
                case 3:
                    utils.printf("Resultado: %d", utilCalc.multiplicacao(n1, n2));
                    break;
                case 4:
                    utils.printf("Resultado: %d", utilCalc.divisao(n1, n2));
                    break;
                default:
                    utils.println("Opção inválida");
                    break;
            }
        }while(true);
    }
}
