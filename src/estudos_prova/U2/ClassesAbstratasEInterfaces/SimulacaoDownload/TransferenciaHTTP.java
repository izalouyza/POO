package ClassesAbstratasEInterfaces.SimulacaoDownload;

public class TransferenciaHTTP implements ITransferencia {
    public void iniciarDownload(int tamanhoTotal){
        int bytesRecebidos = 0;
        boolean continuar = true;

        System.out.println("Iniciando download...\n");

        while(bytesRecebidos < tamanhoTotal && continuar){
            bytesRecebidos++;
            System.out.println("Recebendo dados... (" +  bytesRecebidos + "%)");

            if(bytesRecebidos == (tamanhoTotal/2)){
                continuar = false;
                System.out.println("Download Pausado Automaticamente!");
            }
        }

        if(bytesRecebidos == tamanhoTotal){
            System.out.println("Download Completo!");
        }else{
            System.out.println("Download Pausado/Interrompido.");
        }
    }
}
