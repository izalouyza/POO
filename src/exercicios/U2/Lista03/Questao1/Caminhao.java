package Questao1;

class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, double preco, double capacidadeCarga) {
        super(marca, modelo, ano, preco);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularIpva(){
        return preco * 0.015;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
    }
}
