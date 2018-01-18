package acop02marca;

public class Pedido {
	public String idCliente,fecha;
	public DatosFiscales datosFiscales;

	//necesita todos los datos de la estrucuta DAtosFiscales o se lo pasamos por
	//acompañamiento
	public Pedido(String idCliente, String fecha, DatosFiscales datosFiscales) {
		super();
		this.idCliente = idCliente;
		this.fecha = fecha;
		this.datosFiscales=datosFiscales;
	}
	 

}
