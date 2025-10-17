package ExLista1;

import java.util.Scanner;

public class Relacionamentos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite dois números inteiros: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        if (n1 == n2){
            System.out.print("Números iguais.");
        }else{
            System.out.print("Números não iguais.");
        }

        if (n1 > n2){
            System.out.print("N1 é maior que N2.");
        }else{
            System.out.print("N2 é maior que N1.");
        }

        if(n1>=n2){
            System.out.print("N1 é maior ou igual a N2.");
        }else{
            System.out.print("N2 é maior ou igual a N1.");
        }

        if(n1<=n2){
            System.out.print("N1 é menor ou igual a N2.");
        }else{
            System.out.print("N2 é menor ou igual a N1.");
        }


    }
}
