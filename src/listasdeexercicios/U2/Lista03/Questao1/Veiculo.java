package Questao1;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double preco;

    public Veiculo(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public double calcularIpva(){
        return preco * 0.04;
    }

    public void exibirDetalhes(){
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.printf("IPVA: R$ %.2f\n", calcularIpva());
        System.out.println("\nMarca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
