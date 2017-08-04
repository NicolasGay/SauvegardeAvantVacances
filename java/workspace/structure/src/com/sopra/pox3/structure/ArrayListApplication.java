package com.sopra.pox3.structure;

import java.util.ArrayList;

public class ArrayListApplication {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<>();
		// on informe qu'on cr�e une variable "nameList" r�utilisable dans la stack, et qu'il va falloir r�server un espace 
		// m�moire dans la heap pour la ranger. Il existe un cas particulier o� on a pas besoin de faire "new" : dans le cas de
		// primitives ou de cha�nes de caract�res. On remarque que contrairement au langage C, on a pas besoin de donner la taille
		// du tableau que l'on va stocker dans la heap. Java r�serve un espace m�moire, puis si le tableau est plus grand que pr�vu (o� compl�t� avec
		// des �l�ments suppl�mentaires), java r�serve un autre espace m�moire de taille adapt�e, d�place le tableau et d�salloue l'ancien
		// espace m�moire qu'occupait le tableau. Cela peut poser des probl�mes d'efficacit� si les tableau sont tr�s grands (>20000 �l�ments)
		nameList.add("Jo");
		nameList.add("Jack");
		nameList.add("Jonh");
		nameList.add("Jim");
		nameList.add("Jane"); 		// curseur sur "add", la combinaison [Ctrl]+[Space] permet d'acc�der � l'autocompl�tion
		nameList.add("Jenna"); 		// et � toutes les fonctions utilisables avec une ArrayList
		nameList.add("Jeremy"); 	// avec une aide contextuelle qui explique rapidement le fonctionnement de l'otion
		nameList.add("Jean");
		nameList.add("Janice");
		nameList.add("Josh");
		nameList.add("Jo");
		nameList.add("Jack");
		nameList.add("Jonh");
		nameList.add("Jim");
		nameList.add("Jane");
		nameList.add("Jenna");
		nameList.add("Jeremy");
		nameList.add("Jean");
		nameList.add("Janice");
		nameList.add("Jo");
		nameList.add("Jack");
		nameList.add("Jonh");
		nameList.add("Jim");
		nameList.add("Jane");
		nameList.add("Jenna");
		nameList.add("Jeremy");
		nameList.add("Jean");
		nameList.add("Janice");
		System.out.println(nameList);

	}

}
