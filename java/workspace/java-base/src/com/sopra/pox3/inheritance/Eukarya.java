package com.sopra.pox3.inheritance;

public class Eukarya extends Object {
	// extends Object est implicite � la compilation, on l'a ajout� pour raisons
	// p�dagogiques

	String cell = "cell";

	String getCell() {
		return cell;
	}

	public Eukarya() {
		super(); // pour utiliser le constructeur de Object
		System.out.println("Creating eukarya");
	}
}
