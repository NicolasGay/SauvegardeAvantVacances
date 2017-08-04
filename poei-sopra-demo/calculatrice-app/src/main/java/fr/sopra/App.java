package fr.sopra;

import fr.sopra.shared.maths.MathUtils;


public class App {
	public static void main(String[] args) {
		MathUtils mathUtils = new MathUtils();
		System.out.println("factorielle de 7 = " + mathUtils.factoriel(7));
	}
}
