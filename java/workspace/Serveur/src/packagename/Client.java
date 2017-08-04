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

		System.out.println("Connexion avec le Serveur établie");

		//////////////////////////////////////////////////////////////////////////////////////

		OutputStream os = socket.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		int firstInt = 10;
		int secondInt = 15;
		
		System.out.println("Le client envoie les entiers "+firstInt+" et "+secondInt+" au Serveur pour qu'il en calcule la somme.");
		
		oos.writeInt(firstInt);
		oos.writeInt(secondInt);
		oos.flush();
		
		System.out.println("Le client attends la réponse du Serveur");
		
		InputStream is = socket.getInputStream();
		ObjectInputStream ois = new ObjectInputStream(is);
		
		int result = ois.readInt();
		
		System.out.println("Le serveur a retourné la somme des entiers : "+result);

		/////////////////////////////////////////////////////////////////////////////////////

		System.out.println("Fermeture de la Socket côté Client");
		socket.close();

		System.out.println("Fin de la communication côté Client.");

	}

}
