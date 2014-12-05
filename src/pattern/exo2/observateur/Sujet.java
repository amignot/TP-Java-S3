package pattern.exo2.observateur;

public interface Sujet {
	public void ajouterObservateur(Observateur o);
	public void retirerObservateur(Observateur o);
	public void notifierObservateur();
}
