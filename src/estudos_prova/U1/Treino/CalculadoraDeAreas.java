package Treino;

/*(2)

3 menu terminal
1 funções: calculaRetangulo() e calculaCirculo()
2 menu repete até o usuário escolher sair
1 pi como 3.14
1 tipos números e retorno das funções */

import java.util.Scanner;

public class CalculadoraDeAreas {
    //Funções
    public static double calculaRetangulo(int base, double altura) {
        return base * altura;
    }

    public static double calculaCirculo(double raio) {
        double pi = 3.14;
        return pi * (raio * raio);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        while(true) {
            System.out.printf("""
                    \n=== MENU DE OPÇÕES ===
                    1 - Calcular área do Retângulo
                    2 - Calcular área do Círculo
                    0 - Sair
                    Escolha uma opção:\s""");
            opcao = input.nextInt();

            if (opcao == 0){
                System.out.print("Saindo ...");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite a base do retângulo: ");
                    int base = input.nextInt();
                    System.out.print("Digite a altura do retângulo: ");
                    double altura = input.nextDouble();
                    System.out.printf("Área do Retângulo: %.1f\n", calculaRetangulo(base, altura));
                    break;
                case 2:
                    System.out.print("Digite o raio do círculo: ");
                    double raio = input.nextInt();
                    System.out.print("Área do Círculo: \n" + calculaCirculo(raio));
                    break;
                default:
                    System.out.print("Opção inválida. Tente novamente.\n");
                    continue;
            }
        }
    }
}
