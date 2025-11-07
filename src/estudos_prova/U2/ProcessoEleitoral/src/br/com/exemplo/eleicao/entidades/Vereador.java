package ProcessoEleitoral.src.br.com.exemplo.eleicao.entidades;

public class Vereador extends Politico {
    //construtor
    public Vereador(String nome, Partido partido, int numeroCandidato){
        super(nome, partido, numeroCandidato);
    }

    @Override
    public String getCargo(){
        return "Vereador";
    }
}
