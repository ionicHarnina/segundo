package Imaginaria;
import java.util.ArrayList;

public class Mundo {
	public static void main(String[] args) {
		Fuente.getInstance().start();
		ColaSagrada.getInstance().start();
		ArrayList<Seres> habitantes=new ArrayList<Seres>();
		for (int i = 0; i < 5; i++) {
			habitantes.add(new Seres(Bautizo.bautizarHabitante()));
			habitantes.get(i).start();
		}
	}
}
