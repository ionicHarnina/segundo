import java.util.ArrayList;
import java.util.LinkedList;

public class LugarDeProcreacion extends Thread{
	public LinkedList<Imaginero> procreadores;
	private static LugarDeProcreacion instancia=new LugarDeProcreacion();
	private boolean procrear;
	public ArrayList<Imaginero> habitantes;

	public void setHabitantes(ArrayList<Imaginero> habitantes) {
		this.habitantes = habitantes;
	}

	private LugarDeProcreacion() {
		procreadores = new LinkedList<Imaginero>();
	}
	
	public void insertarProceador(Imaginero proceador){
		procreadores.addLast(proceador);
		comprobarProcreacion();
	}
	
	private void comprobarProcreacion() {
		if(procreadores.size()>1)
			procrear=true;
	}

	public static LugarDeProcreacion getInstance(){
		return instancia;
	}
	
	@Override
	public void run() {
		while(true){
			if(procrear&&habitantes.size()<Constantes.POBLACION_MAX){
				Imaginero nuevo=new Imaginero(Bautizo.bautizarHabitante());
				nuevo.start();
				System.out.println("nuevo miembro: "+nuevo.getName());
				habitantes.add(nuevo);
				procreadores.removeFirst();
				procreadores.removeFirst();
				if(procreadores.size()<2)
					procrear=false;
				System.out.println("poblacion: "+habitantes.size());
			}
		}
	}
}
