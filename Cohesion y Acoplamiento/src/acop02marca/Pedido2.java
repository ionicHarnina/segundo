package acop02marca;

public class Pedido2 {
	public String fecha;
	//estaria mal si, como en el otro pedido, solo usamos el idCliente
	//pero le pasamos el cliente completo
	public Cliente2 cliente;

	public Pedido2(Cliente2 cliente, String fecha) {
		super();
		this.fecha = fecha;
		this.cliente=cliente;
	}
	 

}
