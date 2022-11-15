package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Posicion {

	private int fila;
	private char columna;

	public Posicion(int fila, char columna) {
		setFila(fila);
		setColumna(columna);
	}
	
	public int getFila() {
		return fila;
	}

	private void setFila(int fila) {
		if ((8 < fila) || (fila < 1)) {
			throw new IllegalArgumentException("ERROR: Fila no válida.");
		}
		this.fila = fila;
	}

	public char getColumna() {
		return columna;
	}

	private void setColumna(char columna) {
		if (('a' > columna) || (columna > 'h')) {
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		}
		this.columna = columna;
	}

	
}
