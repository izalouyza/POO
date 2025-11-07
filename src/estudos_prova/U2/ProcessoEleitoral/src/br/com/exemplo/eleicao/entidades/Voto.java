package ProcessoEleitoral.src.br.com.exemplo.eleicao.entidades;

public class Voto {
    private Eleitor eleitor;
    private int numeroCandidatoVotado;

    //construtor
    public Voto(Eleitor eleitor, int numeroCandidatoVotado){
        this.eleitor = eleitor;
        this.numeroCandidatoVotado = numeroCandidatoVotado;
    }

    public int numeroCandVotado(){
        return numeroCandidatoVotado;
    }
}
