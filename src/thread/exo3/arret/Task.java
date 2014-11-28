package thread.exo3.arret;

public class Task implements Runnable {

	private boolean stopped;

	public Task() {
		this.stopped=false;
	}
	
	public synchronized void setStopped(boolean b) {
		this.stopped=b;
	}
	
	public synchronized boolean isStopped() {
		return this.stopped;
	}
	
	@Override
	public void run() {
		while(this.stopped==false) {
			try {
				Thread.sleep(10000L);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println(".");
		}
		System.out.println("\n"+Thread.currentThread()+" est arrêté.");
		
	}

}
