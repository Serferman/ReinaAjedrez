package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Reina {

	private Color color;
	private Posicion posicion;

	public Reina() {
		setColor(Color.BLANCO);
		setPosicion(new Posicion(1, 'd'));
	}

	public Reina(Color color) {
		setColor(color);
	}

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

	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {

		if (direccion == null) {
			throw new NullPointerException("ERROR: La dirección no puede ser nula.");
		}

		if ((pasos < 1) || (pasos > 7)) {
			throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
		}

		try {
			switch (direccion) {
			case NORTE:
				setPosicion(new Posicion((posicion.getFila() + pasos), posicion.getColumna()));
				break;

			case ESTE:
				setPosicion(new Posicion(posicion.getFila(), (char) (posicion.getColumna() + pasos)));
				break;

			case SUR:
				setPosicion(new Posicion((posicion.getFila() - pasos), posicion.getColumna()));
				break;

			case OESTE:
				setPosicion(new Posicion(posicion.getFila(), (char) (posicion.getColumna() - pasos)));
				break;

			case NORESTE:
				setPosicion(new Posicion((posicion.getFila() + pasos), (char) (posicion.getColumna() + pasos)));
				break;

			case SURESTE:
				setPosicion(new Posicion((posicion.getFila() - pasos), (char) (posicion.getColumna() + pasos)));
				break;

			case SUROESTE:
				setPosicion(new Posicion((posicion.getFila() - pasos), (char) (posicion.getColumna() - pasos)));
				break;

			case NOROESTE:
				setPosicion(new Posicion((posicion.getFila() + pasos), (char) (posicion.getColumna() - pasos)));
				break;

			}
		} catch (IllegalArgumentException e) {
			throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
		}

	}

	@Override
	public String toString() {
		return String.format("color=%s, posicion=(%s)", color, posicion);
	}

}
