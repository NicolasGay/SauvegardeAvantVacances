package com.sopra.pox3.musicLibrary;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

public class BibliothequeApplication {

	public static void main(String[] args) throws DisqueDejaPresentException, IOException{
		
		/*
		Disque disque = new Disque("Black Bird", UUID.randomUUID().toString());

		disque.addChanson(new Chanson("Black Bird", 9 * 60 + 28));
		disque.addChanson(new Chanson("Russia", 5 * 60 + 31));
		disque.addChanson(new Chanson("Clean The House", 4 * 60 + 14));
		disque.addChanson(new Chanson("Silver And Gold", 6 * 60 + 11));
		disque.addChanson(new Chanson("Bones", 7 * 60 + 32));
		disque.addChanson(new Chanson("Soldier", 6 * 60 + 37));
		disque.addChanson(new Chanson("Never Moving", 8 * 60));
		disque.addChanson(new Chanson("Mother Mother", 8 * 60 + 59));
		disque.addChanson(new Chanson("Bohannon", 7 * 60 + 20));

		Disque disc = new Disque("Based On A True Story", UUID.randomUUID().toString());

		disc.addChanson(new Chanson("Ernie", 7 * 60 + 17));
		disc.addChanson(new Chanson("Cay's Crays", 7 * 60 + 7));
		disc.addChanson(new Chanson("This Room", 5 * 60 + 1));
		disc.addChanson(new Chanson("Ray Ray", 7 * 60 + 39));
		disc.addChanson(new Chanson("Dark Days", 6 * 60 + 40));
		disc.addChanson(new Chanson("Flashback", 6 * 60 + 31));
		disc.addChanson(new Chanson("Roady", 7 * 60 + 10));
		disc.addChanson(new Chanson("Wandering Eye", 9 * 60 + 50));
		disc.addChanson(new Chanson("Del Fuego", 5 * 60 + 25));
		disc.addChanson(new Chanson("Hope", 7 * 60 + 31));
		*/
		
		
		// int dureeDisque = disque.getDuree();
		// System.out.println("La durée du disque "+disque.getNomDisque()+" est,
		// au total, de "+dureeDisque+" secondes.");
		//
		//
		Bibliotheque bibliAudio = new Bibliotheque();
		//bibliAudio.ajouterDisque(disque);
		//bibliAudio.ajouterDisque(disc);
		//
		// Disque query = new Disque();
		// query = bibliAudio.getDisque("AZERTY");
		// System.out.println(query);
		//
		// List<Disque> queryDiscList = new ArrayList<>();
		// queryDiscList = bibliAudio.rechercherDisques("as");
		// System.out.println(queryDiscList);
		//
		// List<Chanson> querySongList = new ArrayList<>();
		// querySongList = bibliAudio.rechercherChansons("ol");
		// System.out.println(querySongList);

		String choix = "A";
		
		
		while(!choix.equals("")){
			
			new BibliothequeApplication().menu();
			choix = Saisie.saisie("QUE VOULEZ VOUS FAIRE ? [1,2,3,4,5,6,7 ou 8]");
			
			switch (choix) {
			case "1":
				bibliAudio.afficherDisques();
				break;

			case "2":
				String searchedCodeBarre = Saisie.saisie("Entrez le code barre du disque dont vous souhaitez connaître la liste de chansons");
				Disque d = new Disque();
				d = bibliAudio.getDisque(searchedCodeBarre);
				
				for(Chanson current : d.getChansons()){
					current.afficher();
				}

				break;

			case "3":
				String searchedSongName = Saisie.saisie("Entrez tout ou une partie du nom de la chanson");
				List<Chanson> list = bibliAudio.rechercherChansons(searchedSongName);
				System.out.println(list);
				break;

			case "4":
				String removeCodeBarre = Saisie
						.saisie("Entrez le code barre du disque que vous souhaitez retirer de la bibliothèque");
				Disque removedDisc = new Disque();
				removedDisc = bibliAudio.getDisque(removeCodeBarre);

				if (bibliAudio.retirerDisque(removeCodeBarre)) {
					System.out.println("Le disque " + removedDisc.getNomDisque() + ", portant le code barre "
							+ removeCodeBarre + "a bien été retiré de la bibliothèque.");
				} else {
					System.out.println(
							"Aucun disque de la bibliothèque ne porte ce code barre, ou le disque n'a pas pu être retiré");
				}
				
				break;
			case "5":
				Disque addedDisc = new Disque();

				String title = Saisie.saisie("Quel est le titre du disque que vous souhaitez ajouter ?");
				addedDisc.setNom(title);
				addedDisc.setCodeBarre(UUID.randomUUID().toString());
			
				String addSongs = Saisie.saisie("Voulez-vous ajouter une nouvelle chanson ? [Y, N]");

				while (addSongs.equals("Y")) {

					String songTitle = Saisie.saisie("Quel est le titre de la chanson à ajouter ?");
					String songDuration = Saisie.saisie("Quelle est la durée (en sec) de la chanson ?");
					Chanson addedSong = new Chanson(songTitle, Integer.parseInt(songDuration));

					addedDisc.addChanson(addedSong);

					addSongs = Saisie.saisie("Voulez-vous ajouter une nouvelle chanson ? [Y, N]");

				}try{
					bibliAudio.ajouterDisque(addedDisc);
					System.out.println("L'ajout du nouveau disque a bien été effectué");
				}catch(DisqueDejaPresentException e){
					System.out.println("Impossible d'ajouter le disque");
				}
				
				
				
				break;
			case "6":
				System.out.println("La sauvegarde de votre bibliothèque est en cours...");
				bibliAudio.saveLibraryInFile();
				break;
				
			case "7":
				System.out.println("L'application charge la bibliothèque sauvegardée...");
				bibliAudio.loadFile();
				break;				

			case "8":
				System.exit(0);

			default:
				break;
			}
			
		}
		
		

	}

	void menu(){
		
		System.out.println("");
		System.out.println("");
		System.out.println("BIENVENUE DANS L'APPLICATION DE GESTION DE VOTRE MUSIQUE");
		System.out.println("1) Obtenir la liste des disques de votre bibliothèque, ainsi que leurs codes barres respectifs");
		System.out.println("2) Obtenir la liste des chansons d'un disque dont vous connaissez le code barre");
		System.out.println("3) Rechercher toutes les chansons contenant une liste de caractères donnée");
		System.out.println("4) Retirer un disque de votre bibliothèque, à partir de son code barre");
		System.out.println("5) Ajouter un disque à votre bibliothèque");
		System.out.println("6) Sauvegarder votre bibliothèque dans un fichier");
		System.out.println("7) Charger une bibliothèque depuis un fichier");
		System.out.println("8) Quitter l'application");
		System.out.println("");
		
	
	}
	
}