public class Imaginero extends Thread {
	private int vida;
	private Integer tamano = 0;
	private ColaDelLago lago = ColaDelLago.getInstance();
	private LugarDeProcreacion lugar = LugarDeProcreacion.getInstance();

	private boolean fertil = false;
	private int periodoInfertil = Constantes.PERIODO_INFERTIL;
	private int pausaEntreComidas = Constantes.PAUSA_ENTRE_COMIDAS;

	public Imaginero(String nombre) {
		super(nombre);
		vida = (int) (Math.random() * 100)+20;		
		lago.volverALaCola(this);

	}

	@Override
	public void run() {
		while (tamano < vida) {
//			System.out.println("tamaño: " + getName() + " " + tamano);
			comer();
			if (!fertil) {
				if (tamano > Constantes.EDAD_FERTIL) {
					// Aqui otra cosa
					fertil = !fertil;
					lugar.insertarProceador(this);
				}
			}
			try {
				sleep(pausaEntreComidas);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			lago.volverALaCola(this);
		}
		System.out.println("ser " + getName() + " muerto a los " + tamano);
		lugar.habitantes.remove(this);
	}

	public void comer() {
//		lago.consumirTurno();
		tamano++;
		if (fertil) {
			periodoInfertil--;
			if (periodoInfertil == 0)
				setPostProceacion();
		}
	}

	public void setPostProceacion() {
		fertil = false;
		periodoInfertil = Constantes.PERIODO_INFERTIL;
	}
}
