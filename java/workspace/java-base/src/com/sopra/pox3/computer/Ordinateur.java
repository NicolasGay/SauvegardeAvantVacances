package com.sopra.pox3.computer;

public class Ordinateur {

	String modele;
	RAM memoireVive;
	DisqueDur[] disquesDurs;

	public Ordinateur(String modele, int capaciteMemoire, int[] capaciteDisquesDurs) {
		this.modele = modele;
		this.memoireVive = new RAM(capaciteMemoire);
		this.disquesDurs = new DisqueDur[capaciteDisquesDurs.length];

		for (int i = 0; i < capaciteDisquesDurs.length; i++) {
			disquesDurs[i] = new DisqueDur(capaciteDisquesDurs[i]);
		}

	}

	void demarrer() {
		System.out.println("L'ordinateur " + modele + " demarre...");

		memoireVive.initialiser();

		for (DisqueDur current : disquesDurs) {
			current.demarrer();
		}

		for (int i = 0; i < disquesDurs.length; i++) {
			disquesDurs[i].lire();
		}

	}

	void eteindre() {
		System.out.println("Extinction disques durs");

		for (int i = disquesDurs.length - 1; i >= 0; i--) {
			disquesDurs[i].eteindre();
		}

		System.out.println("Les disques sont éteints");

		memoireVive.eteindre();

		System.out.println("Ordinateur " + modele + " eteint");

	}

}
