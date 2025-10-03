package Questao1;

class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int ano, double preco, int cilindrada) {
        super(marca, modelo, ano, preco);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularIpva(){
        return preco * 0.02;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Cilindradas: " + cilindrada);
    }
}
