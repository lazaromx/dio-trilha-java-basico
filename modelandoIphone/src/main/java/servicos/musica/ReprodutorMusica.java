package servicos.musica;

public interface ReprodutorMusica {
    void tocar(String musica);

    void pausar();

    void selecionarMusica();

    void adicionarMusica();

    void adicionarMusica(String musica);
}
