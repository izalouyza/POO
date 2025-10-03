package Questao9;

public class LivroDidatico extends Livro{
    private String disciplina;

    //Construtor
    public LivroDidatico(String titulo, String autor, int anoPublicacao, double preco, String disciplina) {
        super(titulo, autor, anoPublicacao, preco);
        this.disciplina = disciplina;
    }

    @Override
    public double calcularMultaAtraso(int diasAtraso){
        return diasAtraso * 1.00;
    }

    @Override
    public void exibirFichaCatalografica(){
        super.exibirFichaCatalografica();
        System.out.println("Disciplina: " + disciplina);
    }
}
