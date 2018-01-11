package FactoryMethodDos;


public class CreadorConcretoIVA extends CreadorAbstracto {

	@Override
	public Factura creaFactura() {
		return new FacturaIva();
	}
	
}
