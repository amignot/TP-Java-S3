package pattern.exo3.visiteur;

import pattern.exo3.composite.ComposantSysteme;
import pattern.exo3.composite.Fichier;
import pattern.exo3.composite.Repertoire;

public class HierarchiqueVisiteur implements Visiteur{

	private int compteur;
	
	public HierarchiqueVisiteur() {
		this.compteur = 0;
	}
	
	@Override
	public void visit(Fichier fic) {
		System.out.println(fic.getNom());
		this.afterVisit(fic);
	}

	@Override
	public void visit(Repertoire rep) {
		System.out.println(rep.getNom());	
	}

	@Override
	public void beforeVisit(ComposantSysteme compo) {
		for(int i = 0; i < this.compteur; i++){
			System.out.print("\t");
		}
		System.out.print("\\-----");
		this.compteur ++;
	}

	@Override
	public void afterVisit(ComposantSysteme compo) {
		this.compteur --;
	}

}
