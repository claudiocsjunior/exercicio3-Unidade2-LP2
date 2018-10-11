package br.ufrn.imd.visao;

import br.ufrn.imd.dominio.Conversor;

public class Aplicacao {
	/**
	 * Método de inicio da aplicação
	 * @param args
	 */
	public static void main(String[] args) {
		//passar o valor do grau em Fahrenheit para conversÃ£o
		Conversor conversor = new Conversor(50);
		try{
			conversor.converter();
			System.out.println("Fahrenheit: " + conversor.getTempFahrenheit());
			System.out.println("Celsius: " + conversor.getTempCelsius());
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
