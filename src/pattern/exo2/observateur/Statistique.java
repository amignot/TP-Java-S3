package pattern.exo2.observateur;

import java.util.List;

public class Statistique implements Observateur{
	
	private double min;
	private double max;
	private double moy;
	private List<Double> listeTemperatures;
	
	public Statistique() {
		this.min = 0;
		this.max = 0;
		this.moy = 0;
	}

	public double getMin() {
		return min;
	}

	public double getMax() {
		return max;
	}

	public double getMoy() {
		return moy;
	}

	@Override
	public void modifierDonnees(Donnee d) {
		if(d.getTemperature()<min)
			this.min = d.getTemperature();
		if(d.getTemperature()>max)
			this.max = d.getTemperature();
		
	}
	
	
	
}
