package pattern.exo3.visiteur;
/**
 * Classe GlobalNameVisiteur qui permet de créer un Visiteur 
 * qui affiche le chemin complet des fichiers/répertoires d'un répertoire
 * @see pattern.exo3.visiteur.Visiteur
 * @author Adeline Mignot - Camille Blaser
 * @version 1.0
 * @since 05.12.2014
 */
import java.util.ArrayList;
import java.util.List;

import pattern.exo3.composite.*;

public class GlobalNameVisiteur implements Visiteur {

	private List<String> list;
	private int compteur;
	
	/**
	 * Constructeur de la classe qui permet de créer une liste où seront stockés des noms de répertoires 
	 */
	public GlobalNameVisiteur(){
		this.list = new ArrayList<String>();
		this.compteur = 0;
	}
	
	/**
	 * Cette méthode permet de visiter le fichier passé en paramètre
	 * @param fic : c'est le fichier à visiter
	 */
	@Override
	public void visit(Fichier fic){
		System.out.println(this.affichageListe(this.list)+"\\"+fic.getNom());
	}
	
	/**
	 * Cette méthode permet de visiter le répertoire passé en paramètre
	 * @param rep : c'est le répertoire à visiter
	 */
	@Override
	public void visit(Repertoire rep){
		this.list.add(rep.getNom());
		this.compteur ++;
		
		System.out.println(this.affichageListe(this.list));
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
		this.list.remove(this.compteur-1);
		this.compteur --;
	}
	
	/**
	 * Cette méthode permet d'afficher le chemin de chaque fichier/répertoire
	 * @param list : liste de fichiers à afficher
	 * @return String : une chaine de caractère contenant le nom des fichiers 
	 */
	private String affichageListe(List<String> list){
		String ret;
		
		ret=list.get(0);		
		for(int i = 1 ; i<this.compteur ; i++){
			ret = ret + "\\" + list.get(i);
		}
		return ret;
	}
}
