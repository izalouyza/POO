package ClassesAbstratasEInterfaces.SimulacaoDownload;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        TransferenciaHTTP transf = new TransferenciaHTTP();

        System.out.print("Informe o tamanho total do Download: ");
        int tamDownload = input.nextInt();

        transf.iniciarDownload(tamDownload);
    }
}
