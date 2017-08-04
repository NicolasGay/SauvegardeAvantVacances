package com.sopra.pox3.object;

public class People {

	String name;
	int age;
	static int maxAge = 122; // le nom de la variable est en italique parce
								// qu'elle est static. La d�finition de la
								// classe People se fait dans le PermGen et est
								// associ�e au maxAge dans la PermGen �galement
								// (et pas dans la Heap). Peut importe le People
								// qu'on utilise, son maxAge sera le m�me et
								// r�cup�r� depuis la PermGen avec john.maxAge
								// (si on a pr�alablement d�clar� john comme un
								// People). L'int�r�t d'avoir une variable
								// statique se ressent aussi sur l'utilisation
								// de la m�moire, qui est moins sollicit�e
	
	final static int maxAge2 = 122;

	public People(String name, int age) {
		super();
		this.name = name; // on peut utiliser this avec tous les attributs de la
							// classe (mais �a n'a pas de sens avec des
							// variables hors-scope qui ne sont pas des
							// attributs de la classe
		this.age = age;
	}

	int birthday() { // fonction, m�thode

		if (age < 120) {
			int increment = 1; // increment = variable du scope pr�sent
			return age + increment; // age = variable du scope du dessus
		}
		// return age + increment;
		// ne peut pas fonctionner car increment
		// n'est pas d�fini dans ce scope

		return -1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
