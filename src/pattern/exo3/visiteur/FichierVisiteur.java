package pattern.exo3.visiteur;
/**
 * Classe FichierVisiteur qui permet de cr�er un Visiteur qui permet de r�cup�rer les fichiers dans l'arborescence
 * @see pattern.exo3.visiteur.Visiteur
 * @author Adeline Mignot - Camille Blaser
 * @version 1.0
 * @since 05.12.2014
 */
import java.util.ArrayList;
import java.util.List;

import pattern.exo3.composite.ComposantSysteme;
import pattern.exo3.composite.Fichier;
import pattern.exo3.composite.Repertoire;

public class FichierVisiteur implements Visiteur{

	private List<String> list;
	
	/**
	 * Constructeur de la classe qui permet de cr�er une liste o� sera stock� le nom des fichiers
	 */
	public FichierVisiteur(){
		this.list = new ArrayList<String>();
	}
	
	/**
	 * Cette m�thode permet de visiter un fichier pass� en param�tre
	 * @param fic : c'est le fichier � visiter
	 */
	@Override
	public void visit(Fichier fic) {
		this.list.add(fic.getNom());		
	}

	/**
	 * Cette m�thode permet de visiter un r�pertoire pass� en param�tre
	 * @param rep : c'est le r�pertoire � visiter
	 */
	@Override
	public void visit(Repertoire rep) {
		//on ne fait rien 
	}

	/**
	 * Cette m�thode permet de d�ffinir ce que l'on fait avant la visite
	 * @param compo : c'est le ComposantSysteme qui va �tre visit�
	 */
	@Override
	public void beforeVisit(ComposantSysteme compo) {
		// on ne fait rien
	}

	/**
	 * Cette m�thode permet de d�ffinir ce que l'on fait apr�s la visite
	 * @param compo : c'est le ComposantSysteme qui a �t� visit�
	 */
	@Override
	public void afterVisit(ComposantSysteme compo) {
		// on ne fait rien
	}

	/**
	 * Cette m�thode permet de r�cup�rer la liste des fichiers de l'arborescence
	 * @return List<String> : c'est la liste des fichiers de l'arborescence
	 */
	public List<String> getListFichier(){
		return this.list;
	}
}
