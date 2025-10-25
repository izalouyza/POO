package br.com.exemplo.eleicao.sistema;

import br.com.exemplo.eleicao.entidades.Voto;
import br.com.exemplo.eleicao.interfaces.Candidato;
import java.util.ArrayList;
import java.util.List;

public class UrnaEletronica {
    private List<Candidato> candidatosRegistrados;
    private List<Voto> votosComputados;

    //construtor
    public UrnaEletronica(){
        this.candidatosRegistrados = new ArrayList<>();
        this.votosComputados = new ArrayList<>();
    }

    public void registrarCandidato(Candidato novoCandidato){
        for(Candidato c : candidatosRegistrados){
            if(c.getNumeroCandidato() == novoCandidato.getNumeroCandidato()){
                System.out.println("Número de candidato já registrado!");
                return;
            }
        }
        candidatosRegistrados.add(novoCandidato);
        System.out.println("Candidato registrado com sucesso!");
    }

    public void receberVoto(Voto voto){
        int numeroVotado = voto.getNumeroCandidatoVotado();
        Candidato candidatoEncontrado = null;

        for(Candidato c : candidatosRegistrados){
            if(c.getNumeroCandidato() == numeroVotado){
                candidatoEncontrado = c;
                break;
            }
        }
        if(candidatoEncontrado != null){
            candidatoEncontrado.receberVotos();
            votosComputados.add(voto);
            System.out.println("Voto para o número " + numeroVotado + " confirmado!");
        }else{
            System.out.println("Voto nulo (candidato " + numeroVotado + " não encontrado).");
        }
    }

    public void exibirResultados(){
        System.out.println("------------ RESULTADOS DA ELEIÇÃO ------------");
        for(Candidato c : candidatosRegistrados){
            c.exibirDados();
            System.out.println("Total de Votos: " + c.getTotalVotos());
            System.out.println("--------------------------------------------");
        }
    }

    //getter
    public List<Candidato> getCandidatosRegistrados(){
        return this.candidatosRegistrados;
    }
}
