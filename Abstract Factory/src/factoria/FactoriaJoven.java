package factoria;

import producto.Cuenta;
import producto.CuentaJoven;
import producto.Tarjeta;
import producto.TarjetaJoven;

public class FactoriaJoven extends FactoriaAbstracta {
	
	protected FactoriaJoven() {

	}

	@Override
	public Cuenta dameCuenta(String numeroCuenta) {
		return new CuentaJoven(numeroCuenta);
	}

	@Override
	public Tarjeta dameTarjeta(String numeroTarjeta, float saldo) {
		return new TarjetaJoven(numeroTarjeta, saldo);
	}

}
