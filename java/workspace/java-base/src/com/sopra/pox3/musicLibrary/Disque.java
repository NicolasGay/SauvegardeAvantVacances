package com.sopra.pox3.musicLibrary;

import java.util.ArrayList;
import java.util.List;

public class Disque {

	private String nom;
	private String codeBarre;
	private List<Chanson> chansons = new ArrayList<>();

	public Disque(String nom, String codeBarre) {
		this.nom = nom;
		this.codeBarre = codeBarre;
	}
	
	public Disque(){}
	
	
	
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setCodeBarre(String codeBarre) {
		this.codeBarre = codeBarre;
	}

	public void setChansons(List<Chanson> chansons) {
		this.chansons = chansons;
	}

	public String getNomDisque() {
		return nom;
	}
	
	public List<Chanson> getChansons() {
		return chansons;
	}

	

	public String getCodeBarre() {
		return codeBarre;
	}


	void addChanson(Chanson chanson) {

		if(chansons.contains(chanson)){
			System.out.println("Cette chanson a déjà été ajoutée au disque !!");
		}
		
		chansons.add(chanson);
		
	}

	int getDuree() {

		int duree = 0;

		for (Chanson current : chansons) {
			duree = duree + current.getDureeChanson();

		}

		return duree;

	}

	@Override
	public String toString() {
		return "Album : " + nom + ", codeBarre :" + codeBarre;
	}
	
	

}
