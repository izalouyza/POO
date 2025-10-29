package Polimorfismo;

public abstract class Animal {
    protected String nome;
    protected int idade;

    //construtor
    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void emitirSom();
}
