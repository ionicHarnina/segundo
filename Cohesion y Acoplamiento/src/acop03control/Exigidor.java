package acop03control;

public class Exigidor {
public static void main(String[] args) {
	Solucion solucionA=new Permitidor().creaSolucion(Tipo.solucionA);
	if(solucionA instanceof SolucionA){
		System.out.println(((SolucionA)solucionA).solA);
	}
}
}