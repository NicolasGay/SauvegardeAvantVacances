package com.sopra.pox3.collection;

import java.util.List;

import com.sopra.pox3.madagascar.Penguin;

public class ListApplication {

	public static void main(String[] args) {

		new ListApplication().init();

	}

	void init() {

		Penguin rico = new Penguin("Rico");
		Penguin skipper = new Penguin("Skipper");
		Penguin soldat = new Penguin("Soldat");
		Penguin kowalski = new Penguin("Kowalski");
		Penguin tux = new Penguin("Tux", 98);

		Penguin[] allPenguins = { rico, skipper, soldat, kowalski, tux };
		PenguinTeam team = new PenguinTeam(allPenguins);

		// ECRITURE EQUIVALENTE
		// PenguinTeam team = new PenguinTeam(rico, skipper, soldat, kowalski,
		// tux);
		// Il faut pour cela placer un ... (varargs) à la place des [] dans la
		// classe PenguinTeam au niveau du constructeur pour indiquer que le
		// nombre d'arguments du tableau est variable. Cette manière d'écrire
		// est plus intuitive et plus agréable à lire. On parle de "sucre
		// syntaxique"

		// System.out.println(team.penguins);

		// UTILISATION DE LA FONCTION next() DEFINIE DANS
		// PenguinTeam et CircularList

		System.out.println(team.next()); // rico
		System.out.println(team.next()); // skipper
		System.out.println(team.next()); // soldat
		System.out.println(team.next()); // kowalski
		System.out.println(team.next()); // tux
		System.out.println(team.next()); // message de fin de liste, puis rico
		System.out.println(team.next()); // skipper

		//////////////////////////////////////////////////////////////////////////////////////

		List<Penguin> penguins = team.getPenguins();
		// System.out.println(penguins);
		// On est obligés de commenter les println depuis qu'on a défini
		// penguins comme étant une CircularList : comme il affiche tous les
		// éléments de la liste et que la liste boucle sur elle-même, le println
		// ne s'arrête jamais

	}

}
