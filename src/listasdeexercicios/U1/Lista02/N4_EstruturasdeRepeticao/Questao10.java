package N4_EstruturasdeRepeticao;

public class Questao10 {
    public static void contaMultiplo() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i);

            if (i % 10 == 0) {
                System.out.print(" Múltiplo de 10");
            }

            System.out.println();
        }
    }
}
