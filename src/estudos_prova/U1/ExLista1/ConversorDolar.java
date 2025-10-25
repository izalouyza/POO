package ExLista1;

import java.util.Scanner;

public class ConversorDolar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a cotação do dólar: ");
        double cotDolar = input.nextDouble();
        System.out.print("Digite um valor em dólar: ");
        double dolar = input.nextDouble();
        double real = cotDolar * dolar;
        System.out.printf("Valor convertido para real: %.2f", real);
    }
}
