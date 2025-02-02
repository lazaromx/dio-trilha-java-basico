package aparelhos;

import servicos.internet.Google;
import servicos.internet.NavegadorInternet;
import servicos.musica.ReprodutorMusica;
import servicos.musica.Spotify;
import servicos.telefone.AparelhoTelefonico;

import java.util.ArrayList;
import java.util.Scanner;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusica {
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
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica " + musica + " Pelo Apple Music");
    }

    @Override
    public void tocar(String musica){
        System.out.println("Tocando musica pelo Apple Music");
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


//        System.out.println("Adicione uma musica: ");
//        String musica = sc.nextLine();
//        musicas.add(musica);

        System.out.println("Digite uma musica: ");
        String musica = sc.nextLine();

        spotify.selecionarMusica(musica);
        spotify.tocar(musica);

        iphone.selecionarMusica(musica);
        iphone.tocar(musica);
        System.out.println("--------------------");

        System.out.println("Disque um numéro: ");
        String numero = sc.nextLine();

        iphone.ligar(numero);

        System.out.println("--------------------");

        iphone.exibirPagina("www.google.com.br");
        google.exibirPagina("www.google.com.br");
    }
}
