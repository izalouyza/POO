package DesafiosProgressao.FormasGeometricas;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        List<Forma> forma = new ArrayList<>();

        forma.add(new Retangulo(30.4, 2.4));
        forma.add(new Circulo(3.4));

        for(Forma f : forma){
            f.exibirNome();
            f.calcularArea();
            f.calcularPerimetro();
        }
    }
}
