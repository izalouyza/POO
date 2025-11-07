package DesafiosProgressao.FormasGeometricas;

public abstract class Forma {
    protected String nome;

    //construtor
    public Forma(String nome){
        this.nome = nome;
    }

    public void exibirNome(){
        System.out.println("Nome da forma: " + this.nome);
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}
