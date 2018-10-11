package br.ufrn.imd.visao;

import br.ufrn.imd.dominio.Conversor;

public class Aplicacao {
	/**
	 * M�todo de inicio da aplica��o
	 * @param args
	 */
	public static void main(String[] args) {
		//passar o valor do grau em Fahrenheit para conversão
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
