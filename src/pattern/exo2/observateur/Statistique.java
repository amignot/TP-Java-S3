package pattern.exo2.observateur;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation de l'interface Observateur
 * @author Adeline Mignot - Camille Blaser
 * @version 1.0
 * @since 05.12.2014
 * @see pattern.exo2.observateur.Observateur
 */
public class Statistique implements Observateur{
	
	private double min;
	private double max;
	private List<Double> listeTemperatures;
	
	/**
	 * Constructeur initialisant les attributs
	 */
	public Statistique() {
		this.min = 0;
		this.max = 0;
		this.listeTemperatures = new ArrayList<Double>();
	}

	/**
	 * Permet d'obtenir l'attribut de temperature minimale
	 * @return la temperature minimale
	 */
	public double getMin() {
		return this.min;
	}
	
	/**
	 * Permet d'obtenir l'attribut de temperature maximale
	 * @return la temperature maximale
	 */
	public double getMax() {
		return this.max;
	}

	/**
	 * Permet d'obtenir l'attribut de temperature moyenne
	 * @return la temperature moyenne
	 */
	public double getMoy() {
		double ret;
		ret = 0;
		for(Double temp:this.listeTemperatures){
			ret += temp;
		}
		
		return ret/this.listeTemperatures.size();
	}

	/**
	 * Permet d'echanger les donnees avec differents observateurs.
	 * @param d les donnees a echanger
	 * @see pattern.exo2.observateur.Observateur
	 */
	@Override
	public void modifierDonnees(Donnee d) {
		if(d.getTemperature()<this.min)
			this.min = d.getTemperature();
		
		if(d.getTemperature()>this.max)
			this.max = d.getTemperature();
		
		this.listeTemperatures.add(d.getTemperature());
		System.out.println("Température min :"+this.getMin()+" Température max :"+this.getMax()+" Température moyenne :"+this.getMoy()+"\n");
		
	}
	
	
	
}
