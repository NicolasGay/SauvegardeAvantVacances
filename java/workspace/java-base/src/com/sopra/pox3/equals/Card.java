package com.sopra.pox3.equals;

public class Card {

	int value;
	char color;

	public Card(int value, char color) {
		this.value = value;
		this.color = color;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Card) {
			Card other = (Card) obj;
			// on peut caster ici parce qu'on a placé un instanceof donc on sait
			// qu'on travaille avec des Card uniquement

			if (this.value == other.value && this.color == other.color) {
				return true;
			}
			// ECRITURE EQUIVALENTE :
			// return(this.value == other.value && this.color == other.color);
		}

		return false;
		// On met un false par défaut pour
		// 1) avoir false quand on compare une Card avec un autre objet (le if
		// instanceof est faux)
		// 2) avoir false si les deux valeurs et les deux couleurs des deux
		// cartes ne sont pas identiques (second if = false)

	}

	// REMARQUE : on peut générer l'override du equals par défaut, et cela
	// génère un code qui fonctionnera dans tous les cas (pas besoin de se
	// demander dans quels cas on doit renvoyer true et dans lequel on doit
	// renvoyer false

	// @Override public int hashCode() {
	// return 1234; 
	// }
	// le but du hashCode est de savoir plus facilement si on peut ajouter
	// un nouvel élément au set. Par défaut, quand on veut ajouter un
	// élément dans un set, on compare le hashCode de cet élément avec les
	// hashCode du set. Si aucun hashCode du set n'est identique, on peut
	// ajouter l'élément au set (c'est bien un nouvel élément). Avec cet
	// override, on fait en sorte que tous les éléments possèdent le même
	// hashCode, donc chaque fois qu'on veut ajouter une nouvelle card dans
	// le set, on est dans le cas où ce hashCode est déjà présent dans le
	// set. Pour savoir si on peut ajouter l'élément au set, le programme
	// est obligé de comparer 2 à 2 tous les éléments (un élément du set vs.
	// le potentiel nouvel éléement) avec des equals(), et ne rajoutera
	// l'élément dans le set que si tous les equals renvoie false. Ca fait
	// le job mais c'est absolument inefficace !

	// En fait, le mieux est de faire en sorte que le hashCode soit construit en
	// fonction des paramètres de Card

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + color;
		result = prime * result + value;
		return result;

		// Ici on fabrique un hashCode basé sur les caractéristiques de la carte
		// (couleur et valeur). Ainsi, si on a deux fois la même carte, leurs
		// hashCode sera égal et donc au moment d'ajouter dans le set on pourra
		// effectivement se contenter de passer par la comparaison des
		// hashCode()
		// pour savoir si l'élément est déjà dans le set ou non
	}

	@Override
	public String toString() {
		return "" + value + color + "";
		// On est obligés de commencer et de terminer par des guillemets (même
		// vides) pour que le return soit bien au format String. Sinon, il faut
		// utiliser la syntaxe suivante:
		// String.valueOf(value) + this.color
	}

}
