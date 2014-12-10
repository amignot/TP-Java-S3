package pattern.exo1.adaptateur;
/**
 * Interface simulant le fonctionnement d'une file
 * @author Adeline Mignot - Camille Blaser
 * @version 1.0
 * @since 05.12.2014
 * @param <E> le type des elements de la file
 */

public interface File<E> {
	
	/**
	 * Fonction qui retourne le premier element de la file
	 * Souleve une execption si la file est vide
	 * @return le premier element de la file
	 */
	public E tete();
	
	/**
	 * Permet d'inserer un element donne en queue
	 * @param e l'element a ajouter
	 */
	public void insererQueue(E e);
	
	/**
	 * Permet de supprimer le premier element de la file
	 */
	public void retirerTete();
	
	/**
	 * Permet d'obtenir la longueur de la file
	 * @return un entier contenant la longueur de la file
	 */
	public int longueur();
	
	/**
	 * Permet de savoir si la file est vide
	 * @return un booleen contenant vrai si la file est vide, faux sinon
	 */
	public boolean estVide();
	
	/*
	 * File est l'adapté.
	 */
}
