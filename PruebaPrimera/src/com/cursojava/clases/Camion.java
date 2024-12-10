package com.cursojava.clases;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cursojava.interfaces.Conducible;

/**
 * Clase que representa camiones, extendiendo de la super clase Vehiculo y que implementa la interfaz Conducible
 * Los camiones están determinados por una lista de velocidades, el espacio que recorre, el tiempo inicial del viaje,
 * el tiempo final del viaje y una variable para saber si está en movimiento o no
 * 
 * @author Silvia Gonzalez / ViewNext
 * @version 1.0, 10/12/2024
 *
 */
public class Camion extends Vehiculo implements Conducible {
	private List<Double> tacometro;
	private double espacioRecorrido = 0; // Espacio recorrido en metros
	private LocalTime tiempoInicial;
	private LocalTime tiempoFinal;
	private boolean enMovimiento = false;
	
	public Camion() {
		super(18);
		this.tacometro = new ArrayList<>();
	}

	/**
	 * Método que inicia la conducción en el momento que se invoca
	 * Se limpian todas las velocidades guardadas en el tacómetro para empezar de cero
	 */
	@Override
	public void conducir() {
		if(!enMovimiento) {
			tiempoInicial = LocalTime.now();
			enMovimiento = true;
			tacometro.clear();
			System.out.println("El camión ha comenzado a moverse.");
		} else {
			System.out.println("El camión ya está en movimiento.");
		}
	}

	/**
	 * Método que hace avanzar al camión los metros indicados calculando la velocidad para guardarla 
	 * 
	 * @param metros indica los metros para avanzar
	 */
	@Override
	public void avanzar(int metros) {
		if(enMovimiento) {
			LocalTime tiempoActual = LocalTime.now();
			long tiempoTranscurrido = ChronoUnit.SECONDS.between(tiempoInicial, tiempoActual);
			if(tiempoTranscurrido > 0) {
				double velocidad = metros/tiempoTranscurrido;
				tacometro.add(velocidad);
				espacioRecorrido += metros;
				System.out.println("El camión avanzó " + metros + " metros. El espacio recorrido total es de " + espacioRecorrido + " metros.");
			}			
		} else {
			System.out.println("El camión no se está moviendo.");
		}
	}

	/**
	 * Método que hace retroceder al camión los metros indicados, calculando la velocidad para guardarla en el tacómetro
	 * 
	 * @param metros indica los metros para retroceder
	 */
	@Override
	public void retroceder(int metros) {
		if(enMovimiento) {
			LocalTime tiempoActual = LocalTime.now();
			long tiempoTranscurrido = ChronoUnit.SECONDS.between(tiempoInicial, tiempoActual);
			if(tiempoTranscurrido > 0) {
				double velocidad = metros/tiempoTranscurrido;
				tacometro.add(velocidad); 
				espacioRecorrido -= metros;
				System.out.println("El camión avanzó " + metros + " metros. El espacio recorrido total es de " + espacioRecorrido + " metros.");
			}			
		} else {
			System.out.println("El camión no se está moviendo.");
		}
	}

	/**
	 * Método para parar al camión, mostrando las velocidades máxima y mínima y calculando la velocidad media
	 */
	@Override
	public void parar() {
		if(enMovimiento) {
			tiempoFinal = LocalTime.now();
			enMovimiento = false;
			
			long tiempoTotal = ChronoUnit.SECONDS.between(tiempoInicial, tiempoFinal);			
			System.out.println("El camión ha parado. El viaje duró " + tiempoTotal + " segundos.");
			
			if(!tacometro.isEmpty()) {
				double velocidadMaxima = Collections.max(tacometro)*3.6;
				double velocidadMinima = Collections.min(tacometro)*3.6;
				
				double suma = 0;
				for(double velocidad: tacometro) {
					suma += velocidad;
				}
				
				double velocidadMedia = suma/tacometro.size();
				
				System.out.println("La velocidad máxima fue: " + velocidadMaxima + "km/h");
				System.out.println("La velocidad media fue: " + velocidadMedia + "km/h");
				System.out.println("La velocidad minima fue: " + velocidadMinima + "km/h");
			}
		} else {
			System.out.println("El camión ya está parado.");
		}
	}

}
