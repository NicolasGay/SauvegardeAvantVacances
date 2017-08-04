package com.sopra.pox3.object;

import com.sopra.pox3.encapsulation.King;

// on n'a pas le droit de construire un Emperor sans 
// lui donner de nom, car Emperor extends King et 
// que King doit avoir un nom par définition. Il faut
// donc générer un constructeur
public class Emperor extends King {

	public Emperor(String name) {
		super(name);

		People taleyran = new People("Taleyran", 54);
		this.command(taleyran);
		// on a ajouté un protected à la fonction command() pour pouvoir
		// utiliser command depuis un autre package, mais uniquement pour les
		// classes qui héritent de King
	}

	@Override // on ne met cette ligne que par "politesse" : la fonction définie
				// ici override automatiquement celle définie dans King en
				// raison des règles de hiérarchie de la visibilité
	protected void command(People p) {
		System.out.println("My friend " + p.getName() + ", please serve and do stuff");
	}
}
