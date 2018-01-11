package V1;

import org.junit.runner.notification.StoppedByUserException;

public class Fuente extends Thread {

	private int intervalo = 2;
	private int alimento;
	private boolean seguir = true;
	private int total = 0;

	public int getVida() {
		return alimento;
	}

	public Fuente(int intervalo) {
		this.intervalo = intervalo;
	}

	/**
	 * Es posible que se produzca la llamada de otro proceso antes de que se
	 * haya actualizado el campo vida y entonces se producen dos llamadas en el
	 * mismo valor de vida
	 * 
	 * @return
	 */
	public int beber() {
		if (alimento > 0) {
			alimento--;
			return 1;
		} else
			return 0;
	}

	public int getIntervalo() {
		return intervalo;
	}

	public void setIntervalo(int intervalo) {
		this.intervalo = intervalo;
	}

	@Override
	public void run() {
		while (seguir) {
			try {
				sleep(intervalo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			alimento++;
			// si ponemos esta linea le da tiempo a cambiar el valor vida antes
			// de la
			// llamada de beber del otro proceso
			// total++;
			System.out.println("CREANDO UNA alimento");
			System.out.println("la fuente tiene " + alimento);
			// if(alimento>5)
			// seguir=false;
		}
		System.out.println("ya no doy  mas");
		System.out.println("Vidas usadas " + total);
	}

	public void stopping() {
		seguir = false;
	}

}
