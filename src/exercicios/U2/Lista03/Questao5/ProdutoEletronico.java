package Questao5;

public class ProdutoEletronico {
    protected String marca;
    protected String modelo;
    protected double preco;
    protected String voltagem;

    //Construtor
    public ProdutoEletronico(String marca, String modelo, double preco, String voltagem) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.voltagem = voltagem;
    }

    public double calcularGarantiaEstendida(){
        return preco * 0.15;
    }

    public void exibirEspecificacoes(){
        System.out.printf("\nGarantia Estendida: %.2f\n", calcularGarantiaEstendida());
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("\nMarca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Voltagem: " + voltagem);
    }


}
