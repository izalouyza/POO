package ClassesAbstratasEInterfaces.GerenciadorTarefas;

public class Main {
    public static void main(String[] args) {
        IExecutavel tarefa = new TarefaLonga();
        tarefa.executar();
    }
}