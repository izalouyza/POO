package DesafiosProgressao.FormasGeometricas;

public class Retangulo extends Forma {
    private double largura;
    private double altura;

    //construtor
    public Retangulo(double largura, double altura){
        super("Retângulo");
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        double area;
        area = largura * altura;
        System.out.println("Área: " + area);
        return area;
    }

    @Override
    public double calcularPerimetro(){
        double perimetro;
        perimetro = 2 * (largura + altura);
        System.out.println("Perímetro: " + perimetro);
        System.out.println("------------------");
        return perimetro;
    }
}
