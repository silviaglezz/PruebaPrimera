package com.cursojava.clases;

/**
 * Clase abstracta que representa los vehiculos
 * Los vehiculos están determinados por el numero de ruedas
 * 
 * @author Silvia Gonzalez / ViewNext
 * @version 1.0, 10/12/2024
 *
 */
public abstract class Vehiculo {
	protected int numRuedas;

	public Vehiculo(int numRuedas) {
		super();
		this.numRuedas = numRuedas;
	}

	public int getNumRuedas() {
		return numRuedas;
	}
	
}
