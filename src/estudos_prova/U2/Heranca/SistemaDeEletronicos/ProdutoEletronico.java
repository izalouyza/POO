package Heranca.SistemaDeEletronicos;

public class ProdutoEletronico {
    protected String marca;
    protected String modelo;
    protected double preco;
    protected int voltagem;

    //construtor
    public ProdutoEletronico(String marca, String modelo, double preco, int voltagem){
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.voltagem = voltagem;
    }

    public double calcularGarantiaEstendida(){
        return preco * 0.15;
    }

    public void exibirEspecificadores(){

    }
}
