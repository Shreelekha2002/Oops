package com.xworkz.chess.things;

public class Chess {
	public String type;
	public int players;
	public int noOfColors;
	public String firstColor;
	public String secondColor;
	public String skills;//Strategy, tactics
	public int pieces;//16
	public String boardFormat;//square
	public int noOfRows;
	public int noOfColoums;
	public int noOfKing;
	public int noOfQueen;
	public int noOfRooks;
	public int noOfBishops;
	public int noOfKnights;
	public int noOfPawns;
	
		public Chess() {
			System.out.println("Chess is a board game");
		}
		public Chess(String type) {
			this.type=type;
			System.out.println(type);
			
		}
		public Chess(int players, int noOfColors) {
			this.players=players;
			this.noOfColors=noOfColors;
			System.out.println("the players of chess game is "+players);
			System.out.println("Number of colors of chess pieces is "+noOfColors);
		}
		public Chess(String firstColor, String secondColor, String skills) {
			this.firstColor=firstColor;
			this.secondColor=secondColor;
			this.skills=skills;
			System.out.println(" First color of chess piece is "+firstColor);
			System.out.println(" Second color od chess piece is "+secondColor);
			System.out.println("The skilss required for the game are "+skills);
		}
		public Chess(int pieces, String boardFormat, int noOfRows, int noOfColoums) {
			this.pieces=pieces;
			this.boardFormat=boardFormat;
			this.noOfRows=noOfRows;
			this.noOfColoums=noOfColoums;
			System.out.println(pieces+ " pieces present in chess");
			System.out.println("The board format is "+boardFormat);
			System.out.println(noOfRows+" number of rows are present in chess board");
			System.out.println(noOfColoums+" number of coloums are present in chess board");
		}
		public Chess(int noOfKing, int noOfQueen, int noOfRooks, int noOfBishops, int noOfKnights, int noOfPawns) {
			this.noOfKing=noOfKing;
			this.noOfQueen=noOfQueen;
			this.noOfRooks=noOfRooks;
			this.noOfBishops=noOfBishops;
			this.noOfKnights=noOfKnights;
			this.noOfPawns=noOfPawns;
				System.out.println("King:"+noOfKing);
				System.out.println("Queen:"+noOfQueen);
				System.out.println("Rooks:"+noOfRooks);
				System.out.println("Bishops:"+noOfBishops);
				System.out.println("Knights:"+noOfKnights);
				System.out.println("Pawns:"+noOfPawns);
		
		
		
		}	
		
		
}