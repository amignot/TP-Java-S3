package thread.exo3.arret;

public class TestArret {

	public static void main(String[] args) throws InterruptedException {
		
		final Task task = new Task();
		new Thread(task).start();
		try {
			Thread.sleep(2000);
			task.setStopped(true);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("\n"+Thread.currentThread()+" est arrêté.");
		
	}

}
