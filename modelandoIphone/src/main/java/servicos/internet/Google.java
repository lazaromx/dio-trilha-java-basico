package servicos.internet;

public class Google implements NavegadorInternet {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url + " via Google:" );
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba no Google");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Atualizando página no Google");
    }
}
