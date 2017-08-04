package com.sopra.pox3.encapsulation;

import com.sopra.pox3.object.People;

public class KingdomApplication {

	public static void main(String[] args) {
		King arthur = new King("Arthur");
		arthur.name = "Gentil Arthur";
		// // on est dans le même package donc on
		// // peut modifier la variable
		// // car les classes se connaissent. Mais
		// // si l'attribut name du King était
		// // défini comme private, on ne peut pas y accéder.

		People peon = new People("Peon", 20); // on peut créer un People dans
												// KingdomApplication parce que
												// People est une public class,
												// donc accessible depuis un
												// autre package
		arthur.command(peon); // on peut utiliser la fonction command() des King
								// définis (ici arthur), car la fonction est
								// définie dans le package, donc même si elle
								// n'est pas public on pourra l'utiliser tant
								// que le package de travail est le package dans
								// lequel est définie la fonction

	}

}
