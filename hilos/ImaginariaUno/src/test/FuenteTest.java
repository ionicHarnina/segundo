package test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import V1.Fuente;

public class FuenteTest {

	@Ignore
	public void testGetVida(){
		Fuente instancia=new Fuente(10);
		instancia.start();
		try {
			Thread.sleep(1001);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		assertEquals(100, instancia.getVida(),5);
	}
	
	@Test
	public void testBeber() {
		Fuente instancia=new Fuente(10);
		instancia.start();
		int alimentacion=0;
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(11);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			alimentacion+=instancia.beber();			
			System.out.println("HOLA"+alimentacion);
		}
		assertEquals(10,alimentacion);
		instancia.stopping();
	}

}
