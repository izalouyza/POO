package Questao2;

import java.util.Scanner;

class CalculadoradeAreas {

    public static double calculaRetangulo(double base, double altura){
        return base * altura;
    }

    public static double calculaCirculo (double raio){
        double pi = 3.14;
        return pi * (raio * raio);
    }

    public static void Questao01() {
        Scanner input = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("""
                    \n === MENU DE OPÇÕES ===
                    
                    1 - Calcular área do Retângulo 
                    2 - Calcular área do Círculo
                    0 - Sair.
                    
                    Escolha uma opção:  """);
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a base do retângulo: ");
                    double base = input.nextDouble();
                    System.out.println("Digite a altura do retângulo: ");
                    double altura = input.nextDouble();
                    System.out.println("Área do Retângulo: " + calculaRetangulo(base, altura));
                    break;
                case 2:
                    System.out.println("Digite o raio do círculo: ");
                    double raio = input.nextDouble();
                    System.out.printf("Área do Círculo: %.14f", calculaCirculo(raio));
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while(opcao != 0);
    }

    public static void main(String[] args) {
        Questao01();
    }
}
