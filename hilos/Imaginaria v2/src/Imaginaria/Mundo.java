package Imaginaria;

public class Mundo {
public static void main(String[] args) {
	
	Fuente fuente=Fuente.getInstance();
	fuente.start();
	Seres humano=new Seres("Felix",2);
	humano.start();
	Seres humanoe=new Seres("Manolito",4);
	humanoe.start();
}
}
