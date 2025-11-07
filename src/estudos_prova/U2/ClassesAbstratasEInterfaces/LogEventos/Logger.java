package ClassesAbstratasEInterfaces.LogEventos;

public class Logger implements ISalvavelEmArquivo, ISalvavelEmDB {
    @Override
    public void salvarLocal(String log){
        if(log.equals("")){
            System.out.println("LOG Vazia.");
        }else{
            System.out.println("LOG ARQUIVO: " + log);
        }
    }

    @Override
    public void salvarRemoto(String log){
        for(int i = 1; i <= 3; i++){
            System.out.printf("Tentativa [%d] de conexão com DB.\n", i);
        }
        System.out.println("LOG DB: " + log);
    }
}
