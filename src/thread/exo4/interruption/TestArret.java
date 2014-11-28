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
