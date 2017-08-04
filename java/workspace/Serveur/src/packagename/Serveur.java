package packagename;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {

	public static void main(String[] args) throws IOException {

		System.out.println("Ouverture d'une ServerSocket côté Serveur");
		ServerSocket socketserver = new ServerSocket(9090);

		System.out.println("Ouverture de la Socket de communication côté Serveur");
		Socket communicationAvecClient = socketserver.accept();

		System.out.println("Connexion avec Client établie");

		//////////////////////////////////////////////////////////////////////////////////////

		InputStream is = communicationAvecClient.getInputStream();
		
		while (true) {

			int data = is.read();
			// on récupère un int non signé et on ne veut pas l'interpréter en
			// tant qu'objet

			if (data == -1)
				break;

			System.out.print((char) (data & 0xff));

		}
		
		
		
		ObjectInputStream ois = new ObjectInputStream(is);

		System.out.println("Le Serveur attends que le Client lui envoie deux entiers à sommer");

		int firstInt = ois.readInt();
		int secondInt = ois.readInt();

		System.out.println("Le serveur a reçu les entiers " + firstInt + " et " + secondInt + " à sommer");

		OutputStream os = communicationAvecClient.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(os);

		oos.writeInt(firstInt + secondInt);
		oos.flush();

		System.out.println("Le serveur a renvoyé la somme.");

		

		//////////////////////////////////////////////////////////////////////////////////////

		System.out.println("Fermeture de la Socket côté Serveur");
		communicationAvecClient.close();

		System.out.println("Fermeture de la ServerSocket côté Serveur.");
		socketserver.close();

		System.out.println("Fin de la communication côté Serveur");

	}

}
