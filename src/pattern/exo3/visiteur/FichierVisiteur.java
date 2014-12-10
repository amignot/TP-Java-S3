package pattern.exo3.visiteur;

import java.util.ArrayList;
import java.util.List;

import pattern.exo3.composite.ComposantSysteme;
import pattern.exo3.composite.Fichier;
import pattern.exo3.composite.Repertoire;

public class FichierVisiteur implements Visiteur{

	private List<String> list;
	
	public FichierVisiteur(){
		this.list = new ArrayList<String>();
	}
	
	@Override
	public void visit(Fichier fic) {
		this.list.add(fic.getNom());		
	}

	@Override
	public void visit(Repertoire rep) {
		
	}

	@Override
	public void beforeVisit(ComposantSysteme compo) {
		
	}

	@Override
	public void afterVisit(ComposantSysteme compo) {

	}

	public List<String> getListFichier(){
		return this.list;
	}
}
