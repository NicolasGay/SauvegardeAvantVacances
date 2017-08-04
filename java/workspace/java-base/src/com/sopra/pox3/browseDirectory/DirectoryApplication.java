package com.sopra.pox3.browseDirectory;

import java.io.File;

public class DirectoryApplication {

	public static void main(String[] args) {

		System.out.println("######################################################### ON FOURNIT EN ENTREE LE CHEMIN D'UN FICHIER ##########################################################\n");
		new DirectoryApplication().parcourirRepertoire(
				"C:\\code\\java\\workspace\\java-base\\bin\\com\\sopra\\pox3\\browseDirectory\\fichiers texte\\FichierTexte1.txt");
		
		System.out.println("\n\n\n\n\n");
		
		System.out.println("################################# ON FOURNIT EN ENTREE LE CHEMIN D'UN REPERTOIRE, CONTENANT UN SOUS-REPERTOIRE ET DES FICHIERS #################################\n");
		new DirectoryApplication().parcourirRepertoire(
				"C:\\code\\java\\workspace\\java-base\\bin\\com\\sopra\\pox3\\browseDirectory\\fichiers texte");

	}

	void parcourirRepertoire(String path) {

		// afficher le chemin absolu
		System.out.print("\tLe chemin du fichier est : ");
		System.out.println(path);

		// ouvrir un File sur le chemin
		File file = new File(path);

		// si File est un fichier, on s'arrête
		if(file.isFile()){
			
		}else{
			// si File est un répertoire
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.print("Le dernier chemin que l'application a traité est en fait celui d'un répertoire ! ");
			System.out.println("L'application va ouvrir ce répertoire et lister les chemins des fichiers qu'il contient");
			
			//////// lister les sous-fichiers
			File[] files = file.listFiles();
			//////// les parcourir
			for(File f : files){
				parcourirRepertoire(f.getAbsolutePath());
			}
			System.out.print("Ce répertoire a été parcouru. ");
			System.out.println("------------------------------------------------------------------------------------------------");
			
			
			
		}

		
	}

}
