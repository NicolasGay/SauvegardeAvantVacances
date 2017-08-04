package com.sopra.pox3.collection;

import java.util.Iterator;
import java.util.List;

import com.sopra.pox3.madagascar.Penguin;

public class PenguinTeam {

	// CircularList<Penguin> penguins = new CircularList<>();
	// Normalement, on travaille avec un type large à gauche et un type plus
	// précis à droite ! List<Penguin> penguins = new CircularList<>();
	// Mais pour pouvoir utiliser le next() défini dans la classe CircularList.
	// Mais on voudrait pouvoir parcourir une List tout court !
	List<Penguin> penguins = new CircularList<>();
	// Donc on travaille avec la syntaxe classique, et on utilise dans le next()
	// la fonction iterator() qui est présente par défaut pour toutes les listes

	Iterator<Penguin> iterator;

	public PenguinTeam(Penguin[] allPenguins) {

		for (int i = 0; i < allPenguins.length; i++) {
			penguins.add(allPenguins[i]);
		}

		// ECRITURE EQUIVALENTE
		// for(Penguin p: allPenguins){
		// this.penguins.add(p);
		// }
		// Le défaut de cette façon de remplir l'ArrayList c'est qu'on ne passe
		// pas par l'index, or c'est un outil parfois utile pour la suite

		iterator = this.penguins.iterator();

	}

	// static int count = -1;
	Penguin next() {
		return this.iterator.next();
	}

	public List<Penguin> getPenguins() {
		return penguins;
	}
}
