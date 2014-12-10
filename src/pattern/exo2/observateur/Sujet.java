package pattern.exo2.observateur;

/**
 * Interface simulant le fonctionnement d'un sujet soumis a des observateurs
 * @author Adeline Mignot - Camille Blaser
 * @version 1.0
 * @since 05.12.2014
 */
public interface Sujet {
	
	/**
	 * Permet d'ajouter un observateur sur le sujet
	 * @param o l'observateur a ajouter
	 */
	public void ajouterObservateur(Observateur o);
	
	/**
	 * Permet de retirer un observateur sur le sujet
	 * @param o l'observateur a enlever
	 */
	public void retirerObservateur(Observateur o);
	
	/**
	 * Permet de notifier les observateurs du sujet
	 */
	public void notifierObservateur();
}
