package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {

	private static Reina reina;

	public static void main(String[] args) {
		int aux;

		Consola.mostrarMenu();
		do {
			aux = Consola.elegirOpcionMenu();
			ejecutarOpcion(aux);
		} while (aux != 4);

	}

	private static void ejecutarOpcion(int opcion) {
		switch (opcion) {
		case 1:
			crearReinaDefecto();
			mostrarReina();
			System.out.println("-------------------------------------");
			break;

		case 2:
			crearReinaColor();
			mostrarReina();
			System.out.println("-------------------------------------");
			break;

		case 3:
			mover();
			mostrarReina();
			System.out.println("-------------------------------------");
			break;

		case 4:
			Consola.despedirse();
			System.out.println("-------------------------------------");
			break;
		}
	}

	private static void crearReinaDefecto() {
		reina = new Reina();
	}

	private static void crearReinaColor() {
		reina = new Reina(Consola.elegirColor());
	}

	private static void mover() {
		try {
			Consola.mostrarMenuDirecciones();
			reina.mover(Consola.elegirDireccion(), Consola.elegirPasos());
		} catch (OperationNotSupportedException | IllegalArgumentException | NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void mostrarReina() {
		if (reina == null) {
			System.out.println("El objeto Reina es nulo, crea una reina.");
		}
		if (reina != null) {
			System.out.println(reina);
		}
	}
}
