package pattern.exo3.visiteur;

import java.util.ArrayList;
import java.util.List;

import pattern.exo3.composite.*;

public class GlobalNameVisiteur implements Visiteur {

	private List<String> list;
	private int compteur;
	
	public GlobalNameVisiteur(){
		this.list = new ArrayList<String>();
		this.compteur = 0;
	}
	
	@Override
	public void visit(Fichier fic){
		System.out.println(this.affichageListe(this.list)+"\\"+fic.getNom());
	}
	
	@Override
	public void visit(Repertoire rep){
		this.list.add(rep.getNom());
		this.compteur ++;
		
		System.out.println(this.affichageListe(this.list));
	}

	@Override
	public void beforeVisit(ComposantSysteme compo) {
		// on ne fait rien
	}

	@Override
	public void afterVisit(ComposantSysteme compo) {
		this.list.remove(this.compteur-1);
		this.compteur --;
	}
	
	private String affichageListe(List<String> list){
		String ret;
		
		ret=list.get(0);		
		for(int i = 1 ; i<this.compteur ; i++){
			ret = ret + "\\" + list.get(i);
		}
		return ret;
	}
}
