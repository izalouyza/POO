package Heranca.SistemaDeImoveis;

public class Apartamento extends Imovel{
    private int andar;
    private double valorCondominio;

    //construtor
    public Apartamento(String endereco, String area, int numeroQuartos, double preco, int andar, double valorCondominio){
        super(endereco, area, numeroQuartos, preco);
        this.andar = andar;
        this.valorCondominio = valorCondominio;
    }

    public Apartamento(){}

    //setters
    public void setAndar(int andar) {
        this.andar = andar;
    }

    public void setValorCondominio(double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

    //getters
    public int getAndar() {
        return andar;
    }

    public double getValorCondominio() {
        return valorCondominio;
    }

    @Override
    public double calcularTaxaAdministracao(){
        return preco * 0.6;
    }

    @Override
    public void exibirCaracteristicas(){
        super.exibirCaracteristicas();
        System.out.println("Andar: " + this.andar);
        System.out.println("Valor do condomínio: R$ " + this.valorCondominio);
    }
}
