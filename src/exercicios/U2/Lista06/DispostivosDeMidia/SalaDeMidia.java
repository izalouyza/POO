package DispostivosDeMidia;

public class SalaDeMidia {
    public void iniciarSessaoDeMusica(ReprodutorAudio dispositivo, String faixa){
        dispositivo.tocarMusica(faixa);
    }
    public void iniciarSessaoDeFilme(ReprodutorVideo dispositivo, String filme){
        dispositivo.tocarVideo(filme);
    }
}
