package com.sopra.pox3.musicLibrary;

public class Chanson {

	private String nom;
	private int duree;
	
	
	public Chanson(String nom, int duree) {
		this.nom = nom;
		this.duree = duree;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getDureeChanson() {
		return duree;
	}


	public void setDuree(int duree) {
		this.duree = duree;
	}

	public void afficher(){
		System.out.println(nom+", durée : "+duree+" seconde(s)");
	}
	
	
	@Override
	public String toString() {
		return "Chanson : " + nom + ", duree :" + duree;
	}
	
	
	
	
}
