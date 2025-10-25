package Questao04;

public class Main {
    public static void main(String[] args) {
        TarefaLonga tarefa = new TarefaLonga();

        System.out.println("Iniciando execução da Tarefa.");
        tarefa.executar();

        if (tarefa.concluida) {
            System.out.println("A tarefa foi concluída com sucesso.");
        } else {
            System.out.println("A tarefa não foi concluída.");
        }
    }
}

