package pattern.exo3.visiteur;
/**
 * Interface Visiteur qui permet de d�ffinir les m�thodes � impl�menter pour un visiteur
 * @author Adeline Mignot - Camille Blaser
 * @version 1.0
 * @since 05.12.2014
 */
import pattern.exo3.composite.*;

public interface Visiteur {
	
	/**
	 * Cette m�thode permet de visiter un fichier pass� en param�tre
	 * @param fic : c'est le fichier � visiter
	 */
	public void visit(Fichier fic);
	
	/**
	 * Cette m�thode permet de visiter un r�pertoire pass� en param�tre
	 * @param rep : c'est le r�pertoire � visiter
	 */
	public void visit(Repertoire rep);
	
	/**
	 * Cette m�thode permet de d�ffinir ce que l'on fait avant la visite
	 * @param compo : c'est le ComposantSysteme qui va �tre visit�
	 */
	public void beforeVisit(ComposantSysteme compo);
	
	/**
	 * Cette m�thode permet de d�ffinir ce que l'on fait apr�s la visite
	 * @param compo : c'est le ComposantSysteme qui a �t� visit�
	 */
	public void afterVisit(ComposantSysteme compo);
	
}
