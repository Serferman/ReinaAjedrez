package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
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
			System.out.println("1.- Blanco");
			System.out.println("2.- Negro");
			opcion = Entrada.entero();
		} while ((opcion < 1) || (opcion > 2));

		if (opcion == 1) {
			color = Color.BLANCO;
		} else if (opcion == 2) {
			color = Color.NEGRO;
		}

		return color;
	}

	public static void mostrarMenuDirecciones() {
		System.out.println("------------");
		System.out.println("1.- NORTE");
		System.out.println("2.- SUR");
		System.out.println("3.- ESTE");
		System.out.println("4.- OESTE");
		System.out.println("5.- NORESTE");
		System.out.println("6.- NOROESTE");
		System.out.println("7.- SURESTE");
		System.out.println("8.- SUROESTE");
		System.out.println("------------");
	}

	public static Direccion elegirDireccion() {
		Direccion direccion = null;
		int opcion;

		do {
			System.out.println("Elige una dirección: ");
			opcion = Entrada.entero();
		} while ((opcion < 1) || (8 < opcion));

		switch (opcion) {
		case 1:
			direccion = Direccion.NORTE;
			break;

		case 2:
			direccion = Direccion.SUR;
			break;

		case 3:
			direccion = Direccion.ESTE;
			break;

		case 4:
			direccion = Direccion.OESTE;
			break;

		case 5:
			direccion = Direccion.NORESTE;
			break;

		case 6:
			direccion = Direccion.NOROESTE;
			break;

		case 7:
			direccion = Direccion.SURESTE;
			break;

		case 8:
			direccion = Direccion.SUROESTE;
			break;

		}
		return direccion;
	}

	public static int elegirPasos() {
		int opcion;
		
		System.out.println("¿Cuantos pasos quieres dar?");
		opcion = Entrada.entero();
		
		return opcion;
	}
	
	public static void despedirse() {
		System.out.println("Hasta la próxima chavales");
	}
	
}
