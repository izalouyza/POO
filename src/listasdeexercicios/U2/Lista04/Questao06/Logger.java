package Questao06;

public class Logger implements ISalvavelEmArquivo, ISalvavelEmDB {

    @Override
    public void salvarLocal(String log) {
        if (!log.isEmpty()) {
            System.out.println("LOG ARQUIVO: " + log);
        }
    }

    @Override
    public void salvarRemoto(String log) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Tentativa " + i + " de conexão com DB.");
        }
        System.out.println("LOG DB: " + log);
    }
}
