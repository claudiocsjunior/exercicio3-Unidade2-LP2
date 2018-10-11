package br.ufrn.imd.visao;

import br.ufrn.imd.dominio.Pista;
import br.ufrn.imd.excecao.PistaException;


public class Aplicacao {
	/**
	 * Executável inicial da aplicação
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
