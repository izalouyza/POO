package ExLista1;

import java.util.Scanner;

public class LitrosCombustivel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o tempo gasto na viagem: ");
        double tempoGasto = input.nextDouble();

        System.out.print("Informe a velocidade média: ");
        double velocidadeMedia = input.nextDouble();

        double distancia = tempoGasto * velocidadeMedia;

        double litrosUsados = distancia/12.0;

        System.out.printf("""
                Velocidade média: %.1fkm/h
                Tempo gasto: %.1fh
                Distância percorrida: %.1fkm
                Quantidade de litros utilizados: %.1fL""", velocidadeMedia, tempoGasto, distancia, litrosUsados);
    }
}
