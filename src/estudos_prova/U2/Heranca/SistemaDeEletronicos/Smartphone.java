package Heranca.SistemaDeEletronicos;

public class Smartphone extends ProdutoEletronico {
    private String tamanhoTela;
    private int capacidadeBateria;

    //construtor
    public Smartphone(String marca, String modelo, double preco, int voltagem, String tamanhoTela, int capacidadeBateria){
        super(marca, modelo, preco, voltagem);
        this.tamanhoTela = tamanhoTela;
        this.capacidadeBateria = capacidadeBateria;
    }
    @Override
    public double calcularGarantiaEstendida(){
        return preco * 0.2;
    }

    @Override
    public void exibirEspecificadores(){

    }
}
