package ClassesAbstratasEInterfaces.ControleEstoque;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        List<Produto> produtos = new ArrayList<>();

        System.out.print("Informe a quantidade atual de estoque: ");
        int qtdEstoque = input.nextInt();

        Produto alimenticio = new ProdutoAlimenticio(qtdEstoque);
        produtos.add(alimenticio);

        System.out.print("Informe a quantidade de estoque: ");
        int qtdSoli = input.nextInt();

        alimenticio.verificarDisponibilidade(qtdSoli);
    }
}
