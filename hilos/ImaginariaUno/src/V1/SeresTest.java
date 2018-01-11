package V1;

import static org.junit.Assert.*;

import org.junit.Test;

import utiles.Util;

public class SeresTest {

	@Test
	public void test() {
		Fuente instancia=new Fuente(10);
		instancia.start();
		Util.pausita(100);
		int vida = 12;
		Seres uno=new Seres(instancia, "Tiburcio", vida);
		uno.start();
		Util.pausita(223);
		assertEquals(vida, uno.getTamano());
	}

}
