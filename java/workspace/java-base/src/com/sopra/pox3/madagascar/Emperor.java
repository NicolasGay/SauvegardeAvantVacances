package com.sopra.pox3.madagascar;

public class Emperor extends Penguin {

	public Emperor(String name) {
		super(name, 28);
	}

	@Override
	// cette ligne override n'est pas n�cessaire au bon fonctionnement du
	// programme, mais c'est bien de le laisser pour avoir une indication qu'on
	// a overrider une m�thode existante
	public void slide() {

		System.out.println("Yeah !");

	}

	public void slide(Penguin p) {

		System.out.println("Yeah ! " + p.name);
		// On imagine que l'emperor peut glisser avec un penguin sur son dos. On
		// veut le faire afficher par la fonction slide() avec un Penguin en
		// argument. On cr�� donc la nouvelle fonction (qui n'override rien
		// puisqu'elle ne fait pas la m�me chose) mais on ne change pas son nom
		// "slide" : c'est de l'overloading !
	}

	public void slide(Emperor e) {
		System.out.println("You're too heavy ! " + e.name);
	}

}
