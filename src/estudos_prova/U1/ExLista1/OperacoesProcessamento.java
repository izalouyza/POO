package ExLista1;

import java.util.Scanner;

public class OperacoesProcessamento {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int A, B, C, D;

        System.out.print("Digite quatro valores números inteiros: ");
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();
        
        System.out.print("ADIÇÕES");

        System.out.printf("%d + %d = %d\n", A, B, (A+B));
        System.out.printf("%d + %d = %d\n", A, C, (A+C));
        System.out.printf("%d + %d = %d\n", A, D, (A+D));
        System.out.printf("%d + %d = %d\n", B, C, (B+C));
        System.out.printf("%d + %d = %d\n", B, D, (B+D));
        System.out.printf("%d + %d = %d\n", C, D, (C+D));

        System.out.print("MULTIPLICAÇÕES");

        System.out.printf("%d * %d = %d\n", A, B, (A*B));
        System.out.printf("%d * %d = %d\n", A, C, (A*C));
        System.out.printf("%d * %d = %d\n", A, D, (A*D));
        System.out.printf("%d * %d = %d\n", B, C, (B*C));
        System.out.printf("%d * %d = %d\n", B, D, (B*D));
        System.out.printf("%d * %d = %d\n", C, D, (C*D));

    }
}
