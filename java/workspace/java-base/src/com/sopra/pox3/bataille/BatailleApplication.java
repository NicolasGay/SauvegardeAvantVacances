package com.sopra.pox3.bataille;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BatailleApplication {

	public static void main(String[] args) {

		Player player1 = new Player();
		Player player2 = new Player();

		new BatailleApplication().playGame(player1, player2);

	}

	void playGame(Player player1, Player player2) {

		// generer un deck
		System.out.println("ON JOUE A LA BATAILLE !");
		List<Card> deck = new BuildDeck().generate32();
		System.out.println("ON JOUE AVEC UN DECK DE " + deck.size() + " CARTES.");

		// melanger le deck
		System.out.println("ON MELANGE LE DECK");
		Collections.shuffle(deck);

		// distribuer les cartes
		System.out.println("ON DISTRIBUE LES CARTES");
		new BatailleApplication().distribute(deck, player1, player2);

		int tour = 1;

		System.out.println("");
		System.out.println("C'EST PARTIIIIIII !!!!");
		System.out.println("");
		
		List<Card> cardsToBeWon = new ArrayList<>();
		Card card1 = new Card();
		Card card2 = new Card();
		
		while (player1.getHand().size() != 0 && player2.getHand().size() != 0) {

			System.out.print("Tour " + tour + " : \t");
			System.out.print("Player1 a " + player1.hand.size() + " cartes, et Player2 a " + player2.hand.size()
					+ " cartes. \t");

			card1 = player1.playCard();
			card2 = player2.playCard();
			
			cardsToBeWon.add(card1);
			cardsToBeWon.add(card2);

			System.out.print("Player1 joue " + card1 + ", Player2 joue " + card2 + "\t");

			if (card1.value > card2.value) {
				System.out.print("C'est Player1 qui gagne ! \t");
				
				for(int i = 0 ; i<cardsToBeWon.size();i++){
					player1.takeCard(cardsToBeWon.get(i));
				}
				
				cardsToBeWon.clear();
				
				System.out.println("Player1 a " + player1.hand.size() + " cartes, et Player2 a " + player2.hand.size());
				
			} else if (card1.value < card2.value) {
				System.out.print("C'est Player2 qui gagne ! \t");

				for(int i = 0 ; i<cardsToBeWon.size();i++){
					player2.takeCard(cardsToBeWon.get(i));
				}
				
				cardsToBeWon.clear();
				
				System.out.println("Player1 a " + player1.hand.size() + " cartes, et Player2 a " + player2.hand.size());
				
			} else if (card1.value == card2.value) {
				System.out.print("BATAILLE ! \t\t\t");
				Card bataille1 = player1.playCard();
				Card bataille2 = player2.playCard();
				cardsToBeWon.add(bataille1);
				cardsToBeWon.add(bataille2);
				
				System.out.println("Player1 ajoute une carte face cachée, et a maintenant " + player1.hand.size() + " cartes, et Player2 ajoute une carte face cachée, et a maintenant " + player2.hand.size());
				
				

			}

			tour++;
		}
		
		if(player2.hand.size() == 0){
			System.out.println("");
			System.out.println("C'EST PLAYER1 QUI A GAGNE !!!!!");
			System.exit(0);
		}else if(player1.hand.size() == 0){
			System.out.println("");
			System.out.println("C'EST PLAYER2 QUI A GAGNE !!!!!");
			System.exit(0);
		}
	}

	void distribute(List<Card> deck, Player player1, Player player2) {

		List<Card> player1Hand = new ArrayList<>();
		List<Card> player2Hand = new ArrayList<>();

		for (int i = 0; i < deck.size(); i++) {

			if (i % 2 == 0) {
				Card addedCard = deck.get(i);
				player1Hand.add(addedCard);

			} else {
				Card addedCard = deck.get(i);
				player2Hand.add(addedCard);
			}

		}

		player1.setHand(player1Hand);
		player2.setHand(player2Hand);

	}


}
