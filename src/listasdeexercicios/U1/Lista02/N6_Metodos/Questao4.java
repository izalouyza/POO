package N6_Metodos;

import java.util.Scanner;

public class Questao4 {
    public static void tipoTriangulo(){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite os lados do triângulo:");
        System.out.print("Lado 1: ");
        int a = input.nextInt();
        System.out.print("Lado 2: ");
        int b = input.nextInt();
        System.out.print("Lado 3: ");
        int c = input.nextInt();

        if (!trianguloValido(a, b, c)) {
            System.out.println("Os lados informados não formam um triângulo.");
        } else {
            if (equilatero(a, b, c)) {
                System.out.println("O triângulo é Equilátero.");
            } else if (isosceles(a, b, c)) {
                System.out.println("O triângulo é Isósceles.");
            } else if (escaleno(a, b, c)) {
                System.out.println("O triângulo é Escaleno.");
            }
        }
    }

    public static boolean trianguloValido(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static boolean equilatero(int a, int b, int c) {
        return (a == b) && (b == c);
    }

    public static boolean isosceles(int a, int b, int c) {
        return (a == b || a == c || b == c) && !equilatero(a, b, c);
    }

    public static boolean escaleno(int a, int b, int c) {
        return (a != b) && (a != c) && (b != c);
    }
}