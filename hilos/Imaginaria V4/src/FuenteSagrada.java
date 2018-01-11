
public class FuenteSagrada extends Thread{
	private int intervalo=Constantes.INTERVALO;
	private int flujo=1;
	private LagoSagrado lago;
	
	public FuenteSagrada(LagoSagrado lago) {
		this.lago=lago;
	}
	
	@Override
	public void run() {
		super.run();
		while(true){
			lago.insuflarAlimento();
			try {
				this.sleep(intervalo);
//				System.out.println("flujo fuente");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
}
