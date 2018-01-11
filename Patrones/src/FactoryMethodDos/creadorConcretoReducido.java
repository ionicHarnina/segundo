package FactoryMethodDos;

public class creadorConcretoReducido extends CreadorAbstracto {

	@Override
	public Factura creaFactura() {
		return new FacturaIvaReducido();
	}

}
