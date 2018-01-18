package producto;

public abstract class Tarjeta {
	private String numero;
	private float saldo;
	
	public Tarjeta(String numero, float saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}

	public abstract String getInfo();
	
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}
	
}
