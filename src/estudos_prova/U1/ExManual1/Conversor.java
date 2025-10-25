package ExManual1;

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Celsius: ");
        double tempCelsius = input.nextDouble();

        double tempFahrenheit = (tempCelsius * 1.8) + 32;

        System.out.printf("Temperatura convertida: %.2f", tempFahrenheit);
    }
}
