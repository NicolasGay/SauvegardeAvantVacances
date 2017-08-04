package com.sopra.pox3.computer;

public class DisqueDur {

	int capacite;

	public DisqueDur(int capacite) {
		this.capacite = capacite;
	}

	void demarrer() {

		System.out.println("Demarrage disque : " + capacite);

	}

	void lire() {
		System.out.println("Lecture sur disque dur : " + capacite+" Go");
	}

	void eteindre() {

		System.out.println("Extinction disque dur : " + capacite +" Go");

	}

}
