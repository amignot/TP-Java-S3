package pattern.exo3.visiteur;
import pattern.exo3.composite.*;

public interface Visiteur {
	
	public void visit(Fichier fic);
	public void visit(Repertoire rep);
	public void beforeVisit(ComposantSysteme compo);
	public void afterVisit(ComposantSysteme compo);
	
}
