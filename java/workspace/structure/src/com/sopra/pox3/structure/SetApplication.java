package com.sopra.pox3.structure;

import java.util.TreeSet;

public class SetApplication {

	public static void main(String[] args) {
		
		//HashSet<String> names = new HashSet<>(); 		// triés par Hash code
		TreeSet<String> names = new TreeSet<>();  		// triés par ordre alphabétique
		// Un TreeSet et un Set dans lequel on peut naviguer (NavigableSet). 
		// Ce NavigableSet est un SortedSet particulier (on le voit en [Ctrl]+cliquant sur ces noms de fonction
		
	
		

		
		names.add("Jo");
		names.add("Jack");
		names.add("Jonh");
		names.add("Jim");
		names.add("Jane"); 		
		names.add("Jenna"); 		
		names.add("Jeremy"); 	
		names.add("Jean");
		names.add("Janice");
		names.add("Josh");
		names.add("Jo");
		names.add("Jack");
		names.add("Jonh");
		names.add("Jim");
		names.add("Jane");
		names.add("Jenna");
		names.add("Jeremy");
		names.add("Jean");
		names.add("Janice");
		names.add("Jo");
		names.add("Jack");
		names.add("Jonh");
		names.add("Jim");
		names.add("Jane");
		names.add("Jenna");
		names.add("Jeremy");
		names.add("Jean");
		names.add("Janice");
		System.out.println(names);
		// n'affiche pas les doublons du set : tous les éléments sont uniques, contrairement au ArrayList

	}

}
