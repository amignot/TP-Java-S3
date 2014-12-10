package pattern.exo1.adaptateur;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation de l'interface File
 * @author Adeline Mignot - Camille Blaser
 * @version 1.0
 * @since 05.12.2014
 * @param <E> le type des elements de la file
 * @see pattern.exo1.adapteur.File
 */
public class FileImpl<E> implements File<E> {
	
	private final List<E> liste;
	
	public FileImpl() {
		this.liste = new ArrayList<E>();
	}

	/**
	 * Fonction qui retourne le premier element de la file
	 * Souleve une execption si la file est vide
	 * @return le premier element de la file
	 * @see pattern.exo1.adaptateur.File
	 */
	@Override
	public E tete() {
		if(this.estVide()) {
			throw new IllegalStateException("File vide");
		}
		return liste.get(0);
	}

	
	/**
	 * Permet d'inserer un element donne en queue
	 * @param e l'element a ajouter
	 * @see pattern.exo1.adaptateur.File
	 */
	@Override
	public void insererQueue(E e) {
		liste.add(e);	
	}

	
	/**
	 * Permet de supprimer le premier element de la file
	 * @see pattern.exo1.adapteteur.File
	 */
	@Override
	public void retirerTete() {
		if(this.estVide()) {
			throw new IllegalStateException("File vide");
		}
		liste.remove(0);
	}

	
	/**
	 * Permet d'obtenir la longueur de la file
	 * @return un entier contenant la longueur de la file
	 * @see pattern.exo1.adaptateur.File
	 */
	@Override
	public int longueur() {
		return liste.size();
	}

	
	/**
	 * Permet de savoir si la file est vide
	 * @return un booleen contenant vrai si la file est vide, faux sinon
	 * @see pattern.exo1.adaptateur.File
	 */
	@Override
	public boolean estVide() {
		return liste.isEmpty();
	}
	
	/*
	 * FileImpl est l'adaptateur. 
	 */
}
