package producto;


public class TarjetaJoven extends Tarjeta {
	private String tiendaASociada;

	public TarjetaJoven(String numero, float saldo) {
		super(numero, saldo);
		this.tiendaASociada = tiendaASociada;
	}

	public String getTiendaASociada() {
		return tiendaASociada;
	}

	public void setTiendaASociada(String tiendaASociada) {
		this.tiendaASociada = tiendaASociada;
	}

	@Override
	public String getInfo() {
		return "Soy una tarjeta joven";
	}
	
}
