package Questao3;

public class Curso {
    protected String nome;
    protected int cargaHoraria;
    protected double preco;
    protected String nivel; //basico, intermediario, avançado

    //Construtor
    public Curso(String nome, int cargaHoraria, double preco, String nivel) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.preco = preco;
        this.nivel = nivel;
    }

    public double calcularDesconto(){
        return preco * 0.10;
    }

    public void exibirInformacoes(){
        System.out.printf("Preço do Curso: R$ %.2f\n", preco);
        System.out.printf("Desconto: R$ %.2f%n\n", calcularDesconto());
        System.out.println("Nome do curso: " + nome);
        System.out.println("Carga Horária do Curso: " + cargaHoraria + " horas");
        System.out.println("Nível do Curso: " + nivel);
    }
}
