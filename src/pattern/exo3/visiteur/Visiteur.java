package pattern.exo3.visiteur;
/**
 * Interface Visiteur qui permet de définir les méthodes à implémenter pour un visiteur
 * @author Adeline Mignot - Camille Blaser
 * @version 1.0
 * @since 05.12.2014
 */
import pattern.exo3.composite.*;

public interface Visiteur {
	
	/**
	 * Cette méthode permet de visiter un fichier passé en paramètre
	 * @param fic : c'est le fichier à visiter
	 */
	public void visit(Fichier fic);
	
	/**
	 * Cette méthode permet de visiter un répertoire passé en paramètre
	 * @param rep : c'est le répertoire à visiter
	 */
	public void visit(Repertoire rep);
	
	/**
	 * Cette méthode permet de définir ce que l'on fait avant la visite
	 * @param compo : c'est le ComposantSysteme qui va être visité
	 */
	public void beforeVisit(ComposantSysteme compo);
	
	/**
	 * Cette méthode permet de définir ce que l'on fait après la visite
	 * @param compo : c'est le ComposantSysteme qui a été visité
	 */
	public void afterVisit(ComposantSysteme compo);
	
}
