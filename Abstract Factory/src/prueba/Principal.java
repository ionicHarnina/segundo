package prueba;

import producto.Cuenta;
import producto.Tarjeta;
import producto.Tipo;
import factoria.FactoriaAbstracta;

public class Principal {
	public static void main(String[] args) {
		FactoriaAbstracta miFAbstracta=FactoriaAbstracta.getFactoria(Tipo.joven);
		Cuenta miCuenta=miFAbstracta.dameCuenta("111111");
		Tarjeta miTarjeta=miFAbstracta.dameTarjeta("111111", 1000);
		System.out.println(miCuenta.getInfo());
		System.out.println(miTarjeta.getInfo());
	}

	
}
