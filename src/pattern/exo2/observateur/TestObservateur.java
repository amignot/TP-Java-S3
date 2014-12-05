package pattern.exo2.observateur;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestObservateur {
	
	public static void main(String[] args) {
		final Capteur capt = new Capteur();
		capt.ajouterObservateur(new Meteo());
		capt.ajouterObservateur(new Grapheur());
		
		final ExecutorService executeur = Executors.newSingleThreadExecutor();
		
		executeur.submit(capt);
		
		try {
			Thread.sleep(10000L);
			executeur.shutdownNow();
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}

}
