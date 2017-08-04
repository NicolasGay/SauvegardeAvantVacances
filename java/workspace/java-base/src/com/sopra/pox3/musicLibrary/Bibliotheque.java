package com.sopra.pox3.musicLibrary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {

	private List<Disque> listDisc = new ArrayList<>();

	public List<Disque> getListDisc() {
		return listDisc;
	}

	public void setListDisc(List<Disque> listDisc) {
		this.listDisc = listDisc;
	}

	void ajouterDisque(Disque disque) throws DisqueDejaPresentException {

		if (listDisc.contains(disque)) {
			throw new DisqueDejaPresentException(disque);
		} else {
			listDisc.add(disque);
		}

	}

	boolean retirerDisque(String codeBarre) {

		for (int i = 0; i < listDisc.size(); i++) {

			if (listDisc.get(i).getCodeBarre().equals(codeBarre)) {
				listDisc.remove(i);
				return true;
			}

		}

		return false;

	}

	int getNbDisques() {

		return listDisc.size();

	}

	Disque getDisque(String codeBarre) {

		for (int i = 0; i < listDisc.size(); i++) {

			if (listDisc.get(i).getCodeBarre().equals(codeBarre)) {
				return listDisc.get(i);
			}

		}

		return null;

	}

	List<Disque> rechercherDisques(String recherche) {

		List<Disque> searchedDiscs = new ArrayList<>();

		for (int i = 0; i < listDisc.size(); i++) {

			if (listDisc.get(i).getNomDisque().contains(recherche))
				searchedDiscs.add(listDisc.get(i));

		}

		return searchedDiscs;
	}

	List<Chanson> rechercherChansons(String recherche) {

		List<Chanson> allSongs = new ArrayList<>();
		List<Chanson> searchedChansons = new ArrayList<>();

		for (int i = 0; i < listDisc.size(); i++) {

			for (int j = 0; j < listDisc.get(i).getChansons().size(); j++) {
				allSongs.add(listDisc.get(i).getChansons().get(j));
			}
		}

		for (int k = 0; k < allSongs.size(); k++) {

			if (allSongs.get(k).getNom().contains(recherche))
				searchedChansons.add(allSongs.get(k));

		}

		return searchedChansons;

	}

	void afficherDisques() {

		System.out.println("Votre biblioth�que contient " + this.getNbDisques() + " disque(s).");
		System.out.println("Les disques disponibles dans votre biblioth�que sont : ");

		for (int i = 0; i < listDisc.size(); i++) {

			System.out.print(listDisc.get(i).getNomDisque());
			System.out.println(" [code barre : " + listDisc.get(i).getCodeBarre() + "]");
		}

	}

	private static final String LIBRARYPATH = "C:\\code\\java\\workspace\\java-base\\bin\\com\\sopra\\pox3\\musicLibrary\\myMusicLibrary.txt";

	// On cr�� une constante parce qu'on utilise ce chemin dans diff�rentes
	// fonctions, et si on est amen� � le modifi� ce sera plus pratique de ne le
	// faire qu'une fois

	void saveLibraryInFile() throws IOException {

		String savedPath = new String();
		savedPath = LIBRARYPATH;

		File musicLibraryFile = new File(savedPath);

		if (musicLibraryFile.exists()) {
			writeInFile(musicLibraryFile.getAbsolutePath());
		} else {
			musicLibraryFile.createNewFile();
			writeInFile(musicLibraryFile.getAbsolutePath());
		}

		// on utilise un write, donc le fichier texte est r��crit � chaque fois
		// qu'on sauve la biblioth�que. De cette mani�re, il n'y a pas de risque
		// de doublon. Si on avait voulu ajouter du texte � une biblioth�que
		// existante et conserver le texte d�j� pr�sent dans le fichier, il
		// aurait fallu utiliser un append et v�rifier pour chaque nouvelle
		// entr�e si le fichier contenait d�j� les informations.

		System.out.println("La biblioth�que a �t� sauvegard�e au format texte � l'adresse suivante :");
		System.out.println(savedPath);
	}

	void loadFile() throws IOException {

		String pathToLoad = new String();
		pathToLoad = LIBRARYPATH;

		File file = new File(pathToLoad);

		FileInputStream fis;
		try {
			fis = new FileInputStream(file);

			InputStreamReader isr = new InputStreamReader(fis, "UTF8");
			BufferedReader reader = new BufferedReader(isr);

			while (true) {

				String currentDiscName = reader.readLine();
				if (currentDiscName == null)
					break;

				String currentDiscBarCode = reader.readLine();
				if (currentDiscBarCode == null)
					break;

				Disque currentDisc = new Disque(currentDiscName, currentDiscBarCode);

				int nbSongsOnDisc = Integer.parseInt(reader.readLine());
				List<Chanson> allSongsOnDisc = new ArrayList<>();

				for (int i = 0; i < nbSongsOnDisc; i++) {

					String currentSongName = reader.readLine();
					if (currentSongName == null)
						break;

					String currentSongDurationString = reader.readLine();
					if (currentSongDurationString == null)
						break;

					int currentSongDuration = Integer.parseInt(currentSongDurationString);

					Chanson currentSong = new Chanson(currentSongName, currentSongDuration);
					allSongsOnDisc.add(currentSong);
				}

				currentDisc.setChansons(allSongsOnDisc);
				this.listDisc.add(currentDisc);

			}

			reader.close();
			isr.close();
			fis.close();

			System.out.println("La biblioth�que a �t� charg�e depuis l'adresse :");
			System.out.println(pathToLoad);

		}
		// FileInputStream
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// InputStreamReader
		catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		// reader.readLine();, reader.close(); isr.close(), fis.close()
		catch (IOException e) {
			e.printStackTrace();
		}

	}

	void writeInFile(String path) {
		File file = new File(path);

		try {
			FileOutputStream fos = new FileOutputStream(file);

			PrintWriter pw = new PrintWriter(fos);

			for (int i = 0; i < this.listDisc.size(); i++) {
				pw.println(this.listDisc.get(i).getNomDisque());
				pw.println(this.listDisc.get(i).getCodeBarre());
				pw.println(this.listDisc.get(i).getChansons().size());

				for (int j = 0; j < this.listDisc.get(i).getChansons().size(); j++) {
					pw.println(this.listDisc.get(i).getChansons().get(j).getNom());
					pw.println(this.listDisc.get(i).getChansons().get(j).getDureeChanson());
				}

			}

			pw.close();

			fos.close();
		}
		// new FileOutputStream( file );
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// new OutputStreamWriter( fos, "UTF8" );
		catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		// append(), flush() et close()
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
