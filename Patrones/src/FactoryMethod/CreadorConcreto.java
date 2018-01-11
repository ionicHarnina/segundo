package FactoryMethod;

public class CreadorConcreto implements CreadorAbstracto {

	@Override
	public ProductoAbstracto factoria(int ve) {
		if(ve==1)
			return new ProductoConcreto();
		if(ve==2)
			return new ProductoConcretoDos();
		return null;
	}

}
