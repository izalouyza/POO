package ClassesAbstratasEInterfaces.ObrigatoriedadeConstrutor;

public abstract class Veiculo {
    protected String cor;

    //construtor
    public Veiculo(String cor){
        this.cor = cor;
    }

    //get e set
    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
}
