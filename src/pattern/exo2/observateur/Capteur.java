package pattern.exo2.observateur;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
/**
 * Implémentation de des interfaces Sujet et Runnable
 * @author Adeline Mignot - Camille Blaser
 * @version 1.0
 * @since 05.12.2014
 */
public class Capteur implements Sujet, Runnable {

	private final List<Observateur> observateurs;
	private  Donnee donnee;

	/**
	 * Constructeur initialisant la liste des observateurs
	 */
	public Capteur() {
		this.observateurs = new ArrayList<Observateur>();
	}

	/**
	 * Methode pour envoyer des donnees a un observateur a intervalles reguliers.
	 */
	@Override
	public void run() {
		try {
			while (!Thread.currentThread().isInterrupted()) {
				Thread.sleep(500L);
				donnee = new Donnee(ThreadLocalRandom.current().nextDouble(-30,
						40), ThreadLocalRandom.current().nextDouble(0, 100),
						ThreadLocalRandom.current().nextDouble(800, 1200));
				this.notifierObservateur();
			}
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

	}

	
	/**
	 * Permet d'ajouter un observateur sur le capteur.
	 * Souleve une exception si l'observateur a ajouter est nul.
	 * @param o l'observateur a ajouter
	 * @see pattern.exo2.Sujet
	 */
	@Override
	public void ajouterObservateur(Observateur o) {
		if (o == null) {
			throw new IllegalStateException("Observateur nul");
		}
		observateurs.add(o);
	}

	
	/**
	 * Permet de retirer un observateur du le capteur.
	 * Souleve une exception s'il n'y a pas d'observateur sur le capteur.
	 * @param o l'observateur a enlever
	 * @see pattern.exo2.Sujet
	 */
	@Override
	public void retirerObservateur(Observateur o) {
		if (observateurs.isEmpty()) {
			throw new IllegalStateException("Pas d'observateurs");
		}
		observateurs.remove(o);

	}

	
	/**
	 * Permet d'envoyer les donnees captees a tous les observateurs du capteur.
	 * @see pattern.exo2.Sujet
	 */
	@Override
	public void notifierObservateur() {
		for (Observateur o : this.observateurs) {
			o.modifierDonnees(this.donnee);
		}
	}

}
