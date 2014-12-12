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
* Pour d�marrer le capteur , il faut faire un executorService que l'on d�marre avec la m�thode submit().
* 
* Pour v�rifier l'assiciation dynamique, on ajoute les observateurs dans le main, alors on devrait avoir l'affichage de chaque observateur.
* Quand on supprime un observateur, son affichage n'appara�t plus.
* 
* Pour afficher 30 mesures m�t�o, on fait r�alis� l'interface Observateur par la classe Capteur.
* Le capteur sera alors un observateur sur lui-m�me, avec un compteur qui permettra l'arr�t apr�s 30 mesures.
* On n'arretera alors le programme dans ce nouvel observateur. (C'est la solution qui a �t� cod� ci-dessus).
*/