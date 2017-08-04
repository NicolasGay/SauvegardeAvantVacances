package com.sopra.pox3.madagascar;

public class Penguin extends Bird implements CanSlide, Comparable<Penguin> {

	String name;
	Integer speed = 24;
	// c'est un wrapper de int. On utilise ce wrapper pour pouvoir utiliser
	// compareTo dans MadagascarApplication qui ne fonctionne qu'avec des class
	// et pas avec des primitives

	public Penguin(String name, int speed) {

		this(name);
		// appelle le constructeur du dessous
		this.speed = speed;
	}

	public Penguin(String name) {
		if (name.isEmpty()) {
			// on utilise name et pas this.name, parce qu'à la création de la
			// classe, le this.name est toujours Empty. C'est après la création
			// du Penguin que l'on vérifie qsi on a bien renseigné le nom ou non
			throw new IllegalArgumentException("Empty name for Penguin");
		}
		this.name = name;
		// ce constructeur permet de n'appeler les Penguin que par leur nom, la
		// vitesse qui leur sera attribuée sera la vitesse par défaut définie en
		// début de classe
	}

	public void slide() {
		System.out.println("Yahou ! at " + speed + " km/h");
	}

	@Override
	public int compareTo(Penguin other) {

		return this.name.compareTo(other.name);
	}

	@Override
	public String toString() {
		return name + ", speed: " + speed;
	}

}
