package br.ufrn.imd.excecao;

public class PistaException extends Exception{
	/**
	 * retorna mensagem de exceção de problemas na pista
	 */
    public String getMessage(){
        return "Foram encontrados problemas na pista!";
    }

}
