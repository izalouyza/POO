package DesafiosProgressao.DispositivosMidia;

public class SmartTV implements ReprodutorAudio, ReprodutorVideo {
    public void tocarMusica(String faixa){
        System.out.println("SmartTV tocando áudio: " + faixa);
    }

    public void tocarVideo(String filme){
        System.out.println("SmartTV exibindo filme: " + filme);
    }
}
