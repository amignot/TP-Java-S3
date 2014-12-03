package thread.exo8.eventDispatch;

public class LongAction implements Runnable {

	public void run(){
		for(int i = 0; i<100 ; i++){
			try{
				System.out.println(".");
				Thread.sleep(200L);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}
}
