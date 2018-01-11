public class UnoSingle {
	// Esta es la unica instancia de clase
	private static UnoSingle Instancia = new UnoSingle();
	public String nombre="Felix";

	// el constructor es privado
	private UnoSingle() {
	};

	// El acceso es por un get
	public static UnoSingle getInstance() {
		return Instancia;
	}
}
