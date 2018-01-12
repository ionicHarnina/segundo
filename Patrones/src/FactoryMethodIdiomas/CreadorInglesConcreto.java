package FactoryMethodIdiomas;

public class CreadorInglesConcreto extends CreadorAbstracto {

	@Override
	public TranslatoraAbstracto crearTranslator() {
		return new TranslatorInglesConcreto();
	}

}
