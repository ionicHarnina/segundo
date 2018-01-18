package producto;

public class CuentaJoven extends Cuenta {
	private int tipo = 0;
	private boolean estudiante;

	public CuentaJoven(String numCuenta) {
		super(numCuenta);
	}

	public boolean isEstudiante() {
		return estudiante;
	}

	public void setEstudiante(boolean estudiante) {
		this.estudiante = estudiante;
	}

	public int getTipo() {
		return tipo;
	}

	@Override
	public String getInfo() {
		
		return "Soy una cuenta joven";
	}

	
}
