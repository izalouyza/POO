package Questao4;

public class Apartamento extends Imovel {
    private int andar;
    private double valorCondominio;

    //Construtor
    public Apartamento(String endereco, int area, int numeroQuartos, double preco, int andar, double valorCondominio) {
        super(endereco, area, numeroQuartos, preco);
        this.andar = andar;
        this.valorCondominio = valorCondominio;
    }

    @Override
    public double calcularTaxaAdministracao(){
        return preco * 0.06;
    }

    @Override
    public void exibirCaracteristicas(){
        super.exibirCaracteristicas();
        System.out.println("Andar: " + andar + "º");
        System.out.printf("Valor de condominio: R$ %.2f\n", valorCondominio);
    }
}
