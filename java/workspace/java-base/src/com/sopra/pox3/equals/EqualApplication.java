package com.sopra.pox3.equals;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class EqualApplication {

	public static void main(String[] args) {

		Card c1 = new Card(8, 'h');
		Card c2 = new Card(8, 's');
		Card c3 = new Card(8, 'h');

		System.out.println(c1.equals(c2)); // false
		System.out.println(c1.equals(c3)); // true
		// Par d�faut, equals() v�rifie si les deux pointeurs sont identiques.On
		// voudrait que la fonction equals() compare les cartes comme on le
		// ferai "dans la vraie vie" => Overrider la m�thode equals() des Card.
		// Cet Override n'est valable que dans le cas o� on compare des Card. Si
		// on voulait comparer d'autres objets, le equals() pour comparer ces
		// objets ne serait pas affect�, parce qu'on a plac� l'override dans la
		// class Card.

		Set<Card> set = new HashSet<>();
		// On ne peut pas �crire new Set<>() parce que Set est une interface :
		// il faut n�cessairement pr�ciser le type de Set. Le HashSet est le Set
		// par d�faut

		Collections.addAll(set, c1, c2, c3);
		// EQUIVALENT (mais plus rapide) A :
		// set.add(c1);
		// set.add(c2);
		// set.add(c3);
		System.out.println(set);
		// Par d�faut, on a 2 fois 8h. Or le principe d'un set est de n'�tre
		// compos� que d'�l�ments uniques. En fait c'est normal : set est un
		// HashSet et utilise donc les HashCodes. Donc dans un HashSet, deux
		// �l�ments ne peuvent �tre consid�r�s comme identiques que si ils
		// poss�dent le m�me HashCode ! Il faut donc une fois de plus overrider
		// la m�thode hashCode() dans la class card pour voir le syso attendu

	}

}
