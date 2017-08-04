package com.sopra.pox3.autoboxing;

import java.util.Arrays;
import java.util.List;

public class AutoboxingApplication {

	public static void main(String[] args) {
		new AutoboxingApplication().init();
		new AutoboxingApplication().compare();
		new AutoboxingApplication().itsATrap();
		
		List<Boolean> list = new AutoboxingApplication().getTruths();
		System.out.println(list);
		System.out.println(list.get(0).compareTo(false));
		
	}

	public void init() {
		int x = 2;
		Integer y = 2;
		Integer z = new Integer(2);

		System.out.println(x == y);
		System.out.println(x == z);

		// Le principe de l'autoboxing est de faire cohabiter des primitives et
		// les wrappers correspondants

		z = new Integer(x); // No autoboxing, � la dure
		z = x; // Autoboxing, le compilateur le fait � notre place

	}

	void compare() {
		Integer a = new Integer(12);
		Integer b = new Integer(12);
		System.out.println(a == b);
		// renvoie false parce que le == ne permet de comparer que des
		// primitives. Ici on veut comparer des wrappers donc avec le == on
		// compare les pointeurs et ces deux pointeurs ne sont pas �gaux
		System.out.println(a.equals(b));
		// renvoie true parce qu'on ne compare par les pointeurs mais les
		// valeurs vers lesquels ils pointent
	}

	void itsATrap() {
		Integer a = 13;
		Integer b = 13;
		System.out.println(a == b);
		// renvoie true. Le compilateur fait automatiquement un new Integer(13)
		// � la d�lcaration de a, simplement parce qu'on annonce Integer a. Au
		// moment d'assigner une valeur � b, le compilateur fait un new mais
		// voit qu'il y a d�j� dans la heap un emplacement m�moire pour lequel
		// on a stock� la valeur 13, et va donc utiliser la m�me

		Integer x = 1000;
		Integer y = 1000;
		System.out.println(x == y);
		// renvoie false ! En fait on est limit� en valeur : si l'autoboxing
		// concerne un nombre compris entre -127 et 127, il le stocke dans le
		// cache et va r�utiliser le m�me emplacement m�moire pour toutes le
		// svaleurs identiques (voir cas de a et b au dessus). Pour les grands
		// Integer par contre, ils sont stock�s dans Heap � deux emplacements
		// diff�rents, et on se retrouve dans le cas o� on doit utiliser equals
		System.out.println(x.equals(y));
		// renvoie true
	}

	// Les wrappers sont utiles pour cr�er des listes (on ne peut pas faire une
	// liste de primitives
	List<Boolean> getTruths() {

		return Arrays.asList(true, false, false, true, false, true, true, false);
		// Arrays.asLists transforme des varargs (format tableau) en liste
	}
}
