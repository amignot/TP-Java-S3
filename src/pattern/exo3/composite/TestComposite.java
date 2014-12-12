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
		
		//on crÃ©e les diffÃ©rents visiteurs Ã  utiliser
		HierarchiqueVisiteur visiteur = new HierarchiqueVisiteur();
		GlobalNameVisiteur visiteur2 = new GlobalNameVisiteur();
		FichierVisiteur visiteur3 = new FichierVisiteur();
		
		//on crÃ©e les diffÃ©rents rÃ©pertoires 
		Repertoire rep1 = new Repertoire("C:");
		Repertoire rep2 = new Repertoire("Windows");
		Repertoire rep3 = new Repertoire("System32");
		Repertoire rep4 = new Repertoire("temp");
		Repertoire rep5 = new Repertoire("win.ini");
		
		//on crÃ©e les diffÃ©rents fichiers 
		Fichier fic1 = new Fichier("adsnt.dll",12030);
		Fichier fic2 = new Fichier("advnt.dll",43220);
		Fichier fic3 = new Fichier("test.data",500);

		//on crÃ©e l'arborescence 
		rep3.addComposantSysteme(fic1);
		rep3.addComposantSysteme(fic2);
		rep4.addComposantSysteme(fic3);
		rep2.addComposantSysteme(rep3);
		rep2.addComposantSysteme(rep5);
		rep1.addComposantSysteme(rep2);
		rep1.addComposantSysteme(rep4);
		
		//on affiche l'arborescence suivant les diffÃ©rents visiteurs
		System.out.println(rep1);
		System.out.println("\n HierarchiqueVisiteur : \n");
		rep1.acceptVisiteur(visiteur);
		System.out.println("\n GlobalNameVisiteur : \n");
		rep1.acceptVisiteur(visiteur2);
		rep1.acceptVisiteur(visiteur3);
		System.out.println("\n Liste des fichiers : "+visiteur3.getListFichier());
	}

}

/*
 * Dans la méthode getTaille() de Répertoire, on crée un compteur qui va être incrémenté de la taille de chaque composantSysteme du répertoire.
 * Cette méthode est récursive.
 * 
 * Lors du premier affichage on obtient une ligne avec tout les noms des composants et de leur contenu.
 * 
 * Pour propager l'observateur, il faut accepter la visite sur le répertoire à visiter à l'aid ede la méthode acceptVisiteur().
 * 
 * Les méthodes beforeVisit() et afterVisit() permettent d'indenter l'affichage.
 * 
 * (Veuillez nous excuser pour l'encodage nous avons des soucis avec le partage du fichier)
 */