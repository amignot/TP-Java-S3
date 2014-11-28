package thread.exo1.heritage;

public class WhoIsThread extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			try {
				Thread.sleep(500L);
				System.out.println(this);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public String toString() {
		return this.getName();
	}

}
