package com.sopra.pox3.inheritance;

import java.util.Arrays;
import java.util.List;

public class CovariantApplication {

	public static void main(String[] args) {

		Halobacterium b1 = new Halobacterium();
		Halobacterium b2 = new Halobacterium();
		Halobacterium b3 = new Halobacterium();
		Halobacterium[] bactos = { b1, b2, b3 };

		Cat cat = new Cat();
		// bactos[0] = cat; ne fonctionne pas car on a défini bactos comme étant
		// un tableau de Halobacterium, or Cat est un LivingStuff mais pas un
		// Halobacterium

		LivingStuff[] stuffs = { cat, b1, b2 };

		System.out.println(Arrays.toString(bactos));
		System.out.println(Arrays.toString(stuffs));

		stuffs = bactos;
		// bactos est un tableau de Halobacterium, stuff est un
		// tablmeau de LivingStuff...et comme Halobacterium
		// est un LivingStuff, ça marche
		stuffs[0] = cat;

		System.out.println(Arrays.toString(stuffs));
		// renvoie une erreur de type Exception. Les tableaux, contrairement aux
		// Listes, sont covariants. En faisant stuffs = bactos; on ne déplace
		// pas le contenu de bactos dans stuffs, on ne fait que déplacer le
		// pointeur ! L'assignation covariante empêche alors de placer un Cat
		// dans stuffs car stuffs pointe maintenant vers bactos qui est un
		// tableau de Halobacterium

	}

}

class Cat implements LivingStuff {

	@Override
	public List<LivingStuff> multiply() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}

	@Override
	public void die() {
		// TODO Auto-generated method stub

	}

}