package pattern.exo2.observateur;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Classe qui teste les methodes d'un observateur
 * @author Adeline Mignot - Camille Blaser
 * @version 1.0
 * @since 05.12.2014
 */
public class TestObservateur {
	
	/**
	 * Methode creant un capteur, lui ajoute trois observteurs.
	 * Execute le lancement du capteur
	 * @param args
	 */
	public static void main(String[] args) {
		final Capteur capt = new Capteur();
		capt.ajouterObservateur(new Meteo());
		capt.ajouterObservateur(new Grapheur());
		capt.ajouterObservateur(new Statistique());
		
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
