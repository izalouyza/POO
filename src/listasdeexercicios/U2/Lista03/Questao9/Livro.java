package Questao9;

public class Livro {
    protected String titulo;
    protected String autor;
    protected int anoPublicacao;
    protected double preco;

    //Construtor
    public Livro(String titulo, String autor, int anoPublicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

    public double calcularMultaAtraso(int diasAtraso){
        return diasAtraso * 2.00;
    }

    public void exibirFichaCatalografica(){
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("\nTítulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + anoPublicacao);
    }
}
