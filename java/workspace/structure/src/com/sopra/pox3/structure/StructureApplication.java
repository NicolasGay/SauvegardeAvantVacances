package com.sopra.pox3.structure;

//import java.util.ArrayList;
//s'affiche automatiquement quand on rentre ArrayList dans le programme avec l'autocomplétion
import java.util.Arrays; 
// s'affiche automatiquement quand on rentre "Arrays" dans le sysout avec l'autocomplétion
// va chercher le fichier java.util.Arrays; et l'importe dans la VM

public class StructureApplication {

	public static void main(String[] args)
	// main est le nom de la fonction. Comme en C, ce nom est reconnu spécifiquement par la VM.
	// la VM reçoit le fichier via un class loader, et s'il contient un main elle pourra l'éxecuter
	// la fonction main ne renvoie rien, d'où le void
	// public se réfère à un code réutilisable
	// static permet d'exécuter le programme sans créer d'objet
	// args sont les arguments du programme
	
	
	{
		System.out.println("Hello, world !" + args[0]); // on a placé "pox3" en argument dans la configuration du bouton Run
		
		String[] names = {"Jo", "Jack", "John", "Jim"};
		
		System.out.println(names); 
		// System : pour tout ce qui est en dehors de la VM (i.e. dans la "vraie" machine)
		// out : pour sortir sur un périphérique
		// print : pour imprimer à l'écran
		// ln : pour "line", le retour à la ligne
		// on peut appeler la ligne de commande System.out.println et tapant "sysout" puis [Ctrl]+[Space] pour activer l'autocomplétion
		
		// Ce "System.out.println(names);" n'affiche pas un tableau des noms mais un Hash-Code : [Ljava.lang.String;@15db9742
		// Pour afficher un tableau il faut un outil pour le parcourir d'abord

		
		System.out.println(Arrays.toString(names));
		/*names[4] = "Jane";*/
		// si on essaye de compiler à ce moment là, alors que le sysout fonctionnait sans la ligne names[4],
		// on a un message d'erreur : Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
		// c'est parce que le langage java est conçu pour qu'on ne puisse pas écraser la mémoire par mégarde
		//il faut, une fois de plus, utiliser un outil spécifique

/* ON DEPLACE CETTE PORTION DE CODE DANS UNE NOUVELLE CLASSE, SANS OUBLIER LE import EN DEBUT DE PROGRAMME
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
		// cette ligne permet de définir qu'on mettra des objets (de n(importe quelle sorte) dans le tableau
		// la ligne suivante (private int size;) permet de définir la taille
		// 
		// à partir de la ligne 457 on a la portion de code qui permet d'ajouter des éléments dans le tableau
		/////// public boolean add(E e) {
		///////      ensureCapacityInternal(size + 1);  // Increments modCount!!
		///////      elementData[size++] = e;
		///////      return true;
*/		
		

		
		
				
		
				
	}
	
}
