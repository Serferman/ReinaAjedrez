package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {

	private Color color;
	private Posicion posicion;

	public Color getColor() {
		return color;
	}

	private void setColor(Color color) {
		if (color == null) {
			throw new NullPointerException("ERROR: El color no puede ser nulo.");
		}

		if (Color.BLANCO == color) {

			this.color = Color.BLANCO;
			this.posicion = new Posicion(1, 'd');

		} else if (Color.NEGRO == color) {

			this.color = Color.NEGRO;
			this.posicion = new Posicion(8, 'd');
		}
	}
	
	public Posicion getPosicion() {
		return posicion;
	}

	private void setPosicion(Posicion posicion) {
		if (posicion == null) {
			throw new NullPointerException("ERROR: La posicion no puede ser nula.");
		}
		this.posicion = posicion;
	}
	
}
