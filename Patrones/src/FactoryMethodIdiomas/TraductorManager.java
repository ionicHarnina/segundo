package FactoryMethodIdiomas;

public class TraductorManager {
	public TranslatoraAbstracto getTraductor(CreadorAbstracto creador){
		return creador.crearTranslator();
	}
}
