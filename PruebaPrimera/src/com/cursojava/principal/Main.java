package com.cursojava.principal;

import com.cursojava.clases.Camion;
import com.cursojava.clases.Coche;

public class Main {

	public static void main(String[] args) {
		Coche miCoche = new Coche("Rojo", "1234AB");
		
		miCoche.conducir();
		esperar(2000);
		miCoche.avanzar(100);
		esperar(3000);
		miCoche.retroceder(20);
		esperar(1000);
		miCoche.parar();
		esperar(2000);
		miCoche.calcularVelocidad();
		esperar(2000);
		
		Camion camion = new Camion();
		
		camion.conducir();
		esperar(2000);
		camion.avanzar(50);
		esperar(1000);
		camion.retroceder(10);
		esperar(3000);
		camion.parar();
	}

	public static void esperar(int milis) {
		try {
			Thread.sleep(milis);
		}catch(Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
