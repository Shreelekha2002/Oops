package com.xworkz.cards.driver;

import com.xworkz.cards.things.Cards;

public class CardsRunner {
	
	public static void main(String args[]) {
		Cards cards = new Cards();
		System.out.println(cards);
		new Cards(52);	
	}
	
}
