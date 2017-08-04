package com.sopra.pox3.object;

import java.util.Arrays;

import com.sopra.pox3.encapsulation.Queen;

public class PeopleApplication {

	public static void main(String[] args) {
		People john = new People("John", 12);
		People jack = new People("Jack", 14);
		System.out.println(john.maxAge);
		System.out.println(jack.maxAge);
		// les deux maxAge sont les mêmes car on a créé dans la class People
		// comme des static. On remarque cependant dans la marge qu'il y a des
		// warnings, et que maxAge est en italique. Cela vient du fait qu'on ne
		// sait pas si maxAge est défini sur john, jack ou People. Pour la
		// variable statique, on préfèrera la syntaxe suivante :
		System.out.println(People.maxAge); // il n'y a pas de warning pour cette
											// syntaxe
		People.maxAge++;
		System.out.println(People.maxAge); // affiche 123

		// System.out.println(People.maxAge2);
		// People.maxAge2++;
		// System.out.println(People.maxAge2); // ça ne marche pas parce que la
		// // variable maxAge2 est final, donc
		// // non modifiable

		final People ada = new People("Ada", 30);
		ada.name = "Lovelace";
		System.out.println(ada.name); // fonctionne car ce n'est pas le name
										// "Ada" qui est final, c'est l'objet
										// ada. Par exemple, on ne pourra pas
										// écrire ada=jack pour attribuer les
										// caractéristiques de jack à ada

		Queen liza = new Queen("Elizabeth");
		// liza.name = "Liz";
		// // ne fonctionne pas, parce que PeopleApplication et
		// // la class Queen ne sont pas dans le même package.
		// // Si on veut que les classes de packages différents
		// // se connaissent entre elles, il faut d'une part
		// // que la classe soit public, et que ses attributs
		// // soient puiclic également. Mais ce n'est pas une
		// // bonne idée que l'on puisse modifier le nom de la
		// // reine. Par contre, on voudrait au moins connaître
		// // le nom de la reine depuis un autre package : on
		// // fait pour cela appel aux getters et setters dans
		// // la classe pour laquelle on souhaite accéder aux
		// // attributs. Pour lire (sans modifier) le nom de la
		// // reine, on utilise alors la syntaxe suivante
		System.out.println(liza.getName());

		Emperor napoleon = new Emperor("Napoleon");
		napoleon.commandAll(Arrays.asList(john, jack));

	}

}
