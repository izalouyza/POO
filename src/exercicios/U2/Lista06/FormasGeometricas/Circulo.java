package FormasGeometricas;

public class Circulo extends Forma {
    private double raio;
    double pi = 3.14;

    //construtor
    public Circulo(double raio){
        super("Círculo");
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return pi * (raio * raio);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * pi * raio;
    }
}
