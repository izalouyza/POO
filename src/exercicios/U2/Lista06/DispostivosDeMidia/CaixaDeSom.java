package DispostivosDeMidia;

public class CaixaDeSom implements ReprodutorAudio {
    @Override
    public void tocarMusica(String faixa) {
        System.out.println("Tocando música na Caixa de Som: " + faixa);
    }
}
