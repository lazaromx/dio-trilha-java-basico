package servicos.musica;

import java.util.ArrayList;
import java.util.Scanner;

public class Spotify implements ReprodutorMusica{
    Scanner sc = new Scanner(System.in);
    ArrayList<String> musicasSpotify = new ArrayList<>();

    public void adicionarMusica() {
        System.out.println("Adicione uma musica no Spotify:");
        String musica = sc.nextLine();
        musicasSpotify.add(musica);
    }

    public void adicionarMusica(String musica) {
        System.out.println("Adicionando musica no Spotify: " + musica);
        musicasSpotify.add(musica);
    }

    public void selecionarMusica() {

//        System.out.println("Selecionando musica " + musica + " no spotify");
        System.out.println("Escolha uma musica: ");
        System.out.println(musicasSpotify);

        String musicaEscolhida = sc.nextLine();

        boolean musicaExiste = musicasSpotify.contains(musicaEscolhida);

        if(!musicaExiste){
            System.out.println("Musica nao encontrada");
            return;
        }
        tocar(musicaEscolhida);
    }
    public void tocar(String musica){
        System.out.println("tocando musica " + musica +  " no spotify");
    }

    public void pausar(){
        System.out.println("pausando musica no spotify");
    }

}
