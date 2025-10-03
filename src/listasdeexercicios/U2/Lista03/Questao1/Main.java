package Questao1;

public class Main {
    public static void main(String[] args){
        System.out.println("\n----------- Veículo Comum -----------\n");
        Veiculo veic = new Veiculo("Volkswagen", "SUV", 2025, 500000);
        veic.calcularIpva();
        veic.exibirDetalhes();

        System.out.println("\n----------- Caminhão -----------\n");
        Veiculo caminhao = new Caminhao("Mercedes-Benz", "Accelo", 2026, 500000, 13);
        caminhao.calcularIpva();
        caminhao.exibirDetalhes();

        System.out.println("\n----------- Moto -----------\n");
        Veiculo moto = new Moto("Kawasaki", "Ninja ZX-10R", 2024, 45000, 998);
        moto.calcularIpva();
        moto.exibirDetalhes();
    }
}
