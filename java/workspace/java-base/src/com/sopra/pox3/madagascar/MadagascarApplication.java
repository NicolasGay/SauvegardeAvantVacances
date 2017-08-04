package com.sopra.pox3.madagascar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MadagascarApplication {

	public static void main(String[] args) {

		Penguin skipper, kowalski, soldat, rico;

		List<Penguin> penguins = new ArrayList<>();

		skipper = new Penguin("Skipper", 10);
		kowalski = new Penguin("Kowalski", 15);
		soldat = new Penguin("Soldat", 30);
		rico = new Penguin("Rico", 12);

		penguins.add(skipper);
		penguins.add(kowalski);
		penguins.add(soldat);
		penguins.add(rico);

		// on va rendre les Penguin comparables entre eux en utilisant un
		// implement Comparable<Type> dans la class Penguin. Les classes qui
		// implémentent Comparable accèdent à la fonction compareTo

		System.out.println(penguins);
		Collections.sort(penguins);
		System.out.println(penguins);
		// on sort par le nom est pas par la speed à cause du compareTo qu'on a
		// placé dans la classe Penguin

		Collections.sort(penguins, new Comparator<Penguin>() {

			@Override
			public int compare(Penguin p1, Penguin p2) {
				return p1.speed.compareTo(p2.speed);
			}
			// Camparator<> est une classe anonyme (qui n'existe que le temps de
			// l'éxécution du programme. Elle ne fonctionne que si on implémente
			// la méthode. Elle ne fonctionne pas pour comparer des primitives

		});

		System.out.println(penguins);

		// Penguin emptyName = new Penguin("", 54);
		// doit renvoyer le message d'erreur défini dans Penguin.java dans le
		// cas où le name n'est pas renseigné
		// System.out.println("My penguin has an empty name");

		// Penguin p5 = new Penguin("");
		// doit renvoyer le message d'erreur défini dans Penguin.java dans le
		// cas où le name n'est pas renseigné
		// System.out.println(p5);

		Emperor napoleon = new Emperor("Napoleon");
		System.out.println(napoleon);
		napoleon.slide();
		napoleon.slide(kowalski);
		Emperor charlemagne = new Emperor("Charlemagne");
		charlemagne.slide(napoleon);

		System.out.println("======== Here starts the tricky bit ========");
		Penguin p = napoleon;
		p = charlemagne;
		p = napoleon;
		p.slide();

		napoleon.slide(rico); // napoleon = Emperor, rico = Penguin
		napoleon.slide(charlemagne); // napoleon = Emperor, charlemagne =
										// Emperor
		napoleon.slide(p); // napoleon = Emperor, p = Penguin
		p = charlemagne;
		napoleon.slide(p); // napoleon = Emperor, p = Penguin, même si
							// charlemagne = Emperor
		// Quand on utilise l'overloading, le système est corrompu

	}

}
