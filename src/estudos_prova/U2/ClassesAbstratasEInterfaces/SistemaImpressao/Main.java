package ClassesAbstratasEInterfaces.SistemaImpressao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Quantas cópias deseja imprimir? ");
        int copias = input.nextInt();

        Fatura copia = new Fatura();

        copia.imprimir(copias);
    }
}
