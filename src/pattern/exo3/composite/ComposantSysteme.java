package pattern.exo3.composite;
/**
 * Interface ComposantSysteme qui permet de déffinir les méthodes à implémenter pour un composantSysteme
 * @author Adeline Mignot - Camille Blaser
 * @version 1.0
 * @since 05.12.2014
 */
import pattern.exo3.visiteur.*;

public abstract class ComposantSysteme {
	
	/**
	 * Cette méthode permet de récupérer le nom d'un ComposantSysteme
	 * @return String : le nom du ComposantSysteme
	 */
	public String getNom() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Cette méthode permet de récupérer la taille d'un ComposantSysteme
	 * @return int : c'est la taille du ComposantSysteme
	 */
	public int getTaille() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Cette méthode permet d'ajouter un ComposantSysteme
	 * @param composant : c'est le composant que l'on souhaite ajouter 
	 */
	public void addComposantSysteme(ComposantSysteme composant) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Cette méthode permet d'enlever un ComposantSysteme
	 * @param composant : c'est le ComposantSysteme à enlever
	 */
	public void removeComposantSysteme(ComposantSysteme composant) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Cette méthode permet de récupérer le ComposantSystéme à une place donnée
	 * @param index : c'est l'index du ComposantSystéme que l'on veut récupérer
	 * @return ComposantSysteme : le ComposantSystéme d'index index
	 */
	public ComposantSysteme getComposantSysteme(int index) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Cette méthode permet d'accepter un visiteur 
	 * @param visiteur : le visiteur utilisé
	 */
	public void acceptVisiteur(Visiteur visiteur) {
		throw new UnsupportedOperationException();
	}
}
