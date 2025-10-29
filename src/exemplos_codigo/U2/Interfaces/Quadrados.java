package Interfaces;

public class Quadrados extends Quadrilateros {
    private double tamLado;

    //construtor
    public Quadrados(double tamLado){
        super(tamLado, tamLado, tamLado, tamLado);
        this.tamLado = tamLado;
    }

    @Override
    public double calcularArea(){
        return tamLado * tamLado;
    }
}
