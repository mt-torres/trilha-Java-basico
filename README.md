## Desafio Java Básico / Diagrama Iphone ☕

Diagrama de classes baseado no iphone, são 3 classes interface `ReprodutorMusical`, `AparelhoTelefonico` e `NavegadorInternet`. Elas são implentadas pela classe `Iphone`

# Modelo diagrama de classes #
```mermaid
classDiagram
    class ReprodutorMusical
    <<Interface>>ReprodutorMusical
    class AparelhoTelefonico
    <<Interface>>AparelhoTelefonico
    class NavegadorInternet
    <<Interface>>NavegadorInternet
    
    ReprodutorMusical : +tocar()
    ReprodutorMusical : +pausar()
    ReprodutorMusical : +selecionarMusica(String musica)
    AparelhoTelefonico : +ligar(String numero)
    AparelhoTelefonico : +atender()
    AparelhoTelefonico : +iniciarCorreioVoz()
    NavegadorInternet: +exibirPagina(String url)
    NavegadorInternet: +adicionarNovaAba()
    NavegadorInternet: +atualizarPagina()


    ReprodutorMusical <|-- Iphone
    AparelhoTelefonico <|-- Iphone
    NavegadorInternet <|-- Iphone
    class Iphone{
      
    }
```

## Ferramentas

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Eclipse](https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white)
