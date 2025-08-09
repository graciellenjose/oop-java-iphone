package iphone.classes;

import iphone.interfaces.AparelhoTelefonico;
import iphone.interfaces.NavegadorInternet;
import iphone.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
        System.out.println("Música tocando");
    }

    @Override
    public void pausar(){
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("Reproduzindo: %s", musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.printf("Discando para %s", numero);
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando " + url);
    }

    @Override
    public void adicionarNovaAba() {
        int abasAbertas = 1;

        abasAbertas = abasAbertas + 1;

        System.out.println("Aba aberta!\nTotal de abas abertas: " + abasAbertas);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}
