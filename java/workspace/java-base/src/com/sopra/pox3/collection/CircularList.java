package com.sopra.pox3.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CircularList<E> extends ArrayList<E> implements Iterator<E> {
	// E représente un élément générique
	// Ici, cas de polymorphisme : une liste, aussi iterable, aussi iterator

	int count=-1;

	public E next() {

		if (count < this.size() - 1) {
			this.count++;
		} else {
			System.out.println("!!!! There are no more elements in the team to display !!!!");
			System.out.println("The array index will be reinitialized");
			this.count = 0;
			System.out.println("You're back to the beginning of your team, the first element is :");
		}
		return this.get(count);
	}

	@Override
	public Iterator<E> iterator() {
		return this;
	}

	@Override
	public boolean hasNext() {
		return true;
	}
	// Nécessaire pour pouvoir utiliser le Iterator. Comme la listes est
	// circulaire, il y a toujours un élément suivant. Le hasNext() de la classe
	// Iterator doit donc toujours être "overridé" à true

}
