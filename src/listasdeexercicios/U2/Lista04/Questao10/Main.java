package Questao10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho total do download (em bytes): ");
        int tamanhoTotal = input.nextInt();
        input.nextLine();

        ITransferencia transferencia = new TransferenciaHTTP();
        transferencia.iniciarDownload(tamanhoTotal);
    }
}
