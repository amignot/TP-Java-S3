package pattern.exo3.composite;

public class Fichier extends ComposantSysteme {
	
	private String nom;
	private int taille;
	
	public Fichier(String nom, int taille) {
		this.nom = nom;
		this.taille = taille;
	}
	
	@Override
	public String getNom() {
		return this.nom;
	}
	
	@Override
	public int getTaille() {
		return this.taille;
	}
	
	@Override
	public String toString() {
		return this.nom+"\t"+this.taille;
	}
}
