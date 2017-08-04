package com.sopra.pox3.base;

public class PassageApplication {

	public static void main(String[] args) {
		int x = 3;

		System.out.println("before passage: " + x);

		new PassageApplication().passage(x); // obligatoire de passer par un new
												// car sinon il faudrait que la
												// fonction passage() soit
												// static. Avec un static void
												// on peut simplement appeler
												// passage(x) sans new

		System.out.println("after passage: " + x); // on garde la valeur 3 car
													// quand on passe une
													// primitive par une
													// fonction, on va recopier
													// la primitive./ Ce n'est
													// valable que pour la
													// primitive. Autrement dit,
													// le "x" du main() et le
													// "x" de passage() ne sont
													// pas les mêmes variables.

		Data data = new Data("abcd");
		System.out.println("before passage: " + data.value);
		passageObject(data);
		System.out.println("after passage: " + data.value); // affiche bien la
															// string modifiée
															// par la fonction,
															// car les objets ne
															// se comportent pas
															// comme les
															// primitives
	}

	void passage(int x) {
		x++;
		System.out.println("inside passage: " + x);
	}

	static void passageObject(Data data) {
		data.value += "efgh";
		System.out.println("inside passage: " + data.value);
	}
}

class Data {

	String value = "value";

	public Data(String valeur) { // généré avec clic-droit>Source>Generate
									// Constructor from Fields
		super();
		this.value = value;
	}
}