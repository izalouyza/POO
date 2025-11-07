package ProcessoEleitoral.src.br.com.exemplo.eleicao.sistema;

import ProcessoEleitoral.src.br.com.exemplo.eleicao.entidades.Voto;
import ProcessoEleitoral.src.br.com.exemplo.eleicao.interfaces.Candidato;

import java.util.List;
import java.util.ArrayList;

public class UrnaEletronica {
    private List<Candidato> candidatosRegistrados;
    private List<Voto> votosComputados;

    public UrnaEletronica() {
        this.candidatosRegistrados = new ArrayList<>();
        this.votosComputados = new ArrayList<>();
    }

    public void registrarCandidato(Candidato novoCandidato) {
        candidatosRegistrados.add(novoCandidato);

        for (Candidato c : candidatosRegistrados) {
            if (c.getNumeroCandidato() == novoCandidato.getNumeroCandidato()) {
                System.out.println("Erro: já existe um candidato com esse número.");
                return;
            }
        }
                candidatosRegistrados.add(novoCandidato);
                System.out.println("Candidato adicionado com sucesso!");
            }

    public void receberVoto(Voto voto) {
        int numeroVotado = voto.numeroCandVotado();
        Candidato candidatoEncontrado = null;

        for (Candidato c : candidatosRegistrados){
            if(c.getNumeroCandidato() == numeroVotado){
                candidatoEncontrado = c;
                break;
            }
        }

        if(candidatoEncontrado != null){
            candidatoEncontrado.receberVoto();
            votosComputados.add(voto);
            System.out.println("Voto para o número " + numeroVotado + " confirmado!");
        }else{
            System.out.println("Voto nulo (candidato " + numeroVotado + " não encontrado).");
        }
    }

    public void exibirResultados(){
        System.out.println("======= RESULTADOS DA ELEIÇÃO ===========");
        for(Candidato c : candidatosRegistrados){
            c.exibirDados();
            System.out.println("Total de Votos: " + c.getTotalVotos());
            System.out.println("======================================");
        }
        System.out.println("Total de votos computados: " + votosComputados.size());
    }
    public List<Candidato> getCandidatosREgistrados(){
        return this.candidatosRegistrados;
    }
}
