package ClassesAbstratasEInterfaces.HierarquiaFuncionarios;

public abstract class Funcionario {
    protected String nome;
    protected int codigoCargo;

    public Funcionario(){}

    //construtor
    public Funcionario(String nome, int codigoCargo){
        this.nome = nome;
        this.codigoCargo = codigoCargo;
    }

    //getters e setters
    public String getNome(){
        return nome;
    }

    public int getCodigo(){
        return codigoCargo;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public abstract double calcularBonificacao();
}
