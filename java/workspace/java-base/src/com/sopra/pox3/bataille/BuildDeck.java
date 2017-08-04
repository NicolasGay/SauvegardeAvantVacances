package com.sopra.pox3.bataille;

import java.util.ArrayList;
import java.util.List;

public class BuildDeck {

	List<Card> generate52(){
		
		List<Card> deck = new ArrayList<>();
		
		for (int i = 2; i <= 14; i++) {
			for (int j = 1; j <= 4; j++) {
				
				CardColor color = CardColor.getByValue(j);
				Card card = new Card(i, color);
				deck.add(card);
			}

		}
		
		
		
		return deck;
	}
	
	List<Card> generate32(){
		
		List<Card> deck = new ArrayList<>();
		
		for (int i = 7; i <= 14; i++) {
			for (int j = 1; j <= 4; j++) {
				
				CardColor color = CardColor.getByValue(j);
				Card card = new Card(i, color);
				deck.add(card);
			}

		}
		
		return deck;
		
		
	}
	
}
