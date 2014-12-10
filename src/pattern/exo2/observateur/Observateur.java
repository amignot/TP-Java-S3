package pattern.exo2.observateur;

/**
 * Interface simulant le fonctionnement d'un observateur
 * @author Adeline Mignot - Camille Blaser
 * @version 1.0
 * @since 05.12.2014
 */
public interface Observateur {
	/**
	 * Permet d'echanger les donnees avec differents observateurs.
	 * @param d les donnees a echanger
	 */
	public void modifierDonnees(Donnee d);
}
