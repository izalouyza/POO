package aula4;

public class utilitarios {
    public void print(String messagem) {
        System.out.print(messagem);
    }

    public void println(String messagem) {
        System.out.println(messagem);
    }

    public void printf(String mensagem, Object... argumentos) {
        System.out.printf(mensagem + "\n", argumentos);
    }

    public void exibeMenu(){
        print("""
                Menu

                1 - Soma
                2 - Subtração
                3 - Multiplicação
                4 - Divisão
                0 - Sair

                Escolha uma opção:
                """);
    }
}
