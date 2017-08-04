package com.sopra.pox3.object;

public class People {

	String name;
	int age;
	static int maxAge = 122; // le nom de la variable est en italique parce
								// qu'elle est static. La définition de la
								// classe People se fait dans le PermGen et est
								// associée au maxAge dans la PermGen également
								// (et pas dans la Heap). Peut importe le People
								// qu'on utilise, son maxAge sera le même et
								// récupéré depuis la PermGen avec john.maxAge
								// (si on a préalablement déclaré john comme un
								// People). L'intérêt d'avoir une variable
								// statique se ressent aussi sur l'utilisation
								// de la mémoire, qui est moins sollicitée
	
	final static int maxAge2 = 122;

	public People(String name, int age) {
		super();
		this.name = name; // on peut utiliser this avec tous les attributs de la
							// classe (mais ça n'a pas de sens avec des
							// variables hors-scope qui ne sont pas des
							// attributs de la classe
		this.age = age;
	}

	int birthday() { // fonction, méthode

		if (age < 120) {
			int increment = 1; // increment = variable du scope présent
			return age + increment; // age = variable du scope du dessus
		}
		// return age + increment;
		// ne peut pas fonctionner car increment
		// n'est pas défini dans ce scope

		return -1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
