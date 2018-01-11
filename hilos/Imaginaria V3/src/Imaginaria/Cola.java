package Imaginaria;

import java.util.LinkedList;

public class Cola {
	// VAmos a usar la clase linkedlist para hacer una cola
		// Pero como esta clase vale para muchas otras estructuras
		// creamos una clase intermedia que simplifique el API
		// de LinkedList para que funcione como una cola
	LinkedList<Seres> paraCola;
	
	public Cola() {
		paraCola = new LinkedList<Seres>();
	}
	
	public void ingresarCola(Seres ser) {
		paraCola.addLast(ser);
	}
	
	public Seres consumirTurno() {
		if(paraCola.size()>0)
			try {
				return paraCola.removeFirst();
			} catch (Exception e) {
				return null;
			}
		else
			return null;

	}
	public boolean isVacia() {
		return paraCola.isEmpty();
	}
}
