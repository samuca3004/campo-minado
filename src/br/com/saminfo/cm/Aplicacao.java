package br.com.saminfo.cm;

import br.com.saminfo.cm.modelo.Tabuleiro;
import br.com.saminfo.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		new TabuleiroConsole(tabuleiro);
	}
}
