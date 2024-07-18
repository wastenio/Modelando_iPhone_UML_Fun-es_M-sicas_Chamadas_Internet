package main.java.com.iphone.iphone;

import main.java.com.iphone.navegador.NavegarNaInternet;
import main.java.com.iphone.telefone.AparelhoTelefonico;
import main.java.com.iphone.musica.ReprodutorMusical;

public class iphone implements ReprodutorMusical, NavegarNaInternet, AparelhoTelefonico {
    
    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
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
    public void desligar() {
        System.out.println("Desligando chamada");
    }

    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando página");
    }

    @Override
    public void avancarPagina() {
        System.out.println("Avançando página");
    }

    @Override
    public void voltarPagina() {
        System.out.println("Voltando página");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    
}
