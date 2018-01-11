package Sincronizado;

//no es un hilo
public class Contenedor {
	int valor = 0;
	// vamos a tener una bandera para señalizar la espera
	private boolean hayDato = false;
/*la clausula synchronized gestionar las llamadas a wait y notify
 * y para que nadie acceda concurretemente a este servicio*/
	public synchronized void put(int valor) {
		//Este metodo es llamado por el productor
		//si hayDato significa que el consumidor no lo ha consumido
		//y por lo tanto le hacemos esperar en este punto mediante un wait()
		while(hayDato)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.valor = valor;
		hayDato=true;
		notifyAll();
	}

	public synchronized int get() {
		while(!hayDato){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		hayDato=false;
		notifyAll();
		return this.valor;
	}
}
