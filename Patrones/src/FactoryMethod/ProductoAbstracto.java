package FactoryMethod;

public abstract class ProductoAbstracto {
	int cosa;

	public int getCosa() {
		return cosa;
	}

	public void setCosa(int cosa) {
		this.cosa = cosa;
	}
	public abstract void operacion();
}
