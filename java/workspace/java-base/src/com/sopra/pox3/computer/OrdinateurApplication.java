package com.sopra.pox3.computer;

public class OrdinateurApplication {

	public static void main(String[] args) {

		int[] memoryCapacity = new int[] { 100, 1000 };

		Ordinateur o = new Ordinateur("Republic of Gamers", 25, memoryCapacity);

		System.out.println("===============DEMARRAGE===============");
		o.demarrer();
		System.out.println("===============ARRET===============");
		o.eteindre();

	}

}
