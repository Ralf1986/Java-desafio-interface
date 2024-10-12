import Aparelho.Ios;
import Navegador.Chrome;
import Navegador.Navegador;
import Navegador.Safari;
import Player.Itunes;
import Player.MusicPlayer;
import Player.ReprodutorMusical;
import Telefone.Telefone;

public class Iphone {
    public static void main(String[] args) {

        System.out.println("==================NAVEGADORES===================");
        System.out.println();
        System.out.println("================CHROME==================");

        Navegador navegador = new Chrome();
        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        System.out.println("================SAFARI==================");

        Navegador navegador2 = new Safari();
        navegador2.exibirPagina();
        navegador2.adicionarNovaAba();
        navegador2.atualizarPagina();

        System.out.println("=================IOS====================");

        Ios ios = new Ios();
        Navegador navegador3 = ios;
        navegador3.exibirPagina();
        navegador3.adicionarNovaAba();
        navegador3.atualizarPagina();
        System.out.println();

        System.out.println("===============Reprodutores Musicais================");
        System.out.println();
        System.out.println("===================Itunes=====================");

        ReprodutorMusical reprodutorMusical = new Itunes();
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica();

        System.out.println("=====================MusicPlayer===================");

        ReprodutorMusical reprodutorMusical2 = new MusicPlayer();
        reprodutorMusical2.tocar();
        reprodutorMusical2.pausar();
        reprodutorMusical2.selecionarMusica();

        System.out.println("=====================Ios===================");

        Ios ios2 = new Ios();
        ReprodutorMusical reprodutorMusical3 = ios2;
        reprodutorMusical3.tocar();
        reprodutorMusical3.pausar();
        reprodutorMusical3.selecionarMusica();

        System.out.println("====================Ligações=====================");
        System.out.println();
        System.out.println("==================Ligações Ios===================");
    
        Ios ios3 = new Ios();
        Telefone telefone = ios3;
        telefone.atender();
        telefone.ligar();
        telefone.iniciarCorreioDeVoz();

    }
}
