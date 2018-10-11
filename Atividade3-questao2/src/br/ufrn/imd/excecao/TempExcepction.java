package br.ufrn.imd.excecao;

public class TempExcepction extends Exception{
	/**
	 * Método de recuperação da mensagem de erro da conversão
	 */
	public String getMessage(){
        return "Problemas na conversão";
    }

}
