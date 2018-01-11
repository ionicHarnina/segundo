public class CuatroSingle {
	// Creamos la propiedad que es la propia clase
	private static CuatroSingle INSTANCIA = null;

	// En este caso es null porque aún no la hemos creado es de creacion
	// diferida
	// Solo se crea cuando algo lo necesita
	private CuatroSingle() {
	}
	
	public static CuatroSingle getInstancia(){
		if(INSTANCIA==null){
			synchronized (CuatroSingle.class) {
				if(INSTANCIA==null) INSTANCIA=new CuatroSingle();
				
			}
		}
		return INSTANCIA;
	}
}
