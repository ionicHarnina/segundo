
public class Principal {

	public static void main(String[] args) {
		UnoSingle uno=UnoSingle.getInstance();
		System.out.println(uno.nombre);
		UnoSingle dos=UnoSingle.getInstance();
		System.out.println(dos.nombre);
	}

}
