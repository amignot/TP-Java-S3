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
	 * Methode creant un capteur, lui ajoute trois observateurs.
	 * Execute le lancement du capteur
	 * @param args
	 */
	public static void main(String[] args) {
		final Capteur capt = new Capteur();
		capt.ajouterObservateur(new Meteo());
		capt.ajouterObservateur(new Grapheur());
		capt.ajouterObservateur(new Statistique());
		capt.ajouterObservateur(capt);
		
		final ExecutorService executeur = Executors.newSingleThreadExecutor();
		
		executeur.submit(capt);
		
		try {
			Thread.sleep(10000L);
			/*executeur.shutdownNow();*/
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}

}
/*
* Pour démarrer le capteur , il faut faire un executorService que l'on démarre avec la méthode submit().
* 
* Pour vérifier l'assiciation dynamique, on ajoute les observateurs dans le main, alors on devrait avoir l'affichage de chaque observateur.
* Quand on supprime un observateur, son affichage n'apparaît plus.
* 
* Pour afficher 30 mesures météo, on fait réalisé l'interface Observateur par la classe Capteur.
* Le capteur sera alors un observateur sur lui-même, avec un compteur qui permettra l'arrêt après 30 mesures.
* On n'arretera alors le programme dans ce nouvel observateur. (C'est la solution qui a été codé ci-dessus).
*/