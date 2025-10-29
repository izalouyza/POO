package Interfaces;

public class Circulo implements FormaGeometrica{
    private double tamRaio;
    double pi = 3.14;

    //construtor
    public Circulo(double tamRaio){
        this.tamRaio = tamRaio;
    }

    @Override
    public double calcularPerimetro(){
        return 2 * pi * tamRaio;
    }

    @Override
    public double calcularArea(){
        return pi * (tamRaio * tamRaio);
    }
}
