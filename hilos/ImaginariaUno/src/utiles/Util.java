package utiles;

public class Util {

	public static void pausita(int intervalo){
		try {
			Thread.sleep(intervalo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
