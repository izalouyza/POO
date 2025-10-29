package DispostivosDeMidia;

public class SmartTV implements ReprodutorAudio, ReprodutorVideo {
    @Override
    public void tocarMusica(String faixa) {
        System.out.println("SmartTV tocando áudio: " + faixa);
    }

    @Override
    public void tocarVideo(String filme) {
        System.out.println("SmartTV exibindo filme: " + filme);
    }
}
