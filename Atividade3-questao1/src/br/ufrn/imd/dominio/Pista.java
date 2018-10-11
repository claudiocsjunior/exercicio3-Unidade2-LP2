package br.ufrn.imd.dominio;

import br.ufrn.imd.excecao.*;

public class Pista {
	
	public void iniciar() throws PistaException{
		Automovel automovel = new Automovel();
		try{
			automovel.acelerar(130);
			
		}catch (AcimaVelocidadeException e) {
			System.err.println(e.getMessage());
			throw new PistaException();
		}
	}

}
