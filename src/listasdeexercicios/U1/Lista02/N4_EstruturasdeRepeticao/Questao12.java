package N4_EstruturasdeRepeticao;

import java.util.Scanner;

public class Questao12 {
    public static void indicePoluicao() {
        Scanner input = new Scanner(System.in);
        double indice;
        String resposta;

        do {
            System.out.print("Informe o índice de poluição: ");
            indice = input.nextDouble();
            input.nextLine();

            if (indice == 0.0) {
                System.out.println("Índice 0,0 informado. Encerrando o programa.");
                break;
            }

            if (indice >= 0.05 && indice <= 0.25) {
                System.out.println("Índice dentro do limite aceitável. Nenhuma ação necessária.");
            } else if (indice > 0.25 && indice < 0.3) {
                System.out.println("Índice acima do aceitável, mas ainda sem ação obrigatória.");
            } else if (indice >= 0.3 && indice < 0.4) {
                System.out.println("Atenção: Grupo 1 deve suspender suas atividades.");
            } else if (indice >= 0.4 && indice < 0.5) {
                System.out.println("Atenção: Grupos 1 e 2 devem suspender suas atividades.");
            } else if (indice >= 0.5) {
                System.out.println("Atenção: Todos os grupos devem paralisar suas atividades.");
            } else {
                System.out.println("Índice abaixo do limite aceitável. Nenhuma ação necessária.");
            }

            System.out.print("Deseja encerrar o programa? (S/N): ");
            resposta = input.nextLine().trim().toUpperCase();

        } while (!resposta.equals("S"));

        System.out.println("Programa encerrado.");
    }
}
