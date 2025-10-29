package Interfaces;

public abstract class Quadrilateros implements FormaGeometrica {
    protected double tamLado1, tamLado2, tamLado3, tamLado4;

    public Quadrilateros(double tamLado1, double tamLado2, double tamLado3, double tamLado4) {
        this.tamLado1 = tamLado1;
        this.tamLado2 = tamLado2;
        this.tamLado3 = tamLado3;
        this.tamLado4 = tamLado4;
    }

    @Override
    public double calcularPerimetro(){
        return tamLado1 + tamLado2 + tamLado3 + tamLado4;
    }

}
