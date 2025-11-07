package ClassesAbstratasEInterfaces.ObrigatoriedadeConstrutor;

public class Carro extends Veiculo {
    //construtor
    public Carro(String cor){
        super(cor); //Essa chamada é importante para que a classe Carro (classe-filha) possa utilizar os parâmetros da classe-pai, Veiculo.
    }
}
