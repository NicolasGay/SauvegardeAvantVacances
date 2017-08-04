package com.sopra.pox3.encapsulation;

import java.util.List;

import com.sopra.pox3.object.People;

public class King {
	String name;

	public King(String name) {
		this.name = name;
	}

	public void commandAll(List<People> allPeople) {
		// fonction publique pour commander un groupe de People. Mais m�me si la
		// fonction est publique (donc utilisable par n'importe qui depuis
		// n'importe o�), elle fait quand m�me appel � la fonction command() qui
		// elle est protected, donc utilisable uniquement par King et les
		// classes h�riti�res de King
		allPeople.stream().forEach(this::command);
	}

	protected void command(People p) {
		System.out.println("Hey, " + p.getName() + ": do stuff");
	}

}
