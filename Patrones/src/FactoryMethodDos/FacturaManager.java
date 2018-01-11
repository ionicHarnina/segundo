package FactoryMethodDos;

public class FacturaManager {
	public Factura getFactura(CreadorAbstracto creador){
		return creador.creaFactura();
	}
}
