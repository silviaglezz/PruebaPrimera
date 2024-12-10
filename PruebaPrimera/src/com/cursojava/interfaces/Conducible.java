package com.cursojava.interfaces;

/**
 * Interfaz conducible implementada por los diferentes vehiculos
 * La interfaz está determinada por los métodos conducir, avanzar, retroceder y parar
 * Estos métodos son implementados en las diferentes clases que implementen esta interfaz
 * 
 * @author Silvia Gonzalez / ViewNext
 * @version 1.0, 10/12/2024
 *
 */
public interface Conducible {
	void conducir();
	void avanzar(int metros);
	void retroceder(int metros);
	void parar();
}
