package pattern.exo3.composite;
/**
 * Classe Fichier qui �tand la classe ComposantSysteme
 * Cette classe permet de cr�er et g�rer un fichier
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
	 * C'est le constructeur de la classe, il permet de cr�er un fichier avec un nom 
	 * et une taille
	 * @param nom : c'est le nom du fichier � cr�er
	 * @param taille : c'est la taille du fichier � cr�er
	 */
	public Fichier(String nom, int taille) {
		this.nom = nom;
		this.taille = taille;
	}
	
	/**
	 * Cette m�thode permet de r�cup�rer le nom du fichier
	 * @return String : le nom du fichier
	 * @see pattern.exo3.composite.ComposantSysteme
	 */
	@Override
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * Cette m�thode permet de r�cup�rer la taille du fichier
	 * @return int : la taille du fichier
	 * @see pattern.exo3.composite.ComposantSysteme
	 */
	@Override
	public int getTaille() {
		return this.taille;
	}
	
	/**
	 * Cette m�thode permet de d�finir l'affichage console d'un fichier
	 * @return String : la chaine de caract�res correspondant � un fichier
	 */
	@Override
	public String toString() {
		return this.nom+"\t"+this.taille;
	}
	
	/**
	 * Cette m�thode permet d'accepter un visiteur 
	 * @param visiteur : le visiteur utilis�
	 * @see pattern.exo3.composite.ComposantSysteme
	 */
	@Override 
	public void acceptVisiteur(Visiteur visiteur){
		visiteur.visit(this);
	}
}
