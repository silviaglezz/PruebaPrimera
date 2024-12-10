package com.cursojava.clases;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import com.cursojava.interfaces.Conducible;

/**
 * Clase que representa un coche, extendiendo de la super clase Vehiculo y que implementa la interfaz Conducible
 * Cada coche queda determinado por su color, la matricula, el espacio que recorre, el tiempo inicial del viaje, 
 * el tiempo final del viaje y una variable para saber si esta en movimiento el coche
 * 
 * @author Silvia Gonzalez / ViewNext
 * @version 1.0, 10/12/2024
 *
 */
public class Coche extends Vehiculo implements Conducible {
	private String color;
	private final String matricula;
	private double espacioRecorrido = 0; // Espacio recorrido en metros
	private LocalTime tiempoInicial;
	private LocalTime tiempoFinal;
	private boolean enMovimiento = false;
	
	public Coche(String color, String matricula) {
		super(4);
		this.color = color;
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public int getNumRuedas() {
		return super.getNumRuedas();
	}

	/**
	 * Método que inicia la conducción en el momento que se llama
	 */
	@Override
	public void conducir() {
		if(!enMovimiento) {
			tiempoInicial = LocalTime.now();
			enMovimiento = true;
			System.out.println("El coche ha comenzado a moverse.");
		} else {
			System.out.println("El coche ya está en movimiento.");
		}
	}

	/**
	 * Método que hace avanzar al coche los metros indicados si este se estaba conduciendo
	 * 
	 * @param metros indica los metros para avanzar
	 */
	@Override
	public void avanzar(int metros) {
		if(enMovimiento) {
			espacioRecorrido += metros;
			System.out.println("El coche avanzó " + metros + " metros. El espacio recorrido total es de " + espacioRecorrido + " metros.");
		} else {
			System.out.println("El coche no se está moviendo.");
		}
	}

	/**
	 * Método que hace retroceder al coche los metros indicados si este se estaba conduciendo
	 * 
	 * @param metros indica los metros para retroceder
	 */
	@Override
	public void retroceder(int metros) {
		if(enMovimiento) {
			espacioRecorrido -= metros;
			System.out.println("El coche retrocedió " + metros + " metros. El espacio recorrido total es de " + espacioRecorrido + " metros.");
		} else {
			System.out.println("El coche no se está moviendo.");
		}
	}

	/**
	 * Método que hace parar al coche y se muestra el tiempo total en minutos que duró el viaje
	 */
	@Override
	public void parar() {
		if(enMovimiento) {
			tiempoFinal = LocalTime.now();
			enMovimiento = false;
			long tiempoViaje = ChronoUnit.SECONDS.between(tiempoInicial, tiempoFinal); //obtener la diferencia en minutos
			System.out.println("El coche ha parado. El viaje duró " + tiempoViaje + " segundos.");
		} else {
			System.out.println("El coche ya está parado.");
		}
	}
	
	/**
	 * Método para calcular la velocidad media del coche sabiendo el tiempo total del viaje y el espacio recorrido
	 */
	public void calcularVelocidad() {
		long tiempoTotal = ChronoUnit.SECONDS.between(tiempoInicial, tiempoFinal);
		if(tiempoTotal > 0) {
			double tiempoSegs = tiempoTotal / 1000.0;
			double velocidad = (espacioRecorrido / tiempoSegs)*3.6; // velocidad en km/h
			System.out.println("La velocidad media del viaje fue de " + velocidad + " km/h.");
		} else {
			System.out.println("El tiempo del viaje no es válido");
		}	
	}

}
