package com.sopra.pox3.inheritance;

public class Eukarya extends Object {
	// extends Object est implicite à la compilation, on l'a ajouté pour raisons
	// pédagogiques

	String cell = "cell";

	String getCell() {
		return cell;
	}

	public Eukarya() {
		super(); // pour utiliser le constructeur de Object
		System.out.println("Creating eukarya");
	}
}
