package com.sopra.pox3.array;

import java.util.Arrays;

public class ArrayApplication {

	public static void main(String[] args) {

		int[] ints = new int[3]; // on r�serve en m�moire 3*32 bits
		ints[0] = 121;
		// on affecte la valeur 121 � la premi�re case du tableau ints
		System.out.println(ints);
		// renvoie [I@15db9742 : [I pour un tableau de int, puis le hash code
		System.out.println(Arrays.toString(ints));
		// renvoie le tableau sous forme de cha�ne de caract�res

		int[] fasterInts = { 3, 45, 10 };
		System.out.println(Arrays.toString(fasterInts));

		int[][] strangeMatrix = { { 2, 3, 4 }, { 34, 2, 45 }, { 3, 4, 5, 6, 7, 18 } };
		// On remarque que quand on fait une matrice (tableau de tableaux),
		// tous les tableaux ne sont pas n�cessairement de la m�me taille pour
		// que �a fonctionne !
		System.out.println(Arrays.toString(strangeMatrix));
		// affiche le hash code ! on a fait un tableauy de tableaux donc on
		// affiche sous forme de texte le contenu du tableau principal,
		// contenant les hash codes des 3 tableaux int�rieurs. Pour que toutes
		// les valeurs de la matrice soient affich�es sous forme texte, il faut
		// utiliser un double for pour traiter chaque tableau individuellement
		strangeMatrix[1] = new int[] { 3, 6, 4, 9, 1, 2, 7, 987, 34 };
		// �a fonctionne parce que la taille des tableaux dans la matrice n'est
		// pas fixe (on ne travaille qu'avec des pointeurs en Java, � moins de
		// le pr�ciser dans le code

		for (int i = 0; i < fasterInts.length; i++) {
			System.out.println(fasterInts[i]);
		}

		for (int content : fasterInts) {
			System.out.println(content);
		}
		// les deux syntaxes fonctionnent de la m�me mani�re. La seconde est
		// appel�e "for each". Attention � ne pas confondre avec l'option
		// forEach de certaines fonctions java.
		
		for(int[] column:strangeMatrix){
			for(int cell:column){
				System.out.print(cell+" - ");
			}
			System.out.println();
		}
		// pour afficher la matrice sous forme "� peu pr�s matricielle"

	}

}
