package dispositivo;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    String nomeUsuário;


    // Get and set
    public String getNomeUsuário() {
        return nomeUsuário;
    }

    public void setNomeUsuário(String nomeUsuário) {
        this.nomeUsuário = nomeUsuário;
    }


    // ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("\nMúsica pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("\nMúsica selecionada: " + musica);
        tocar();
    }


    // NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("\nExibindo página de URL: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("\nNova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("\nAtualizando página");
    }


    // Aparelho telefônico
    @Override
    public void atender() {
        System.out.println("\nAtendendo chamda\n");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("\nIniciando correio de voz\n");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("\nLigando para o número: " + numero + "\n");
    }
}
