package com.sopra.pox3.object;

import com.sopra.pox3.encapsulation.King;

// on n'a pas le droit de construire un Emperor sans 
// lui donner de nom, car Emperor extends King et 
// que King doit avoir un nom par d�finition. Il faut
// donc g�n�rer un constructeur
public class Emperor extends King {

	public Emperor(String name) {
		super(name);

		People taleyran = new People("Taleyran", 54);
		this.command(taleyran);
		// on a ajout� un protected � la fonction command() pour pouvoir
		// utiliser command depuis un autre package, mais uniquement pour les
		// classes qui h�ritent de King
	}

	@Override // on ne met cette ligne que par "politesse" : la fonction d�finie
				// ici override automatiquement celle d�finie dans King en
				// raison des r�gles de hi�rarchie de la visibilit�
	protected void command(People p) {
		System.out.println("My friend " + p.getName() + ", please serve and do stuff");
	}
}
