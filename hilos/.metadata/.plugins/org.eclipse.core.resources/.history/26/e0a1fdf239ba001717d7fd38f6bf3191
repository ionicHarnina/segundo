
public class LagoSagrado {
	private int almacenado=0;
	
	public synchronized void retirarAlimento(){
		while(almacenado==0){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
		almacenado--;
		notifyAll();
		}
	public synchronized void insuflarAlimento(){
		almacenado++;
//		if (almacenado>1)System.out.println("alimento almacenado "+almacenado);
		notifyAll();
	}
}
