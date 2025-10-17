package Questao04;

public class TarefaLonga extends TarefaBase implements IExecutavel {

    @Override
    public void executar() {
        int progresso = 0;

        System.out.println("Iniciando tarefa longa...");

        while (progresso < 100) {
            progresso += 10;
            System.out.println("Progresso: " + progresso + "%");
        }
        marcarConcluida();
    }
}
