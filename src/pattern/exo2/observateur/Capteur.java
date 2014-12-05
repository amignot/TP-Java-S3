package pattern.exo2.observateur;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Capteur implements Sujet, Runnable {

	private final List<Observateur> observateurs;
	private  Donnee donnee;

	public Capteur() {
		this.observateurs = new ArrayList<Observateur>();
	}

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

	@Override
	public void ajouterObservateur(Observateur o) {
		if (o == null) {
			throw new IllegalStateException("Observateur nul");
		}
		observateurs.add(o);
	}

	@Override
	public void retirerObservateur(Observateur o) {
		if (observateurs.isEmpty()) {
			throw new IllegalStateException("Pas d'observateurs");
		}
		observateurs.remove(o);

	}

	@Override
	public void notifierObservateur() {
		for (Observateur o : this.observateurs) {
			o.modifierDonnees(this.donnee);
		}
	}

}
