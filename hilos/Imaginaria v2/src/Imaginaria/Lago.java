package Imaginaria;

public class Lago {
	private int vida = 0;

	public int getVida() {
		return vida;
	}

	// Creamos el singleton
	private static Lago instancia = new Lago();
	private Lago() {
	}

	public static Lago getInstance() {
		return instancia;
	}

	public synchronized void incrementarVida() {
		vida++;		
//		System.out.println("vida puesta "+vida);
		notify();
	}

	public synchronized void beber(){
		while(vida==0)
			try {
				System.out.println("esperando");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		notify();
		System.out.println("bebiendo");
		vida--;
	}
	public boolean isVacio() {
		if (vida == 0)
			return true;
		else
			return false;
	}
}
