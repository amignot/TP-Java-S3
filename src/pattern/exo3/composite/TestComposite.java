package pattern.exo3.composite;
/**
 * Classe TestComposite qui permet de tester les classes des packages 
 * pattern.exo3.composite et pattern.exo3.visiteur
 * @see pattern.exo3.composite
 * @see pattern.exo3.visiteur
 * @author Adeline Mignot - Camille Blaser
 * @version 1.0
 * @since 05.12.2014
 */
import pattern.exo3.visiteur.FichierVisiteur;
import pattern.exo3.visiteur.GlobalNameVisiteur;
import pattern.exo3.visiteur.HierarchiqueVisiteur;

public class TestComposite {

	public static void main(String[] args) {
		
		//on crée les différents visiteurs à utiliser
		HierarchiqueVisiteur visiteur = new HierarchiqueVisiteur();
		GlobalNameVisiteur visiteur2 = new GlobalNameVisiteur();
		FichierVisiteur visiteur3 = new FichierVisiteur();
		
		//on crée les différents répertoires 
		Repertoire rep1 = new Repertoire("C:");
		Repertoire rep2 = new Repertoire("Windows");
		Repertoire rep3 = new Repertoire("System32");
		Repertoire rep4 = new Repertoire("temp");
		Repertoire rep5 = new Repertoire("win.ini");
		
		//on crée les différents fichiers 
		Fichier fic1 = new Fichier("adsnt.dll",12030);
		Fichier fic2 = new Fichier("advnt.dll",43220);
		Fichier fic3 = new Fichier("test.data",500);

		//on crée l'arborescence 
		rep3.addComposantSysteme(fic1);
		rep3.addComposantSysteme(fic2);
		rep4.addComposantSysteme(fic3);
		rep2.addComposantSysteme(rep3);
		rep2.addComposantSysteme(rep5);
		rep1.addComposantSysteme(rep2);
		rep1.addComposantSysteme(rep4);
		
		//on affiche l'arborescence suivant les différents visiteurs
		System.out.println(rep1);
		System.out.println("\n HierarchiqueVisiteur : \n");
		rep1.acceptVisiteur(visiteur);
		System.out.println("\n GlobalNameVisiteur : \n");
		rep1.acceptVisiteur(visiteur2);
		rep1.acceptVisiteur(visiteur3);
		System.out.println("\n Liste des fichiers : "+visiteur3.getListFichier());
	}

}
