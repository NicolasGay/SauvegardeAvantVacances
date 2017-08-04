package com.sopra.pox3.structure;

public class Player implements Comparable<Player>{
	// on avait créé une classe "User"
	// pour la changer en "Player" : 
	// on place le curseur sur l'ancien nom, puis [Alt]+[Shift]+[R], on renomme et on appuie sur [Entrée]
	// Le nom de la classe change, et le nom du fichier correspondant est mis à jour en même temps
	
	// on ajoute implements Comparable<Player> pour pouvoir comparer un Player à un autre : c'est un contrat
	// cette instruction seule ne suffit pas
	// un [Ctrl] + Clic gauche dans "comparable" nous permet de voir que la fonction "Comparable" renvoie un int 	
	// On ajoute un Override compareTo en survolant "Player" et en cliquant sur la première proposition
	
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
