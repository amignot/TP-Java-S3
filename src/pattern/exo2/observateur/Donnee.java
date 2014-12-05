package pattern.exo2.observateur;

/**
 * Classe caractérisant un ensemble de donnée météorologique.
 * 
 * @author V579656
 * @since 10/11/2014
 * @version 1.0
 * 
 */
public class Donnee {

	private final double temperature;
	private final double precipitation;
	private final double pression;

	/**
	 * Constructeur de la classe Donnee.
	 * 
	 * @param temperature
	 *            la temperature (° C).
	 * @param precipitation
	 *            le niveau de précipitations (mm).
	 * @param pression
	 *            la pression atmosphérique (hPa).
	 */
	public Donnee(double temperature, double precipitation, double pression) {
		super();
		this.temperature = temperature;
		this.precipitation = precipitation;
		this.pression = pression;
	}

	/**
	 * Récupère la température (° C).
	 * @return la température (° C).
	 */
	public double getTemperature() {
		return temperature;
	}

	/**
	 * Récupère le niveau de précipitations (mm).
	 * @return  le niveau de précipitations (mm).
	 */
	public double getPrecipitation() {
		return precipitation;
	}

	/**
	 * Récupère la pression atmosphérique (hPa).
	 * @return  la pression atmosphérique (hPa).
	 */
	public double getPression() {
		return pression;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Donnee [temperature=" + temperature + ", precipitation="
				+ precipitation + ", pression=" + pression + "]";
	}

}
