package ClassesAbstratasEInterfaces.IteracaoProcessos;

public class ComandoRede implements IComando {
    @Override
    public void executar(String[] parametros){
        System.out.println("Executando Comando de Rede...");
    }
}
