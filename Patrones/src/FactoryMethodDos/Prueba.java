package FactoryMethodDos;

public class Prueba {
 public static void main(String[] args) {
	Factura fact=new FacturaManager().getFactura(new CreadorConcretoIVA());
	fact.setImporte(20);
	System.out.println(fact.getImporteIva());
	Factura factDos=new FacturaManager().getFactura(new creadorConcretoReducido());
	factDos.setImporte(20);
	System.out.println(factDos.getImporteIva());
}
}
