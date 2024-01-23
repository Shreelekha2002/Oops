package com.xworkz.chess.driver;

import com.xworkz.chess.things.Chess;

public class ChessRunner {
	public static void main(String args[]) {
		Chess chess = new Chess();
		new Chess("Board type game");
		new Chess(2, 2);
		new Chess("black", "white", "Strategy, tactics");
		new Chess(16, "square",8, 8);
		new Chess(1, 1, 2, 2, 2, 8);
	}
}
//polymorphism, types compile time - overloading runtime - overriding
// how to achive polymarphism.