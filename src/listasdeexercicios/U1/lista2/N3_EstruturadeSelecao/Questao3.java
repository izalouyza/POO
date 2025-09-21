package N3_EstruturadeSelecao;

import java.util.Scanner;

public class Questao3 {
    public static void pesoIdeal(){
        Scanner input = new Scanner(System.in);

        double h, pesoIdeal;
        char sexo;

        System.out.println("Informe sua altura: ");
        h = input.nextDouble();

        System.out.println("Informe seu sexo (M) ou (F): ");
        sexo = input.next().toUpperCase().charAt(0);

        switch (sexo){
            case 'M':
                pesoIdeal = (72.7 * h) - 58;
                System.out.printf("Peso ideal: %.2fkg\n", pesoIdeal);
                break;
            case 'F':
                pesoIdeal = (62.1 * h) - 44;
                System.out.printf("Peso ideal: %.2fkg\n", pesoIdeal);
                break;
            default:
                System.out.println("Sexo inválido.");
        }
    }
}
