package br.com.exemplo.eleicao.interfaces;

import java.util.Scanner;

public interface Candidato {
    Scanner input = new Scanner(System.in);

    int getNumeroCandidato();

    void receberVotos();

    int getTotalVotos();

    void exibirDados();
}
