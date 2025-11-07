package ClassesAbstratasEInterfaces.GerenciadorTarefas;

public abstract class TarefaBase {
    protected boolean concluida = false;

    public void marcarConcluida(){
        concluida = true;
        System.out.println("Tarefa concluída!");
    }
}
