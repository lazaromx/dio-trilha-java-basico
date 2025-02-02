package servicos.musica;

import java.util.ArrayList;

public class Spotify implements ReprodutorMusica{

//    ArrayList<String> musicas = new ArrayList<>();
    public void tocar(String musica){
        System.out.println("tocando musica " + musica +  " no spotify");
    }

    public void pausar(){
        System.out.println("pausando musica no spotify");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica " + musica + " no spotify");
    }

//    public void selecionarMusica(String musica) {
//        System.out.println(musicas);
//    }
}
