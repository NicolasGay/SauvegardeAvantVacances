package com.sopra.pox3.garbage;

import java.util.ArrayList;
import java.util.List;

public class GarbageApplication {

	public static void main(String[] args) throws InterruptedException {

		List<Bag> list = new GarbageApplication().init();
		System.gc();
		// pour appeler le Garbage Collector avant le sleep de 30 secondes
		Thread.sleep(30_000);

		System.out.println(list);
	}

	public List<Bag> init() throws InterruptedException {

		// Random random = new Random();
		List<Bag> allBags = new ArrayList<>();
		new Bag(-1);
		// on cr�e un Bag qui n'est rattach� � aucun objet (ne rentre pas dans
		// l'ArrayList) donc quand le Garbage Collector va passer, c'est le seul
		// �l�ment qui sera �limin�, tous les autres bags �tant rattach�s �
		// l'objet allBags

		for (int i = 0; i < 1_000; i++) {
			Thread.sleep(3);

			allBags.add(new Bag(i));
		}

		return allBags;

	}

}
