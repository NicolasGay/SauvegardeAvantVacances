package com.sopra.pox3.musicLibrary;

public class DisqueDejaPresentException extends Exception {

	public DisqueDejaPresentException(Disque disqueEnErreur){
		
		super("Le disque avec le Code Barre "+disqueEnErreur.getCodeBarre()+" existe déja !");
	}

	public DisqueDejaPresentException(String message) {
		super(message);
	}

}
