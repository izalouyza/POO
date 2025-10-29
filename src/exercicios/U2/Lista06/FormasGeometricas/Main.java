package FormasGeometricas;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Forma> formas = new ArrayList<>();

        System.out.print("Quantas formas deseja criar? ");
        int qtd = input.nextInt();

        for(int i = 0; i < qtd; i++){
            System.out.print("""
                    \nEscolha o tipo de forma:
                    1 - Retângulo
                    2 - Círculo
                    Opção: """);
            int opcao = input.nextInt();

            switch(opcao) {
                case 1:
                    System.out.print("Digite a largura do retângulo: ");
                    double largura = input.nextDouble();
                    System.out.print("Digite a altura do retângulo: ");
                    double altura = input.nextDouble();
                    formas.add(new Retangulo(largura, altura));
                    break;
                case 2:
                    System.out.print("Digite o raio do círculo: ");
                    double raio = input.nextDouble();
                    formas.add(new Circulo(raio));
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    i--;
            }
        }
        System.out.println("\n========== RESULTADOS =============");
        for (Forma f : formas){
            f.exibirNome();
            System.out.printf("Área: %.2f\n", f.calcularArea());
            System.out.printf("Perímetro: %.2f\n", f.calcularPerimetro());
            System.out.println("-------------------------------------");
        }
    }
}
