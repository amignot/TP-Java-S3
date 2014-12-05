package thread.exo2.demon;

public class Demon extends Thread {

	public Demon(String nom) {
		super(nom);
		setDaemon(true);
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(500L);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Not a deamon !");
		}

	}

}
