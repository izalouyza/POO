package DesafiosProgressao.FormasGeometricas;

public class Circulo extends Forma {
    private double raio;
    private double pi = 3.14;

    //construtor
    public Circulo(double raio){
        super("Círculo");
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        double areac = pi * (raio * raio);
        System.out.println("Área: " + areac);
        return areac;
    }

    @Override
    public double calcularPerimetro(){
        double peri = 2 * pi * raio;
        System.out.println("Perímetro: " + peri);
        System.out.println("------------------");
        return peri;
    }
}
