package aparelhos;

import servicos.internet.Google;
import servicos.internet.NavegadorInternet;
import servicos.musica.ReprodutorMusica;
import servicos.musica.Spotify;
import servicos.telefone.AparelhoTelefonico;

import java.util.ArrayList;
import java.util.Scanner;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusica {
    Scanner sc = new Scanner(System.in);

    ArrayList<String> musicasIphone = new ArrayList<>();
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void adicionarMusica() {
        System.out.println("Adicione uma musica no Apple Music:");
        String musica = sc.nextLine();
        musicasIphone.add(musica);
    }

    @Override
    public void adicionarMusica(String musica){
        System.out.println("Adicionando musica no Apple Music: " + musica);
        musicasIphone.add(musica);
    }

    @Override
    public void selecionarMusica() {
//        System.out.println("Selecionando musica " + musica + " no spotify");
        System.out.println("Escolha uma musica: ");
        System.out.println(musicasIphone);

        String musicaEscolhida = sc.nextLine();

        boolean musicaExiste = musicasIphone.contains(musicaEscolhida);
        if(!musicaExiste){
            System.out.println("Musica nao encontrada");
            return;
        }
        tocar(musicaEscolhida);
    }

    @Override
    public void tocar(String musica){
        System.out.println("Tocando musica " + musica + " pelo Apple Music");
    }

    @Override
    public void pausar(){
        System.out.println("Pausando musica pelo Apple Music");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url + " via Safari" );
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Safari");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no Safari");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ArrayList<String> musicas = new ArrayList<>();

        NavegadorInternet google = new Google();
        ReprodutorMusica spotify = new Spotify();
        Iphone iphone = new Iphone();

        System.out.println("Adicionando musicas separadamente");

        iphone.adicionarMusica();
        iphone.selecionarMusica();

        spotify.adicionarMusica();
        spotify.selecionarMusica();
//        spotify.tocar(musica);

//        iphone.tocar(musica);
        System.out.println("--------------------");

        System.out.println("Adicionando musicas em ambos os serviços");
        String musica = sc.nextLine();
        iphone.adicionarMusica(musica);
        spotify.adicionarMusica(musica);

        System.out.println("--------------------");

        System.out.println("Disque um numéro: ");
        String numero = sc.nextLine();

        iphone.ligar(numero);

        System.out.println("--------------------");

        iphone.exibirPagina("www.google.com.br");
        google.exibirPagina("www.google.com.br");
    }
}
