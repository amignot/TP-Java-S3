package thread.exo2.demon;

public class TestDemon {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		Demon demon = new Demon("deamon");
		demon.start();
		try {
			Thread.sleep(2000L);
			System.out.println("Arrêt " + Thread.currentThread().getName());
			Thread.currentThread().stop();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}

/* 
 * Si on lance l'application après avoir mis le bloc finally le main s'arrête avant la fin du run, 
 * mais le run, lui finit son instruction.
 * 
 * Après avoir passé le thread en demon; le thread demon et le main s'arrêtent en même temps.
 */
