package br.ufrn.imd.visao;

import br.ufrn.imd.dominio.Pista;
import br.ufrn.imd.excecao.PistaException;


public class Aplicacao {
	/**
	 * Execut�vel inicial da aplica��o
	 * @param args
	 */
	public static void main(String[] args) {
		Pista pista = new Pista();
		try{
			pista.iniciar();
		}catch (PistaException e) {
			System.err.println(e.getMessage());
		}
	}

}
