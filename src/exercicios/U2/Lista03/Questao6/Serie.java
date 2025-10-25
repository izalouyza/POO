package Questao6;

public class Serie extends Midia{
    private int numeroTemporadas;
    private int episodiosPorTemporada;

    //Construtor
    public Serie(String titulo, int anoLancamento, String duracao, double preco, int numeroTemporadas, int episodiosPorTemporada) {
        super(titulo, anoLancamento, duracao, preco);
        this.numeroTemporadas = numeroTemporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    @Override
    public double calcularPrecoAluguel(){
        return preco * 0.12;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Número de Temporadas: " + numeroTemporadas);
        System.out.println("Episódios por Temporada: " + episodiosPorTemporada + " episódios");
    }
}
