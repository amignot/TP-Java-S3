package thread.exo2.demon;

public class Demon extends Thread {
	
	public void demon() {
		for(int i=0; i<20; i++) {
			try {
				String nomThread = Thread.currentThread().getName();
				System.out.println(nomThread);
				Thread.sleep(500L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
