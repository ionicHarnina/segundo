package FactoryMethod;

public class Prueba {
public static void main(String[] args) {
	CreadorAbstracto creador;
	creador=new CreadorConcreto();
	ProductoAbstracto producto=creador.factoria(1);
	producto.operacion();
	ProductoAbstracto productoDos=creador.factoria(2);
	productoDos.operacion();
}
}
