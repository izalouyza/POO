package Questao08;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IComando> comandos = new ArrayList<>();
        comandos.add(new ComandoRede());
        comandos.add(new ComandoArquivo());

        for (IComando comando : comandos) {
            String[] parametros = {"param1", "param2"};
            comando.executar(parametros);
        }
    }
}

