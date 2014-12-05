package thread.exo4.interruption;

public class TestArret {

	public static void main(String[] args) throws InterruptedException {
		
		final Task task = new Task();
		Thread thread = new Thread(task);
		thread.start();
		try {
			Thread.sleep(2000);
			thread.interrupt();
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}		
	}

}

/*
 * Si les points s'affichent toutes les 10 000ms alors, il n'y aura qu'1 ou 0 point d'affichés. 
 */
