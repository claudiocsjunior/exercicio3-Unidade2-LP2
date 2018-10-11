package br.ufrn.imd.excecao;

public class FahException extends TempExcepction{

	public String getMessage(){
        return "Erro na conversão de Fahrenheit para celsius. Valor informado para a conversão é menor que o zero absoluto ";
    }

}
