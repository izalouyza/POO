package Heranca.SistemaDeImoveis;

public class Casa extends Imovel{
    private String areaQuintal;
    private boolean temPiscina;

    //construtor
    public Casa(String endereco, String area, int numeroQuartos, double preco, String areaQuintal, boolean temPiscina){
        super(endereco, area, numeroQuartos, preco);
        this.areaQuintal = areaQuintal;
        this.temPiscina = temPiscina;
    }

    public Casa(){}

    //setters
    public void setAreaQuintal(String areaQuintal) {
        this.areaQuintal = areaQuintal;
    }

    public void setTemPiscina(boolean temPiscina) {
        this.temPiscina = temPiscina;
    }

    //getters
    public String getAreaQuintal(){
        return areaQuintal;
    }

    public boolean getTemPiscina() {
        return temPiscina;
    }

    @Override
    public double calcularTaxaAdministracao(){
        return preco * 0.1;
    }

    @Override
    public void exibirCaracteristicas(){
        super.exibirCaracteristicas();
        System.out.println("Área do quintal: " + this.areaQuintal);
        System.out.println("Tem piscina? " + this.temPiscina);
    }
}
