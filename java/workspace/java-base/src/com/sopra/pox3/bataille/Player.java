package com.sopra.pox3.bataille;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {
	
	List<Card> hand = new ArrayList<>();
	
	
	public List<Card> getHand() {
		return hand;
	}


	public void setHand(List<Card> hand) {
		this.hand = hand;
	}


	void takeCard(Card card){
		
		hand.add(card);
		
	}
	
	
	Card playCard(){
		
		Card playedCard = new Card();
		
		int indexMIN = 0;
		int indexMAX;
		
		if(this.hand.size()==1){
			indexMAX =1;
		}else{
			indexMAX  = this.hand.size()-1;
		}
		
		
		Random r = new Random();
		int indexRandom = r.nextInt(indexMAX-indexMIN) + indexMIN;
		
		playedCard = this.hand.remove(indexRandom);
		
		return playedCard;
	}
	
}
