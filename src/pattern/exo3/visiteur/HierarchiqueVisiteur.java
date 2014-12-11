package pattern.exo3.visiteur;
/**
 * Classe HierarchiqueVisiteur qui permet de cr�er un Visiteur qui affiche l'arborescence d'un ComposantSysteme
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
	 * Constructeur de classe qui permet d'initaliser un compteur, qui va compter l'indentation � faire
	 */
	public HierarchiqueVisiteur() {
		this.compteur = 0;
	}
	
	/**
	 * Cette m�thode permet d'afficher le nom d'un fichier (pass� en param�tre) et sa taille 
	 * @param fic : c'est le fichier � visiter
	 */
	@Override
	public void visit(Fichier fic) {
		System.out.println(fic.getNom()+"\t \t"+fic.getTaille());
		this.afterVisit(fic);
	}

	/**
	 * Cette m�thode permet d'afficher le nom d'un r�pertoire pass� en param�tre
	 * @param rep : c'est le r�pertoire � visiter
	 */
	@Override
	public void visit(Repertoire rep) {
		System.out.println(rep.getNom());	
	}

	/**
	 * Cette m�thode permet d'effectuer l'indentation avant l'affichage
	 * @param compo : c'est le ComposantSysteme qui va �tre visit�
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
	 * Cette m�thode permet de d�cr�menter le compteur d'indentation
	 * @param compo : c'est le ComposantSysteme qui a �t� visit�
	 */
	@Override
	public void afterVisit(ComposantSysteme compo) {
		this.compteur --;
	}

}
