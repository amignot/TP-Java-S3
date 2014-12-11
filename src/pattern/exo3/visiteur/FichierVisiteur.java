package pattern.exo3.visiteur;
/**
 * Classe FichierVisiteur qui permet de créer un Visiteur qui permet de récupérer les fichiers dans l'arborescence
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
	 * Constructeur de la classe qui permet de créer une liste où sera stocké le nom des fichiers
	 */
	public FichierVisiteur(){
		this.list = new ArrayList<String>();
	}
	
	/**
	 * Cette méthode permet de visiter un fichier passé en paramètre
	 * @param fic : c'est le fichier à visiter
	 */
	@Override
	public void visit(Fichier fic) {
		this.list.add(fic.getNom());		
	}

	/**
	 * Cette méthode permet de visiter un répertoire passé en paramètre
	 * @param rep : c'est le répertoire à visiter
	 */
	@Override
	public void visit(Repertoire rep) {
		//on ne fait rien 
	}

	/**
	 * Cette méthode permet de définir ce que l'on fait avant la visite
	 * @param compo : c'est le ComposantSysteme qui va être visité
	 */
	@Override
	public void beforeVisit(ComposantSysteme compo) {
		// on ne fait rien
	}

	/**
	 * Cette méthode permet de définir ce que l'on fait après la visite
	 * @param compo : c'est le ComposantSysteme qui a été visité
	 */
	@Override
	public void afterVisit(ComposantSysteme compo) {
		// on ne fait rien
	}

	/**
	 * Cette méthode permet de récupérer la liste des fichiers de l'arborescence
	 * @return List<String> : c'est la liste des fichiers de l'arborescence
	 */
	public List<String> getListFichier(){
		return this.list;
	}
}
