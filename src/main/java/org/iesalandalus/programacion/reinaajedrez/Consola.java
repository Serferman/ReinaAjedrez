package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

	private Consola() {

	}
	
	public static void mostrarMenu() {
		System.out.println("--------------------------------");
		System.out.println("1.- Crear reina por defecto.");
		System.out.println("2.- Crear reina eligiendo color.");
		System.out.println("3.- Mover reina.");
		System.out.println("");
		System.out.println("4.- Salir.");
		System.out.println("--------------------------------");
	}
	
	public static int elegirOpcionMenu() {
		int opcion;
		do {
			System.out.println("Introduceme una opción de este menú: ");
			opcion = Entrada.entero();
		} while ((opcion < 1) || (opcion > 4));
		return opcion;
	}
	
	public static Color elegirColor() {
		Color color = null;
		int opcion;
		do {
			System.out.println("Escoje un color: ");
			System.out.println("1.- blanco");
			System.out.println("2.- negro");
			opcion = Entrada.entero();
		} while ((opcion < 1) || (opcion > 2));

		if (opcion == 1) {
			color = Color.BLANCO;
		} else if (opcion == 2) {
			color = Color.NEGRO;
		}

		return color;
	}

	
}
