package ExManual1;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o raio do círculo: ");
        double raioCirculo = input.nextDouble();

        double pi = 3.14;
        double areaCirculo = pi * (raioCirculo * raioCirculo);

        System.out.printf("Valor da área: %.2f", areaCirculo);
    }
}
