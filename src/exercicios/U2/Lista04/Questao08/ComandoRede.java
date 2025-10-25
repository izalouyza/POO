package Questao08;

class ComandoRede implements IComando {
    @Override
    public void executar(String[] parametros) {
        System.out.println("Executando Comando de Rede...");
    }
}