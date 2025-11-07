package ProcessoEleitoral.src.br.com.exemplo.eleicao.entidades;

public class Eleitor {
    private String nome;

    //construtor
    public Eleitor(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}
