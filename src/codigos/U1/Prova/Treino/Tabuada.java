package Treino;

/* Rascunho
recebe inteiro positivo caso seja par
exibe tabuada de multiplicação (0 ate 5)
se for impar, exibe a tabuada de soma (1 ate 5)
se o número for negativo, indicar que é inválido
condição de saída quando o usuário digitar 0*/

import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int temp;

        while (true) {
            System.out.print("Digite um número inteiro (0 para sair): ");
            num = input.nextInt();


            if (num == 0) {
                System.out.print("Encerrando o programa...");
                break;
            }

            if (num < 0) {
                System.out.println("Número inválido! Tente novamente.");
                continue;
            }

            if (num % 2 == 0) {
                System.out.printf("Tabuada de multiplicação do %d:\n", num);
                for (int i = 0; i <= 5; i++) {
                    temp = num * i;
                    System.out.printf("%d x %d = %d\n", num, i, temp);
                }
            } else {
                System.out.printf("Tabuada de soma do %d:\n", num);
                for (int i = 1; i <= 5; i++) {
                    temp = num + i;
                    System.out.printf("%d + %d = %d\n", num, i, temp);

                }
            }
            }
        }
    }