package Imaginaria;

public class Seres extends Thread {
	// Propiedades
	private int esperanzaDeVida;
	private int tamano = 0;
	//si puede o no pedir turno en la cola
	private boolean turno = true;

	private ColaSagrada miFila;

	// Constructores
	public Seres(String nombre) {
		super(nombre);
		esperanzaDeVida = (int) ((Math.random() * Constantes.VIDA_MAX) + 15);
		miFila = ColaSagrada.getInstance();
	}

	// Metodos

	public void beber() {
		tamano++;
		turno = true;
	}

	@Override
	public void run() {
		while (tamano < esperanzaDeVida) {
			if (turno) {
				miFila.solicitarPuesto(this);
				turno = false;
			}
			try {
				sleep(Constantes.PAUSA_ENTRE_COMIDAS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("El ser " + getName() + " muerto a los " + tamano);
	}

	public boolean isTurno() {
		return turno;
	}

	public void setTurno(boolean turno) {
		this.turno = turno;
	}

	// Getters&Setters
	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

}
