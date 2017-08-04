package com.sopra.pox3.structure;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap; // on peut ajouter tous les imports n�cessaires au fonctionnement du programme avec la combinaison [Ctrl]+[Shift]+[O]
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapApplication {

	
	// bout de code trouv� sur stackoverflow pour trier les maps<key, value> par value
	public static <K, V extends Comparable<? super V>> Map<K, V> 
    sortByValue( Map<K, V> map )
	{
	    List<Map.Entry<K, V>> list =
	        new LinkedList<Map.Entry<K, V>>( map.entrySet() );
	    Collections.sort( list, new Comparator<Map.Entry<K, V>>()
	    {
	        public int compare( Map.Entry<K, V> o1, Map.Entry<K, V> o2 )
	        {
	            return (o1.getValue()).compareTo( o2.getValue() );
	        }
	    } );
	
	    Map<K, V> result = new LinkedHashMap<K, V>();
	    for (Map.Entry<K, V> entry : list)
	    {
	        result.put( entry.getKey(), entry.getValue() );
	    }
	    return result;
	}
	
	// une "map" est un ensemble de couples Key-Value (exemple : un nom d'�quipe-un score)
	// permet d'augmenter les performances. 
	// on peut aussi associer un fichier *.html (key) avec un code ETAG (value)
	// changer une lettre dans le nom du fichier changera automatiquement le ETAG
	
	public static void main(String[] args) {
		
		//// POUR CREER UNE MAP AVEC D'UN COTE DES NOMS DE JOUEURS ET DE L'AUTRE DES SCORES
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("John", 2);
		map.put("Jack", 10);
		map.put("James", 5);
		map.put("Josh", 8);
		map.put("Jim", 7);
		map.put("Jerry", 3);
		map.put("Jeremy", 2);
		
		System.out.println(map);
		// on remarque que les noms-scores ne sont ni class�s par ordre de d�claration, ni par ordre alphab�tique de la key, ni par ordre croissant de value
		// ils sont en fait class�s par hash code
		
		//// POUR UTILISER UNE CLASSE "MAISON"
		
		Player jenna = new Player();    	// on cr�� une variable "jenna" de classe "player"...mais le player n'a pas de nom
		jenna.name = "Jenna";				// on attribue la valeur "Jenna" � la variable "jenna" (sachantq ue la class Player a �t� d�finie
		Player janice = new Player(); 		// avec un String name
		janice.name = "Janice";
		Player jean = new Player(); 
		jean.name = "Jean";
		Player joan = new Player(); 
		joan.name = "Joan";
		Player johanna = new Player(); 
		johanna.name = "Johanna";
		Player jasmine = new Player(); 
		jasmine.name = "Jasmine";
			
		//HashMap<Player, Integer> playerScores = new HashMap<>(); 		// cr�e une map dont les Key sont class�s par hash code
		TreeMap<Player, Integer> playerScores = new TreeMap<>();		// cr�e une map dont les Key sont class�s par ordre alphab�tique
		playerScores.put(jenna, 45);									// on aurait pu taper jenna.toString() mais on a d�j� plac� un 
		playerScores.put(janice, 32);									// Override toString() dans la class Player
		playerScores.put(jean, 28);
		playerScores.put(joan, 13);
		playerScores.put(johanna, 6);
		playerScores.put(jasmine, 37);
		
		System.out.println(playerScores);
		
		// Apr�s l'ajout du bout de code de stackoverflow (voir d�but du programme)
		
		System.out.println(sortByValue(playerScores));
		
		

	}

}
