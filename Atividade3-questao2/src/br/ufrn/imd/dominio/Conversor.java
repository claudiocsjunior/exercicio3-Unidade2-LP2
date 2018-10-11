package br.ufrn.imd.dominio;

import br.ufrn.imd.excecao.FahException;
import br.ufrn.imd.excecao.TempExcepction;

public class Conversor {
	public static final double VALOR_ABSOLUTO_FAHRENHEIT = -429.67;
	private double tempFahrenheit;
	private double tempCelsius;
	
	public Conversor(double tempFahrenheit){
		this.tempFahrenheit = tempFahrenheit;
		this.tempCelsius = 0;
	}
	
	public void converter() throws TempExcepction{
		if(this.tempFahrenheit < VALOR_ABSOLUTO_FAHRENHEIT){
			throw new FahException();
		}else{
			this.tempCelsius = (5*(this.tempFahrenheit - 32))/9;
		}
	}

	public double getTempFahrenheit() {
		return tempFahrenheit;
	}

	public double getTempCelsius() {
		return tempCelsius;
	}

}
