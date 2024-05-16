package main.java.com.apple.model;

import main.java.com.apple.interfaces.NavegadorInternet;
import main.java.com.apple.interfaces.ReprodutorMusica;
import main.java.com.apple.interfaces.Telefone;

public class Iphone implements ReprodutorMusica, Telefone, NavegadorInternet {
    @Override
    public void tocar() {
        System.out.println("Tocando musica Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Musica Iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica Iphone");
    }

    @Override
    public void ligar() {
        System.out.println("ligando para numero no Iphone");
    }

    @Override
    public void atender() {
        System.out.println("atendendo o numero no Iphone");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz no Iphone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página no iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no iphone");
    }

    @Override
    public void adicionarPagina() {
        System.out.println("Adicionando página no iphone");
    }
}
