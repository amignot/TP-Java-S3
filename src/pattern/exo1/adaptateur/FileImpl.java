package pattern.exo1.adaptateur;

import java.util.ArrayList;
import java.util.List;

public class FileImpl<E> implements File<E> {
	
	private final List<E> liste;
	
	public FileImpl() {
		this.liste = new ArrayList<E>();
	}

	@Override
	public E tete() {
		if(this.estVide()) {
			throw new IllegalStateException("File vide");
		}
		return liste.get(0);
	}

	@Override
	public void insererQueue(E e) {
		liste.add(e);	
	}

	@Override
	public void retirerTete() {
		if(this.estVide()) {
			throw new IllegalStateException("File vide");
		}
		liste.remove(0);
	}

	@Override
	public int longueur() {
		return liste.size();
	}

	@Override
	public boolean estVide() {
		return liste.isEmpty();
	}
	
	/*
	 * FileImpl est l'adaptateur. 
	 */
}
