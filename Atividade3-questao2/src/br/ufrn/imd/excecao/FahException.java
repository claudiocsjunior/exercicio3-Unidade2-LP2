package br.ufrn.imd.excecao;

public class FahException extends TempExcepction{
	/**
	 * MÈtodo de retorno do erro na convers„o de fahrenheit para celsius
	 */
	public String getMessage(){
        return "Erro na convers√£o de Fahrenheit para celsius. Valor informado para a convers√£o √© menor que o zero absoluto ";
    }

}
