package com.sopra.pox3.bataille;

public class Card {
	
	CardColor color;
	int value;
	
	public Card() {
	}

	public Card(int value, CardColor color) {
		this.color = color;
		this.value = value;
	}

	@Override
	public String toString() {
		return "" + value + color + "";
	}
	
	
	
	
}
