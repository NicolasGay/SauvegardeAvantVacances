package com.sopra.pox3.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Halobacterium extends Archaea {

	// au moment de la d�claration de Halobacterium, Eclipse renvoie une erreur
	// car Halobacterium extends Archea qui implements LivingStuff, donc
	// Halobacterium doit impl�menter tous les attributs de l'interface. On
	// clique sur Halobacterium puis "Add unimplemented methods" pour ajouter
	// tous les overrides n�cessaires. Le contenu des Overrides est �crit
	// manuellement

	@Override
	public List<? extends Halobacterium> multiply() { 
		// List<Halobacterium> children = new ArrayList<>(); pose probl�me pour
		// les assignations covariantes (voir CovariantApplication

		// List<LivingStuff> children = new ArrayList<>(); pose probl�me par ce
		// qu'avec cette syntaxe on consid�re qu'on pourrait mettre un Cat dans
		// la liste d'Ahlobacterium

		List<Halobacterium> children = new ArrayList<>();
		// fonctionne si on place un extends LivingStuff dans le multiply
		
		for (int i = 0; i < 25; i++) {
			children.add(new Halobacterium());
		}
		return children;
		// un Halobacterium est un LivingStuff, mais une List de Halobacterium
		// n'est pas forc�ment une liste de LivingStuff. C'est le ph�nom�ne de
		// covariance. Pour le compilateur, List<LivingStuff> est un type T1, et
		// List<Halobacterium> est un type T2.
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
