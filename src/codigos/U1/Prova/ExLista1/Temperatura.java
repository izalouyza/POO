package ExLista1;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe uma temperatura em graus Celsius (ºC): ");
        double tempCelsius = input.nextDouble();

        double tempFahrenheit = (9 * tempCelsius + 160) / 5.0;

        System.out.printf("A temperatura convertida (ºC para ºF) é: %.2f", tempFahrenheit);
    }
}

