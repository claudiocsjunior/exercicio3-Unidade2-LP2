package br.ufrn.imd.excecao;

public class AcimaVelocidadeException extends Exception{
	/**
	 * retorna a mensagem de ulrapassagem de velocidade m�xima
	 */
    public String getMessage(){
        return "Excedeu a velocidade m�xima!";
    }

}
