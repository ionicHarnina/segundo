package producto;

import java.time.LocalDate;
import java.util.Date;

public abstract class Cuenta {
	private String numCuenta;
	private LocalDate fechaCreacion=LocalDate.now();
	private double saldo=0;
	
	public Cuenta(String numCuenta) {
		super();
		this.numCuenta = numCuenta;
	}

	public abstract String getInfo();
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	
	
}
