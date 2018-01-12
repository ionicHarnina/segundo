package FactoryMethodIdiomas;

public class TranslatorInglesConcreto extends TranslatoraAbstracto {

	private String[] cartel={"Zero","One","Two","Three","Four","Five"};
	@Override
	public String dimeCifra(int numero) {
		return this.cartel[numero];
	}

}
