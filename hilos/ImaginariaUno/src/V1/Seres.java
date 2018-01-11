package V1;

public class Seres extends Thread {

	int vida;
	int tamano = 0;
	Fuente fuente;
	String nombre;

	public Seres(Fuente fuente, String nombre,int vida) {
		this.fuente = fuente;
		this.nombre = nombre;
		this.vida=vida;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	@Override
	public String toString() {
		return nombre + " tiene de vida " + vida + " y de tamano " + tamano;
	}

	@Override
	public void run() {
		System.out.println("Llego aqui");
		System.out.println(toString());
		while (tamano < vida) {
			beber();
		}
		System.out.println("he tenido una vida placentera");
	}

	private void beber() {
		int alimento=fuente.beber();
		if (alimento> 0) {
			tamano+=alimento;
			System.out.println("bebiendo");
			System.out.println(toString());			
		}
	}
}
