package pattern.exo1.adaptateur;

/**
 * Classe qui teste les methodes d'une file
 * @author Adeline Mignot - Camille Blaser
 * @version 1.0
 * @since 05.12.2014
 */
public class TestFile {

	/**
	 * Methode creant une file, lui ajoute deux elements, 
	 * retire le premier et affiche la tete de notre file
	 * @param args
	 */
	public static void main(String[] args) {
		
		FileImpl<Integer> file = new FileImpl<Integer>();
		
		file.insererQueue(3);
		file.insererQueue(5);
		
		file.retirerTete();
		System.out.println(file.tete());
	}
}
