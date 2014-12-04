package thread.exo9.executor;

import java.util.Date;

public class Task implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			try {
				String nomThread = Thread.currentThread().getName();
				System.out.println(nomThread);
				Date maDate = new Date(); 
				System.out.println(maDate.toString()); 
				Thread.sleep(1000L);
			} catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
	/*
	 * La classe n'utilise aucune synchronisation,
	 * elle n'est pas thread-safe.
	 */
}