package br.ufrn.imd.excecao;

public class AcimaVelocidadeException extends Exception{
	/**
	 * retorna a mensagem de ulrapassagem de velocidade máxima
	 */
    public String getMessage(){
        return "Excedeu a velocidade máxima!";
    }

}
