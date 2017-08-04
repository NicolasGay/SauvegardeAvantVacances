package com.sopra.pox3.structure;

import java.util.ArrayList;

public class ArrayListApplication {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<>();
		// on informe qu'on crée une variable "nameList" réutilisable dans la stack, et qu'il va falloir réserver un espace 
		// mémoire dans la heap pour la ranger. Il existe un cas particulier où on a pas besoin de faire "new" : dans le cas de
		// primitives ou de chaînes de caractères. On remarque que contrairement au langage C, on a pas besoin de donner la taille
		// du tableau que l'on va stocker dans la heap. Java réserve un espace mémoire, puis si le tableau est plus grand que prévu (où complété avec
		// des éléments supplémentaires), java réserve un autre espace mémoire de taille adaptée, déplace le tableau et désalloue l'ancien
		// espace mémoire qu'occupait le tableau. Cela peut poser des problèmes d'efficacité si les tableau sont très grands (>20000 éléments)
		nameList.add("Jo");
		nameList.add("Jack");
		nameList.add("Jonh");
		nameList.add("Jim");
		nameList.add("Jane"); 		// curseur sur "add", la combinaison [Ctrl]+[Space] permet d'accéder à l'autocomplétion
		nameList.add("Jenna"); 		// et à toutes les fonctions utilisables avec une ArrayList
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
