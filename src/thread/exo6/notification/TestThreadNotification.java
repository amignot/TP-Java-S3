package thread.exo6.notification;

public class TestThreadNotification {

	public static void main(String[] args) throws InterruptedException {
		
		Compteur compteur = new Compteur();
		ThreadNotifA pair = new ThreadNotifA(compteur, "pair");
		ThreadNotifB impair = new ThreadNotifB(compteur, "impair");
		
		pair.start();
		impair.start();

	}

}
