package ExLista1;

import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = input.nextInt();

        if(num>=0){
            System.out.print(num);
        }else{
            num = num * (-1);
            System.out.print(num);
        }
    }
}
