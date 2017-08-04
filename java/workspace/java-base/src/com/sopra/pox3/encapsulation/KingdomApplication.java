package com.sopra.pox3.encapsulation;

import com.sopra.pox3.object.People;

public class KingdomApplication {

	public static void main(String[] args) {
		King arthur = new King("Arthur");
		arthur.name = "Gentil Arthur";
		// // on est dans le m�me package donc on
		// // peut modifier la variable
		// // car les classes se connaissent. Mais
		// // si l'attribut name du King �tait
		// // d�fini comme private, on ne peut pas y acc�der.

		People peon = new People("Peon", 20); // on peut cr�er un People dans
												// KingdomApplication parce que
												// People est une public class,
												// donc accessible depuis un
												// autre package
		arthur.command(peon); // on peut utiliser la fonction command() des King
								// d�finis (ici arthur), car la fonction est
								// d�finie dans le package, donc m�me si elle
								// n'est pas public on pourra l'utiliser tant
								// que le package de travail est le package dans
								// lequel est d�finie la fonction

	}

}
