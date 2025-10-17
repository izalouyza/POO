package Questao10;

import java.util.Scanner;

public class TransferenciaHTTP implements ITransferencia {

    @Override
    public void iniciarDownload(int tamanhoTotal) {
        Scanner input = new Scanner(System.in);
        int bytesRecebidos = 0;
        boolean continuar = true;

        System.out.println("\nIniciando download de " + tamanhoTotal + " bytes...\n");

        while (bytesRecebidos < tamanhoTotal && continuar) {
            bytesRecebidos += 10;

            if (bytesRecebidos > tamanhoTotal) {
                bytesRecebidos = tamanhoTotal;
            }

            System.out.println("Progresso: " + bytesRecebidos + "/" + tamanhoTotal + " bytes recebidos.");

            if (bytesRecebidos >= tamanhoTotal * 0.5 && bytesRecebidos < tamanhoTotal) {
                System.out.println("\nDownload Pausado Automaticamente!");
                System.out.print("Deseja continuar o download? (s/n): ");
                String resposta = input.nextLine();

                if (resposta.equalsIgnoreCase("s")) {
                    continuar = true;
                    System.out.println("\nRetomando download...\n");
                } else {
                    continuar = false;
                }
            }
        }

        if (bytesRecebidos >= tamanhoTotal) {
            System.out.println("\nDownload Completo!");
        } else {
            System.out.println("\nDownload Pausado/Interrompido!");
        }
    }
}
