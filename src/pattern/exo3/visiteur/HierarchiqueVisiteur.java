package pattern.exo3.visiteur;
/**
 * Classe HierarchiqueVisiteur qui permet de créer un Visiteur qui affiche l'arborescence d'un ComposantSysteme
 * @author Adeline Mignot - Camille Blaser
 * @version 1.0
 * @since 05.12.2014
 * @see pattern.exo3.visiteur.Visiteur
 */

import pattern.exo3.composite.ComposantSysteme;
import pattern.exo3.composite.Fichier;
import pattern.exo3.composite.Repertoire;

public class HierarchiqueVisiteur implements Visiteur{

	private int compteur;
	
	/**
	 * Constructeur de classe qui permet d'initaliser un compteur, qui va compter l'indentation à faire
	 */
	public HierarchiqueVisiteur() {
		this.compteur = 0;
	}
	
	/**
	 * Cette méthode permet d'afficher le nom d'un fichier (passé en paramètre) et sa taille 
	 * @param fic : c'est le fichier à visiter
	 */
	@Override
	public void visit(Fichier fic) {
		System.out.println(fic.getNom()+"\t \t"+fic.getTaille());
		this.afterVisit(fic);
	}

	/**
	 * Cette méthode permet d'afficher le nom d'un répertoire passé en paramètre
	 * @param rep : c'est le répertoire à visiter
	 */
	@Override
	public void visit(Repertoire rep) {
		System.out.println(rep.getNom());	
	}

	/**
	 * Cette méthode permet d'effectuer l'indentation avant l'affichage
	 * @param compo : c'est le ComposantSysteme qui va être visité
	 */
	@Override
	public void beforeVisit(ComposantSysteme compo) {
		for(int i = 0; i < this.compteur; i++){
			System.out.print("\t");
		}
		System.out.print("\\-----");
		this.compteur ++;
	}

	/**
	 * Cette méthode permet de décrémenter le compteur d'indentation
	 * @param compo : c'est le ComposantSysteme qui a été visité
	 */
	@Override
	public void afterVisit(ComposantSysteme compo) {
		this.compteur --;
	}

}
