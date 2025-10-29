package Interfaces;

public class Retangulos extends Quadrilateros {
    private double tamBase;
    private double tamAltura;

    //construtor
    public Retangulos(double tamBase, double tamAltura){
        super(tamBase, tamAltura, tamBase, tamAltura);
        this.tamBase = tamBase;
        this.tamAltura = tamAltura;
    }

    @Override
    public double calcularArea(){
        return tamBase * tamAltura;
    }
}
