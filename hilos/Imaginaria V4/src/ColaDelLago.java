import java.util.LinkedList;

/**
 * Vamos a aplicar Singleton
 * 
 * @author jose
 *
 */
public class ColaDelLago extends Thread {
	private LinkedList<Imaginero> cola = new LinkedList<>();
	private LagoSagrado lago = new LagoSagrado();
	FuenteSagrada fuente = new FuenteSagrada(lago);
	private static ColaDelLago instancia = new ColaDelLago();

	private ColaDelLago() {
		fuente.start();
		start();
	}

	public void consumirTurno() {
		lago.retirarAlimento();
		if (!cola.isEmpty())
			cola.removeFirst();
	}

	public void volverALaCola(Imaginero ser) {
		cola.addLast(ser);
	}

	public static ColaDelLago getInstance() {
		return instancia;
	}

	@Override
	public void run() {
		consumirTurno();
	}
}
