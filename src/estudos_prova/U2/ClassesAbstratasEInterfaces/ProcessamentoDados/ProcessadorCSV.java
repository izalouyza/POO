package ClassesAbstratasEInterfaces.ProcessamentoDados;

public class ProcessadorCSV implements IProcessadorDeDados {
    public void processar(String[] dados){
        for (int i = 0; i < dados.length; i++){
            System.out.println("Elemento de índice [" + i + "]: " + dados[i]);
        }
    }
}
