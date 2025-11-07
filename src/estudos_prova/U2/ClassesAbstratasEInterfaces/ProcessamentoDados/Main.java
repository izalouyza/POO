package ClassesAbstratasEInterfaces.ProcessamentoDados;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        List<IProcessadorDeDados> proc = new ArrayList<>();

        proc.add(new ProcessadorCSV());

        String[] dados = {
        "Linha 1: Nome, Idade, Cidade",
        "Linha 2: João, 25, São Paulo",
        "Linha 3: Maria, 30, Rio de Janeiro"};

        for (IProcessadorDeDados p : proc){
            p.processar(dados);
        }
    }
}
