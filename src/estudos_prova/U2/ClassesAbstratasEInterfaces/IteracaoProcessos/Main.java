package ClassesAbstratasEInterfaces.IteracaoProcessos;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        List<IComando> lista = new ArrayList<>();
        ComandoRede rede = new ComandoRede();
        ComandoArquivo arquivo = new ComandoArquivo();

        lista.add(rede);
        lista.add(arquivo);

        for(IComando l : lista){
            l.executar(new String[]{"3"});
        }
    }
}
