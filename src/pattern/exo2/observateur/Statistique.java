package pattern.exo2.observateur;

import java.util.ArrayList;
import java.util.List;

public class Statistique implements Observateur{
	
	private double min;
	private double max;
	private List<Double> listeTemperatures;
	
	public Statistique() {
		this.min = 0;
		this.max = 0;
		this.listeTemperatures = new ArrayList<Double>();
	}

	public double getMin() {
		return this.min;
	}

	public double getMax() {
		return this.max;
	}

	public double getMoy() {
		double ret;
		ret = 0;
		for(Double temp:this.listeTemperatures){
			ret += temp;
		}
		
		return ret/this.listeTemperatures.size();
	}

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
