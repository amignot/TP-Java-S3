package pattern.exo2.observateur;

/**
 * Implementation de l'interface Observateur
 * @author Adeline Mignot - Camille Blaser
 * @version 1.0
 * @since 05.12.2014
 * @see pattern.exo2.observateur.Observateur
 */
public class Meteo implements Observateur {

	/**
	 * Permet d'echanger les donnees avec differents observateurs.
	 * @param d les donnees a echanger
	 * @see pattern.exo2.observateur.Observateur
	 */
	@Override
	public void modifierDonnees(Donnee d) {
		System.out.println(d+"\n");
	}
	
}
