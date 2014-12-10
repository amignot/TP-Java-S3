package pattern.exo3.composite;

import pattern.exo3.visiteur.FichierVisiteur;
import pattern.exo3.visiteur.GlobalNameVisiteur;
import pattern.exo3.visiteur.HierarchiqueVisiteur;

public class TestComposite {

	public static void main(String[] args) {
		
		HierarchiqueVisiteur visiteur = new HierarchiqueVisiteur();
		GlobalNameVisiteur visiteur2 = new GlobalNameVisiteur();
		FichierVisiteur visiteur3 = new FichierVisiteur();
		Repertoire rep1 = new Repertoire("C:");
		Repertoire rep2 = new Repertoire("Windows");
		Repertoire rep3 = new Repertoire("System32");
		Repertoire rep4 = new Repertoire("temp");
		Fichier fic1 = new Fichier("adsnt.dll",12030);
		Fichier fic2 = new Fichier("advnt.dll",43220);
		Repertoire rep5 = new Repertoire("win.ini");
		Fichier fic3 = new Fichier("test.data",500);

		rep3.addComposantSysteme(fic1);
		rep3.addComposantSysteme(fic2);
		rep4.addComposantSysteme(fic3);
		rep2.addComposantSysteme(rep3);
		rep2.addComposantSysteme(rep5);
		rep1.addComposantSysteme(rep2);
		rep1.addComposantSysteme(rep4);
		
		System.out.println(rep1);
		System.out.println("\n HierarchiqueVisiteur : \n");
		rep1.acceptVisiteur(visiteur);
		System.out.println("\n GlobalNameVisiteur : \n");
		rep1.acceptVisiteur(visiteur2);
		rep1.acceptVisiteur(visiteur3);
		System.out.println("\n Liste des fichiers : "+visiteur3.getListFichier());
	}

}
