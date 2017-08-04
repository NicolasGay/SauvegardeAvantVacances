package com.sopra.pox3.structure;

public class Player implements Comparable<Player>{
	// on avait cr�� une classe "User"
	// pour la changer en "Player" : 
	// on place le curseur sur l'ancien nom, puis [Alt]+[Shift]+[R], on renomme et on appuie sur [Entr�e]
	// Le nom de la classe change, et le nom du fichier correspondant est mis � jour en m�me temps
	
	// on ajoute implements Comparable<Player> pour pouvoir comparer un Player � un autre : c'est un contrat
	// cette instruction seule ne suffit pas
	// un [Ctrl] + Clic gauche dans "comparable" nous permet de voir que la fonction "Comparable" renvoie un int 	
	// On ajoute un Override compareTo en survolant "Player" et en cliquant sur la premi�re proposition
	
	String name;
	
	@Override
	public String toString() {
		
		return name;
	}

	@Override
	public int compareTo(Player other) {
		
		return name.compareTo(other.name);
	}
}
