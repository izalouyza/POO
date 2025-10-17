package N6_Metodos;

import java.util.Scanner;

public class Questao2 {
    public static String VERIFICA(int n){
        if (n%2==0){
            return "PAR";
        }else{
            return "ÍMPAR";
        }
    }

    public static void parImpar(){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = input.nextInt();

        String resultado = VERIFICA(numero);

        System.out.printf("O número é %s\n", resultado);
    }
}
