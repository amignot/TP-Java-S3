package pattern.exo3.visiteur;

import pattern.exo3.composite.ComposantSysteme;
import pattern.exo3.composite.Fichier;
import pattern.exo3.composite.Repertoire;

public class HierarchiqueVisiteur implements Visiteur{

	public HierarchiqueVisiteur() {
	}
	
	@Override
	public void visit(Fichier fic) {
		System.out.println(fic.getNom());	
	}

	@Override
	public void visit(Repertoire rep) {
		System.out.println(rep.getNom());	
	}

	@Override
	public void beforeVisit(ComposantSysteme compo) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void afterVisit(ComposantSysteme compo) {
		// TODO Auto-generated method stub
	}

}
