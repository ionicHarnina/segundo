package factoria;

import producto.Cuenta;
import producto.Tarjeta;
import producto.Tipo;

public abstract class FactoriaAbstracta {

	// un singleton
	protected FactoriaAbstracta() {
		
	}
	
	public static FactoriaAbstracta getFactoria(Tipo tipo){
		if(tipo==Tipo.joven)
			return new FactoriaJoven();
		return null;
		
	}
	public abstract Cuenta dameCuenta(String numeroCuenta);
	public abstract Tarjeta dameTarjeta(String numeroTarjeta,float saldo);
	
}
