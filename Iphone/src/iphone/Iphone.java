package iphone;

import navegador.AdicionarNovaAba;
import navegador.AtualizarPagina;
import navegador.ExibirPagina;
import navegador.NavegadorInternet;
import reprodutor.Pausar;
import reprodutor.ReprodutorMusicial;
import reprodutor.SelecionarMusica;
import reprodutor.Tocar;
import telefone.AparelhoTelefonico;
import telefone.Atender;
import telefone.IniciarCorreioVoz;
import telefone.Ligar;

public class Iphone {
	public static void main (String[] args) {
		NavegadorInternet adicionar = new AdicionarNovaAba();
		adicionar.navegar();
		NavegadorInternet atualizar = new AtualizarPagina();
		atualizar.navegar();
		NavegadorInternet exibir = new ExibirPagina();
		exibir.navegar();
		
		ReprodutorMusicial iniciar = new Tocar();
		iniciar.reproduzir();
		ReprodutorMusicial parar = new Pausar();
		parar.reproduzir();
		ReprodutorMusicial escolher = new SelecionarMusica();
		escolher.reproduzir();
		
		AparelhoTelefonico receber = new Atender();
		receber.chamar();
		AparelhoTelefonico correio = new IniciarCorreioVoz();
		correio.chamar();
		AparelhoTelefonico fazer = new Ligar();
		fazer.chamar();
			

	}
	
}
