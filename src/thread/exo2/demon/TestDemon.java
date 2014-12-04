package thread.exo2.demon;

public class TestDemon {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Demon demon = new Demon();
		demon.demon();
		try {
			Thread.sleep(2000L);
			System.out.println("Arrêt " + Thread.currentThread().getName());
			Thread.currentThread().stop();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
