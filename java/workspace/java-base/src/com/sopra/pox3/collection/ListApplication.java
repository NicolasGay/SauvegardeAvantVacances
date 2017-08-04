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
		// Il faut pour cela placer un ... (varargs) � la place des [] dans la
		// classe PenguinTeam au niveau du constructeur pour indiquer que le
		// nombre d'arguments du tableau est variable. Cette mani�re d'�crire
		// est plus intuitive et plus agr�able � lire. On parle de "sucre
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
		// On est oblig�s de commenter les println depuis qu'on a d�fini
		// penguins comme �tant une CircularList : comme il affiche tous les
		// �l�ments de la liste et que la liste boucle sur elle-m�me, le println
		// ne s'arr�te jamais

	}

}
