package DesafiosProgressao.AnimaisHabilidades;

public abstract class Animal {
    protected String nome;

    //construtor
    public Animal(String nome){
        this.nome = nome;
    }

    public void comer(){
        System.out.println(nome + " está comendo");
    }

    public abstract void fazerSom();
}
