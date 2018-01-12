package FactoryMethodIdiomas;

public class Prueba {
public static void main(String[] args) {
	//necesito elegeir una implementacion concreta
	TranslatoraAbstracto translatoraAbstracto=new TraductorManager().getTraductor(new CreadorInglesConcreto());
	
	//y ahora uso de forma abstracta lo que me dan
	System.out.println(translatoraAbstracto.dimeCifra(5));
}
}
