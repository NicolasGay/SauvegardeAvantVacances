package com.sopra.pox3.base;

import java.math.BigDecimal;

public class PrimitiveApplication {

	public static void main(String[] args) {

		int x = 10; // occupe 32 bits en m�moire
		byte y = 10; // occupe 8 bits en m�moire.... attention byte y = 234637
						// ne fonctionne pas du coup !
		// long z = 100_000_000_000; // un long occupe 64 bits. on ne peut pas
		// rentrer une valeur aussi grande. Le
		// message d'erreur renvoie cependant un
		// "out of range" pour "type int", or on
		// veut un long ! En r�alit�, le compilateur
		// stocke d'abord la valeur en m�moire, puis
		// l'attribue � la primitive cr��e. Du coup
		// on stocke d'abord comme un int, avant de
		// se rendre compte que c'est un long.

		long a = 100;
		// int b = a; // �a ne marche pas parce qu'un long est cod� sur plus de
		// bits qu'un int. Si on veut vraiment changer le type de
		// primitivbe il faut caster avec la syntaxe int b = (int) a

		float f = 12;
		f = 2.34f; // sans le f on a en fait un double
		double d = 12.87878787874454465446464546464648734544; // �a rentre mais
																// attention aux
																// calculs avec
																// des nombres �
																// virgule, car
																// la gestion de
																// la pr�cision
																// est difficile
																// c�t� m�moire
		BigDecimal bigDecimal = new BigDecimal(
				"-12.45641321216451321654163658463516999999999999999935412361221065421653421");
		System.out.println(bigDecimal);

		char c = 'x';

		boolean vrai = false;

		boolean test = !(3 > 2 && (c != 'x') || 2 > 3); // true : avec le &&, si
														// l'un des deux termes
														// est faux, le
														// programme ne vas pas
														// chercher plus loin
		boolean test2 = !(3 > 2 & (c != 'x') || 2 > 3); // true : avec le simple
														// &, si l'un des deux
														// termes est faux, le
														// programme v�rifie
														// quand m�me si le
														// second terme est true
														// ou false

		y = 8;
		int move = y >> 1; // la valeur de y>>1 est true, mais on la rande dans
							// un int
		System.out.println(move); // le syso affiche 4 ! cela vient du
									// fonctionnement du clacul en binaire ! on
									// pousse (>>) le 8 du y (1000 en binaire)
									// de 1 vers la gauche. On se retrouve avec
									// 100 en binaire, soit 4
		move = y << 1;
		System.out.println(move); // on affiche 16 car on pousse (<<) vers la
									// droite le 8 (1000) du y pour arriver � 16
									// (10000)
		
		

	}

}
