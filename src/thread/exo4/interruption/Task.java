package thread.exo4.interruption;

public class Task implements Runnable {


	public Task() {
	}
	

	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(10000L);
				System.out.println(".");
			}
		} catch (InterruptedException ie) {
			System.out.println("\n" + Thread.currentThread() + " est interrompu.");
		}
	}

}
