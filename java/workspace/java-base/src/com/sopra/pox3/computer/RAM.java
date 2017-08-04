package com.sopra.pox3.computer;

public class RAM {

	int capacite;

	public RAM(int capacite) {
		this.capacite = capacite;
	}

	void initialiser() {

		System.out.println("Initialisation memoire : " + capacite);

	}

	void eteindre() {

		System.out.println("Extinction memoire vive");

	}

}
