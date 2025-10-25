package Questao6;

public class Midia {
    protected String titulo;
    protected int anoLancamento;
    protected String duracao;
    protected double preco;

    //Construtor
    public Midia(String titulo, int anoLancamento, String duracao, double preco){
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
        this.preco = preco;
    }
    public double calcularPrecoAluguel(){
        return preco * 0.1;
    }

    public void exibirInfo(){
        System.out.printf("\nPreço: R$ %.2f\n", preco);
        System.out.printf("Preço do aluguel: R$ %.2f\n", calcularPrecoAluguel());
        System.out.println("\nTítulo: " + titulo);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração: " + duracao);
    }
}
