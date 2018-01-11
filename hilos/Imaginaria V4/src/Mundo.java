import java.util.ArrayList;
import java.util.LinkedList;

public class Mundo {
	public static void main(String[] args) {
		ArrayList<Imaginero> habitantes = new ArrayList<>();
		LugarDeProcreacion lugar=LugarDeProcreacion.getInstance();
		lugar.start();
		lugar.setHabitantes(habitantes);
		habitantes.add(new Imaginero("uno"));
		habitantes.get(0).start();
		habitantes.add(new Imaginero("dos"));
		habitantes.get(1).start();
		
	}
}
