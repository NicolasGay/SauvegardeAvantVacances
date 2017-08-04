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
			// on peut caster ici parce qu'on a plac� un instanceof donc on sait
			// qu'on travaille avec des Card uniquement

			if (this.value == other.value && this.color == other.color) {
				return true;
			}
			// ECRITURE EQUIVALENTE :
			// return(this.value == other.value && this.color == other.color);
		}

		return false;
		// On met un false par d�faut pour
		// 1) avoir false quand on compare une Card avec un autre objet (le if
		// instanceof est faux)
		// 2) avoir false si les deux valeurs et les deux couleurs des deux
		// cartes ne sont pas identiques (second if = false)

	}

	// REMARQUE : on peut g�n�rer l'override du equals par d�faut, et cela
	// g�n�re un code qui fonctionnera dans tous les cas (pas besoin de se
	// demander dans quels cas on doit renvoyer true et dans lequel on doit
	// renvoyer false

	// @Override public int hashCode() {
	// return 1234; 
	// }
	// le but du hashCode est de savoir plus facilement si on peut ajouter
	// un nouvel �l�ment au set. Par d�faut, quand on veut ajouter un
	// �l�ment dans un set, on compare le hashCode de cet �l�ment avec les
	// hashCode du set. Si aucun hashCode du set n'est identique, on peut
	// ajouter l'�l�ment au set (c'est bien un nouvel �l�ment). Avec cet
	// override, on fait en sorte que tous les �l�ments poss�dent le m�me
	// hashCode, donc chaque fois qu'on veut ajouter une nouvelle card dans
	// le set, on est dans le cas o� ce hashCode est d�j� pr�sent dans le
	// set. Pour savoir si on peut ajouter l'�l�ment au set, le programme
	// est oblig� de comparer 2 � 2 tous les �l�ments (un �l�ment du set vs.
	// le potentiel nouvel �l�ement) avec des equals(), et ne rajoutera
	// l'�l�ment dans le set que si tous les equals renvoie false. Ca fait
	// le job mais c'est absolument inefficace !

	// En fait, le mieux est de faire en sorte que le hashCode soit construit en
	// fonction des param�tres de Card

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + color;
		result = prime * result + value;
		return result;

		// Ici on fabrique un hashCode bas� sur les caract�ristiques de la carte
		// (couleur et valeur). Ainsi, si on a deux fois la m�me carte, leurs
		// hashCode sera �gal et donc au moment d'ajouter dans le set on pourra
		// effectivement se contenter de passer par la comparaison des
		// hashCode()
		// pour savoir si l'�l�ment est d�j� dans le set ou non
	}

	@Override
	public String toString() {
		return "" + value + color + "";
		// On est oblig�s de commencer et de terminer par des guillemets (m�me
		// vides) pour que le return soit bien au format String. Sinon, il faut
		// utiliser la syntaxe suivante:
		// String.valueOf(value) + this.color
	}

}
