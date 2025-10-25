package Heranca.SistemaDeVeiculos;

public class Moto extends Veiculo{
    private int cilindrada;

    public Moto(String marca, String modelo, int ano, double preco, int cilindrada){
        super(marca, modelo, ano, preco);
        this.cilindrada = cilindrada;
    }

    public Moto(){}

    public void isMoto(){
        System.out.print("Informe a quantidade de cilindradas: ");
        this.cilindrada = input.nextInt();
    }

    @Override
    public double calcularIpva(){
        return preco * 0.02;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cilindradas: " + cilindrada);
    }
}
