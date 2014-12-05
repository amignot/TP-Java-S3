package pattern.exo2.observateur;

public class Meteo implements Observateur {

	@Override
	public void modifierDonnees(Donnee d) {
		System.out.println(d);
	}
	
}
