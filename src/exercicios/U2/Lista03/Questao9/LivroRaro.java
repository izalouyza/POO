package Questao9;

public class LivroRaro extends Livro{
    private String edicaoLimitada;

    //Construtor
    public LivroRaro(String titulo, String autor, int anoPublicacao, double preco, String edicaoLimitada) {
        super(titulo, autor, anoPublicacao, preco);
        this.edicaoLimitada = edicaoLimitada;
    }

    @Override
    public double calcularMultaAtraso(int diasAtraso){
        return diasAtraso * 5.00;
    }

    @Override
    public void exibirFichaCatalografica(){
        super.exibirFichaCatalografica();
        System.out.println("Edição limitada? " + edicaoLimitada);
    }
}
