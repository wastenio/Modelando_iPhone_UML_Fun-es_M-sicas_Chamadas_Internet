# DIO - Trilha Java Basico

## Autor
- Gleyson Sampaio

## POO - Desafio

Modelagem e Diagramação de um Componente iPhone
Neste desafio, você será responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

## Contexto

Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), você deve elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implemente as classes e interfaces no formato de arquivos .java.

[Lançamento Iphone 2007]( https://www.youtube.com/watch?v=9ou608QQRq8 )

- Minutos relevantes: 00:15 até 00:55

## Funcionalidade a Modelar

1. Reprodutor Musical
     - Métodos: tocar(), pausar(), selecionarMusica(String musica)

2. Aparelho Telefonico
     - Métodos: ligar(String numero), atender(), iniciarCorreioVoz()

3.Navegador na Internet
  - Métodos: exibirPagina(String url), adicionarNovaAba(), atualizarPagina()

## Objetivo
- Criar um diagrama UML que represente as funcionalidades descritas acima.
- Implementar as classes e interfaces correspondentes em Java (Opcional).

# Realização do desafio

## Autor:

- Wastenio da Silva Rocha

# Criando uma modelagem UML das funcionalidade do Iphone Basico com base no video disponibilizado.

![UML das funcionalidades desenvolvidas](https://github.com/wastenio/Modelando_iPhone_UML_Fun-es_M-sicas_Chamadas_Internet/blob/main/Modelando_Iphone_UML_Funcionalidades/src/main/java/com/image/UML%20funcionalidades%20Iphone.png)

## Funcionalidades Basicas

 - Tocar Musicas
 - Realizar Ligação
 - Navegar na Internet

## Estrutura do projeto

src
    └── main
        └── java
            └── com
                └── iphone
                    └── iphone
                    │   └── iPhone.java
                    ├── musica
                    │   └── ReprodutorMusical.java
                    ├── telefone
                    │   └── AparelhoTelefonico.java
                    ├── navegador
                    │   └── NavegadorNaInternet.java
                    └── Main.java

## Instalação e Execução do projeto

- Clone o repositorio do projeto no seu computador
- Abra a pasta do projeto no VsCode
- Execute o arquivo Main.java


