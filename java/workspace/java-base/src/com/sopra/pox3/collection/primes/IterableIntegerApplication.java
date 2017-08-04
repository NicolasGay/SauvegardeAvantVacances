package com.sopra.pox3.collection.primes;

import java.util.Iterator;

public class IterableIntegerApplication {

	public static void main(String[] args) {

		IterableInteger iterable = new IterableInteger();
		Iterator<Integer> it = iterable.iterator();
		
		/*
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		*/
		
		// on regarde s'il y a un suivant. tant qu'il y a un suivant, on
		// l'affiche. Ce type d'itérateur est un design pattern en
		// programmation
		
		// ECRITURE EQUIVALENTE
		//fonctionne tant qu'on est itérable où qu'on a un tableau
		for(Integer i:iterable){
			System.out.println(i);
		}
		
		
		IterablePrime prime = new IterablePrime();
		for(Integer p:prime){
			System.out.println(p);
		}
		
	}

}
