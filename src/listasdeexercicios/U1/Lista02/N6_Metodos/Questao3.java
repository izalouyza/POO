package N6_Metodos;

import java.util.Scanner;

public class Questao3 {

    static int[] vetor;
    static int tamanho;

    public static void opcoes(){

        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nOpções Disponíveis:");
            System.out.println("1 - Carregar Vetor");
            System.out.println("2 - Listar Vetor");
            System.out.println("3 - Exibir apenas os números pares do vetor");
            System.out.println("4 - Exibir apenas os números ímpares do vetor");
            System.out.println("5 - Exibir a quantidade de números pares nas posições ímpares do vetor");
            System.out.println("6 - Exibir a quantidade de números ímpares nas posições pares do vetor");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    carregarVetor(input);
                    break;
                case 2:
                    listarVetor();
                    break;
                case 3:
                    exibirPares();
                    break;
                case 4:
                    exibirImpares();
                    break;
                case 5:
                    contarParesEmPosicoesImpares();
                    break;
                case 6:
                    contarImparesEmPosicoesPares();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);
    }

    public static void carregarVetor(Scanner input) {
        System.out.print("Digite o tamanho do vetor (máx. 50): ");
        tamanho = input.nextInt();
        while (tamanho <= 0 || tamanho > 50) {
            System.out.print("Tamanho inválido! Digite novamente: ");
            tamanho = input.nextInt();
        }

        vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Digite o elemento %d: ", i);
            vetor[i] = input.nextInt();
        }
        System.out.println("Vetor carregado com sucesso!");
    }

    public static void listarVetor() {
        if (vetor == null) {
            System.out.println("Vetor não foi carregado!");
            return;
        }
        System.out.print("Vetor: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void exibirPares() {
        if (vetor == null) {
            System.out.println("Vetor não foi carregado!");
            return;
        }
        System.out.print("Números pares: ");
        for (int num : vetor) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void exibirImpares() {
        if (vetor == null) {
            System.out.println("Vetor não foi carregado!");
            return;
        }
        System.out.print("Números ímpares: ");
        for (int num : vetor) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void contarParesEmPosicoesImpares() {
        if (vetor == null) {
            System.out.println("Vetor não foi carregado!");
            return;
        }
        int contador = 0;
        for (int i = 1; i < tamanho; i += 2) { // posições ímpares: 1,3,5...
            if (vetor[i] % 2 == 0) {
                contador++;
            }
        }
        System.out.printf("Quantidade de números pares em posições ímpares: %d\n", contador);
    }

    public static void contarImparesEmPosicoesPares() {
        if (vetor == null) {
            System.out.println("Vetor não foi carregado!");
            return;
        }
        int contador = 0;
        for (int i = 0; i < tamanho; i += 2) { // posições pares: 0,2,4...
            if (vetor[i] % 2 != 0) {
                contador++;
            }
        }
        System.out.printf("Quantidade de números ímpares em posições pares: %d\n", contador);
    }
}