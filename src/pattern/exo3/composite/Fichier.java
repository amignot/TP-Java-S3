package pattern.exo3.composite;
/**
 * Classe Fichier qui étend la classe ComposantSysteme
 * Cette classe permet de créer et gérer un fichier
 * 
 * @see pattern.exo3.composite.ComposantSystem
 * @author Adeline Mignot - Camille Blaser
 * @version 1.0
 * @since 05.12.2014
 */
import pattern.exo3.visiteur.Visiteur;

public class Fichier extends ComposantSysteme {
	
	private String nom;
	private int taille;
	
	/**
	 * C'est le constructeur de la classe, il permet de créer un fichier avec un nom 
	 * et une taille
	 * @param nom : c'est le nom du fichier à créer
	 * @param taille : c'est la taille du fichier à créer
	 */
	public Fichier(String nom, int taille) {
		this.nom = nom;
		this.taille = taille;
	}
	
	/**
	 * Cette méthode permet de récupérer le nom du fichier
	 * @return String : le nom du fichier
	 * @see pattern.exo3.composite.ComposantSysteme
	 */
	@Override
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * Cette méthode permet de récupérer la taille du fichier
	 * @return int : la taille du fichier
	 * @see pattern.exo3.composite.ComposantSysteme
	 */
	@Override
	public int getTaille() {
		return this.taille;
	}
	
	/**
	 * Cette méthode permet de définir l'affichage en console d'un fichier
	 * @return String : la chaine de caractères correspondant à un fichier
	 */
	@Override
	public String toString() {
		return this.nom+"\t"+this.taille;
	}
	
	/**
	 * Cette méthode permet d'accepter un visiteur 
	 * @param visiteur : le visiteur utilisé
	 * @see pattern.exo3.composite.ComposantSysteme
	 */
	@Override 
	public void acceptVisiteur(Visiteur visiteur){
		visiteur.visit(this);
	}
}
