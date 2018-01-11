package Imaginaria;

public class ColaSagrada extends Thread {
	private Cola fila = new Cola();
	private Lago lagoSagrado = Lago.getInstance();
	private boolean vaciada = false;
	// Singleton
	private static ColaSagrada instancia = new ColaSagrada();

	private ColaSagrada() {
	}

	public static ColaSagrada getInstance() {
		return instancia;
	}

	public void solicitarPuesto(Seres ser) {
		fila.ingresarCola(ser);
	}

	@Override
	public void run() {
		super.run();
		// while(true&&!vaciada){
		while (true) {
			// ahora es la cola la que gestiona si se bebe del lago
			// lago es sincro y por lo tanto para el hilo de la cola
			// si no se puede beber
			lagoSagrado.beber();
			// cuando se bebe obtengo el elemento de cola que ha bebido
			Seres ser = fila.consumirTurno();
			if (ser != null) {
				// le digo al ser que ha bebido
				ser.beber();
				System.out.println("se esta alimentando " + ser.getName());
			}
			// vaciada=fila.isVacia();
			// System.out.println(vaciada);
			if (fila.isVacia())
				System.out.println(lagoSagrado.getVida());
		}
	}
}
