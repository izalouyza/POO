package Questao9;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n------- Livro Comum -------\n");
        Livro livro = new Livro("O Segredo das Estrelas", "Marina Alves", 2019, 49.90);
        livro.exibirFichaCatalografica();
        System.out.printf("\nMulta por atraso: R$ %.2f\n", livro.calcularMultaAtraso(3));

        System.out.println("\n------- Livro Didático ------- \n");
        LivroDidatico livroD = new LivroDidatico("Matemática Aplicada ao Ensino Médio", "José Fernandes", 2021, 89.90,"Matemática");
        livroD.exibirFichaCatalografica();
        System.out.printf("\nMulta por atraso: R$ %.2f\n", livroD.calcularMultaAtraso(3));

        System.out.println("\n------- Livro Raro -------\n");
        LivroRaro livroR = new LivroRaro("Manuscritos do Renascimento", "Claudia Monteiro", 1923, 2499.90, "Sim");
        livroR.exibirFichaCatalografica();
        System.out.printf("\nMulta por atraso: R$ %.2f\n", livroR.calcularMultaAtraso(3));



    }
}

