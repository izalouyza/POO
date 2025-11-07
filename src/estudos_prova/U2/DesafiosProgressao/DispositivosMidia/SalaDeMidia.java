package DesafiosProgressao.DispositivosMidia;

public class SalaDeMidia {
    void iniciarSessaoDeMusica(ReprodutorAudio dispositivo, String faixa){
        System.out.println("Iniciando Sessão de Música...");
        System.out.println("Faixa: " + faixa);
        System.out.println("----------------");
    }

    void iniciarSessaoDeFilme(ReprodutorVideo dispositivo, String filme){
        System.out.println("Iniciando Sessão de Filme...");
        System.out.println("Filme: " + filme);
        System.out.println("----------------");
    }
}
