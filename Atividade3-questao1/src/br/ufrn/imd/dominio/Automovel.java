/**
 * 
 */
package br.ufrn.imd.dominio;
import javax.sql.rowset.spi.TransactionalWriter;

import br.ufrn.imd.excecao.*;

/**
 * @author claudio_junior
 *
 */
public class Automovel {
	public static final int VELOCIDADE_MAXIMA = 120;
	
	private int velocidadeAtual;
	/**
	 * 
	 */
	public Automovel() {
		this.velocidadeAtual = 0;
	}
	
	public void acelerar(int velocidadeAdicionada) throws AcimaVelocidadeException{
		if((this.velocidadeAtual + velocidadeAdicionada) > VELOCIDADE_MAXIMA){
			throw new AcimaVelocidadeException();
		}else{
			this.velocidadeAtual = this.velocidadeAtual + velocidadeAdicionada;
		}
	}

}
