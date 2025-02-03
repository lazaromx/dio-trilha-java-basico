## Diagrama de Classes feito pelo [Mermaid](https://mermaid.js.org/)
``` mermaid
classDiagram
    
    class Iphone{

    }

    class NavegadorInternet{
        +exibirPagina(String url)
        +adicionarNovaAaba()
        +atualizarPagina()
    }

    class ReprodutorMusica{
        +tocar(String musica)
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico{
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class Google{

    }

    class Spotify{

    }

    Iphone --> NavegadorInternet
    Iphone --> ReprodutorMusica
    Iphone --> AparelhoTelefonico   

    Iphone --> Google    
    Iphone --> Spotify

    NavegadorInternet <-- Google
    ReprodutorMusica <-- Spotify
```
       
