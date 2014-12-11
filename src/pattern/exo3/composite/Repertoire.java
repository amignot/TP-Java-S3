package pattern.exo3.composite;
/**
 * Classe Répertoire qui étand la classe ComposantSysteme
 * Cette classe permet de créer et gérer un répertoire
 * 
 * @see pattern.exo3.composite.ComposantSystem
 * @author Adeline Mignot - Camille Blaser
 * @version 1.0
 * @since 05.12.2014
 */
import java.util.ArrayList;
import java.util.List;

import pattern.exo3.visiteur.Visiteur;

public class Repertoire extends ComposantSysteme {
	
	private String nom;
	private List<ComposantSysteme> composants;
	
	/**
	 * C'est le constructeur de la classe, il permet de créer un répertoire avec un nom 
	 * et une liste contenant ses composants
	 * @param nom : c'est le nom du répertoire à créer
	 */
	public Repertoire(String nom)
	{
		this.nom = nom;
		this.composants = new ArrayList<ComposantSysteme>();
	}
	
	/**
	 * Cette méthode permet de récupérer le nom du répertoire
	 * @return String : le nom du répertoire
	 * @see pattern.exo3.composite.ComposantSysteme
	 */
	@Override
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * Cette méthode permet de récupérer la taille du répertoire
	 * @return int : la somme des tailles des fichiers contenus dans le répertoire
	 * @see pattern.exo3.composite.ComposantSysteme
	 */
	@Override
	public int getTaille() {
		int sum =0;
		for(ComposantSysteme compo:this.composants) {
			sum+=compo.getTaille();
		}
		return sum;
	}
	
	/**
	 * Cette méthode permet d'ajouter un ComposantSysteme dans le répertoire
	 * @param compo : c'est le ComposantSysteme à ajouter dans le répertoire
	 * @see pattern.exo3.composite.ComposantSysteme
	 */
	@Override
	public void addComposantSysteme(ComposantSysteme compo) {
		if(compo == null) {
			throw new NullPointerException();
		}
		this.composants.add(compo);
	}
	
	/**
	 * Cette méthode permet d'enlever un ComposantSysteme du répertoire
	 * @param compo : c'est le composant à retirer du répertoire 
	 * @see pattern.exo3.composite.ComposantSysteme
	 */
	@Override
	public void removeComposantSysteme(ComposantSysteme compo) {
		if(compo == null) {
			throw new NullPointerException();
		}
		this.composants.remove(this.composants.indexOf(compo));
	}
	
	/**
	 * Cette méthode permet de récupérer le ComposantSystéme à une place donnée
	 * @param index : c'est l'index du ComposantSystéme que l'on veut récupérer
	 * @return ComposantSysteme : le ComposantSystéme d'index index
	 * @see pattern.exo3.composite.ComposantSysteme
	 */
	@Override
	public ComposantSysteme getComposantSysteme(int index) {
		if(index<0 || index>=this.composants.size()) {
			throw new IndexOutOfBoundsException();
		}
		return this.composants.get(index);
	}
	
	/**
	 * Cette méthode permet de définir l'affichage console d'un répertoire
	 * @return String : la chaine de caractères correspondant à un répertoire
	 */
	@Override
	public String toString() {
		return "Répertoire[nom= "+this.getNom()+", liste des composants système= "+this.composants+"]";
	}
	
	/**
	 * Cette méthode permet d'accepter un visiteur 
	 * @param visiteur : le visiteur utilisé
	 * @see pattern.exo3.composite.ComposantSysteme
	 */
	@Override 
	public void acceptVisiteur(Visiteur visiteur){
		visiteur.visit(this);
		for(ComposantSysteme compo:this.composants) {
			visiteur.beforeVisit(compo);
			compo.acceptVisiteur(visiteur);
		}
		visiteur.afterVisit(this);
	}
}
