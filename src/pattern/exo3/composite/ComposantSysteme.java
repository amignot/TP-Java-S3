package pattern.exo3.composite;
/**
 * Interface ComposantSysteme qui permet de d�ffinir les m�thodes � impl�menter pour un composantSysteme
 * @author Adeline Mignot - Camille Blaser
 * @version 1.0
 * @since 05.12.2014
 */
import pattern.exo3.visiteur.*;

public abstract class ComposantSysteme {
	
	/**
	 * Cette m�thode permet de r�cup�rer le nom d'un ComposantSysteme
	 * @return String : le nom du ComposantSysteme
	 */
	public String getNom() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Cette m�thode permet de r�cup�rer la taille d'un ComposantSysteme
	 * @return int : c'est la taille du ComposantSysteme
	 */
	public int getTaille() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Cette m�thode permet d'ajouter un ComposantSysteme
	 * @param composant : c'est le composant que l'on souhaite ajouter 
	 */
	public void addComposantSysteme(ComposantSysteme composant) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Cette m�thode permet d'enlever un ComposantSysteme
	 * @param composant : c'est le ComposantSysteme � enlever
	 */
	public void removeComposantSysteme(ComposantSysteme composant) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Cette m�thode permet de r�cup�rer le ComposantSyst�me � une place donn�e
	 * @param index : c'est l'index du ComposantSyst�me que l'on veut r�cup�rer
	 * @return ComposantSysteme : le ComposantSyst�me d'index index
	 */
	public ComposantSysteme getComposantSysteme(int index) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Cette m�thode permet d'accepter un visiteur 
	 * @param visiteur : le visiteur utilis�
	 */
	public void acceptVisiteur(Visiteur visiteur) {
		throw new UnsupportedOperationException();
	}
}
