package DispostivosDeMidia;

public class Projetor implements ReprodutorVideo {
    @Override
    public void tocarVideo(String filme) {
        System.out.println("Exibindo vídeo no Projetor: " + filme);
    }
}
