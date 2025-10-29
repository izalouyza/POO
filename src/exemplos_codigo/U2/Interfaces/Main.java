package Interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas formas deseja criar? ");
        int nFormas = input.nextInt();
        FormaGeometrica[] formas = new FormaGeometrica[nFormas];

        for(int i = 0; i < nFormas; i++){
            System.out.println("""
                    \nForma Geometríca
                    1 - Quadrado
                    2 - Retângulo
                    3 - Círculo
                    Escolha uma opção: """);
            int opcao = input.nextInt();

            switch(opcao){
                case 1:
                    System.out.print("Informe o lado do quadrado: ");
                    double lado = input.nextDouble();
                    formas[i] = new Quadrados(lado);
                    break;
                case 2:
                    System.out.print("Informe a base do retângulo: ");
                    double base = input.nextDouble();
                    System.out.print("Informe a altura do retângulo: ");
                    double altura = input.nextDouble();
                    formas[i] = new Retangulos(base, altura);
                    break;
                case 3:
                    System.out.print("Informe o raio do círculo: ");
                    double raio = input.nextDouble();
                    formas[i] = new Circulo(raio);
                    break;
                default:
                    System.out.println("Opção inválida. Criando círculo com raio 1 por padrão.");
                    formas[i] = new Circulo(1);
                    break;
            }
        }

        System.out.println("\n======== RESULTADOS ========");
        for(int i = 0; i < nFormas; i++){
            System.out.println("\nForma Geométrica" + (i+1));
            System.out.printf("Perímetro: %.2f\n", formas[i].calcularPerimetro());
            System.out.printf("Área: %.2f\n", formas[i].calcularArea());
        }
    }
}
