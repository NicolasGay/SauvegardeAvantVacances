package com.sopra.pox3.structure;

//import java.util.ArrayList;
//s'affiche automatiquement quand on rentre ArrayList dans le programme avec l'autocompl�tion
import java.util.Arrays; 
// s'affiche automatiquement quand on rentre "Arrays" dans le sysout avec l'autocompl�tion
// va chercher le fichier java.util.Arrays; et l'importe dans la VM

public class StructureApplication {

	public static void main(String[] args)
	// main est le nom de la fonction. Comme en C, ce nom est reconnu sp�cifiquement par la VM.
	// la VM re�oit le fichier via un class loader, et s'il contient un main elle pourra l'�xecuter
	// la fonction main ne renvoie rien, d'o� le void
	// public se r�f�re � un code r�utilisable
	// static permet d'ex�cuter le programme sans cr�er d'objet
	// args sont les arguments du programme
	
	
	{
		System.out.println("Hello, world !" + args[0]); // on a plac� "pox3" en argument dans la configuration du bouton Run
		
		String[] names = {"Jo", "Jack", "John", "Jim"};
		
		System.out.println(names); 
		// System : pour tout ce qui est en dehors de la VM (i.e. dans la "vraie" machine)
		// out : pour sortir sur un p�riph�rique
		// print : pour imprimer � l'�cran
		// ln : pour "line", le retour � la ligne
		// on peut appeler la ligne de commande System.out.println et tapant "sysout" puis [Ctrl]+[Space] pour activer l'autocompl�tion
		
		// Ce "System.out.println(names);" n'affiche pas un tableau des noms mais un Hash-Code : [Ljava.lang.String;@15db9742
		// Pour afficher un tableau il faut un outil pour le parcourir d'abord

		
		System.out.println(Arrays.toString(names));
		/*names[4] = "Jane";*/
		// si on essaye de compiler � ce moment l�, alors que le sysout fonctionnait sans la ligne names[4],
		// on a un message d'erreur : Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
		// c'est parce que le langage java est con�u pour qu'on ne puisse pas �craser la m�moire par m�garde
		//il faut, une fois de plus, utiliser un outil sp�cifique

/* ON DEPLACE CETTE PORTION DE CODE DANS UNE NOUVELLE CLASSE, SANS OUBLIER LE import EN DEBUT DE PROGRAMME
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
		// REMARQUE : [Ctrl]+clic gauche sur une fonction JAVA permet d'ouvrir le code source de ladite fonction
		// Dans le code source de ArrayList on trouve notamment la ligne ---> transient Object[] elementData;
		// cette ligne permet de d�finir qu'on mettra des objets (de n(importe quelle sorte) dans le tableau
		// la ligne suivante (private int size;) permet de d�finir la taille
		// 
		// � partir de la ligne 457 on a la portion de code qui permet d'ajouter des �l�ments dans le tableau
		/////// public boolean add(E e) {
		///////      ensureCapacityInternal(size + 1);  // Increments modCount!!
		///////      elementData[size++] = e;
		///////      return true;
*/		
		

		
		
				
		
				
	}
	
}
