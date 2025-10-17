package Questao06;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();

        logger.salvarLocal("Teste de log local");

        logger.salvarRemoto("Teste de log remoto");
    }
}

