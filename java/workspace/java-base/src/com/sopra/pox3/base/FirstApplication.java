package com.sopra.pox3.base;

public class FirstApplication {

	public static void main(String[] args) {

		System.out.println("Hello, world !");

		int i = 0;
		while (i < 10) {
			String text = "displaying line " + i;
			System.out.println(text);
			i++;
		}

		String string = "some text";

		String otherString = new String("some text");
		String compareString = new String("some text");

		System.out.println(otherString == compareString);
		// false : on travaille avec des pointeurs
		System.out.println(otherString.equals(compareString));
		// true : on compare les tableaux de char �l�ment par �l�ment
		String veryLastString = otherString;
		System.out.println(string.equals(veryLastString));
		// true
		System.out.println(veryLastString == string);
		// false

		String x = string + 2; // ici ce n'est pas une op�ration mais un
								// concat�nation (some text2) r�alis�e par le
								// pr�compilateur
		x = x.concat(String.valueOf(2));
		x = x.concat("Other");
		System.out.println(x);

		int a = 2;
		int b = a + 2;
		int c = a / 0; // �a compile mais �a renvoie une erreur "/ by zero". Le
						// fonctionnement de la compilation est de d'abord
						// calculer a/0 puis de le ranger dans la case m�moire
						// de c. Mais comme a/0 est un calcul qui prend un temps
						// "infini", on n'a jamais l'occasion de cr�er c
		
		
	}

}
