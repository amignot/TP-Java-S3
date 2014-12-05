package pattern.exo1.adaptateur;

public interface File<E> {
	public E tete();
	public void insererQueue(E e);
	public void retirerTete();
	public int longueur();
	public boolean estVide();
	
	/*
	 * File est l'adapt.
	 */
}
