package Questao03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] dados = {
                "ID, Nome, Idade",
                "1, João, 25",
                "2, Maria, 30",
                "3, Pedro, 28"
        };

        List<IProcessadorDeDados> processadores = new ArrayList<>();

        processadores.add(new ProcessadorCSV());

        for (IProcessadorDeDados p : processadores) {
            p.processar(dados);
        }
    }
}
