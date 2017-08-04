package packagename;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException {

		System.out.println("Tentative de connexion avec le Serveur");
		Socket socket = new Socket("localhost", 9090);

		System.out.println("Connexion avec le Serveur �tablie");

		//////////////////////////////////////////////////////////////////////////////////////

		OutputStream os = socket.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		int firstInt = 10;
		int secondInt = 15;
		
		System.out.println("Le client envoie les entiers "+firstInt+" et "+secondInt+" au Serveur pour qu'il en calcule la somme.");
		
		oos.writeInt(firstInt);
		oos.writeInt(secondInt);
		oos.flush();
		
		System.out.println("Le client attends la r�ponse du Serveur");
		
		InputStream is = socket.getInputStream();
		ObjectInputStream ois = new ObjectInputStream(is);
		
		int result = ois.readInt();
		
		System.out.println("Le serveur a retourn� la somme des entiers : "+result);

		/////////////////////////////////////////////////////////////////////////////////////

		System.out.println("Fermeture de la Socket c�t� Client");
		socket.close();

		System.out.println("Fin de la communication c�t� Client.");

	}

}
