package pattern.exo3.composite;

import java.util.ArrayList;
import java.util.List;

import pattern.exo3.visiteur.Visiteur;

public class Repertoire extends ComposantSysteme {
	
	private String nom;
	private List<ComposantSysteme> composants;
	
	public Repertoire(String nom)
	{
		this.nom = nom;
		this.composants = new ArrayList<ComposantSysteme>();
	}
	
	@Override
	public String getNom() {
		return this.nom;
	}
	
	@Override
	public int getTaille() {
		int sum =0;
		for(ComposantSysteme compo:this.composants) {
			sum+=compo.getTaille();
		}
		return sum;
	}
	
	@Override
	public void addComposantSysteme(ComposantSysteme compo) {
		if(compo == null) {
			throw new NullPointerException();
		}
		this.composants.add(compo);
	}
	
	@Override
	public void removeComposantSysteme(ComposantSysteme compo) {
		if(compo == null) {
			throw new NullPointerException();
		}
		this.composants.remove(this.composants.indexOf(compo));
	}
	
	@Override
	public ComposantSysteme getComposantSysteme(int index) {
		if(index<0 || index>=this.composants.size()) {
			throw new IndexOutOfBoundsException();
		}
		return this.composants.get(index);
	}
	
	@Override
	public String toString() {
		return "Répertoire[nom= "+this.getNom()+", liste des composants système= "+this.composants+"]";
	}
	
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
