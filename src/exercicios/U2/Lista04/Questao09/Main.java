package Questao09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade em estoque: ");
        int quantidadeEstoque = input.nextInt();

        ProdutoAlimenticio produto = new ProdutoAlimenticio(quantidadeEstoque);

        System.out.print("Digite a quantidade solicitada: ");
        int quantidadeSolicitada = input.nextInt();

        produto.verificarDisponibilidade(quantidadeSolicitada);
    }
}