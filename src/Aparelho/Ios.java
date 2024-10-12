package Aparelho;

import Navegador.Navegador;
import Player.ReprodutorMusical;
import Telefone.Telefone;

public class Ios implements Navegador, ReprodutorMusical, Telefone {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina via Ios");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando pagina via Ios");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualixando pagina via Ios");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica via Ios");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica via Ios");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica via Ios");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando via Ios");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo via Ios");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Abrindo correio de voz via Ios");
    }
    
}
