
import interfaces.Drawable;

public class Board implements Drawable {

	private static final int HEIGHT = 7;
	private static final int WIDTH = 7;
	public static String[][] theBoard = new String[HEIGHT][WIDTH];

	public static String[][] getTheBoard() {
		return theBoard;
	}
	public static void setTheBoard(int coordinate, String symbol) {
		if (coordinate == 1 && theBoard[1][1] == " ") {
			theBoard[1][1] = symbol;
		}
		else if (coordinate == 2 && theBoard[1][3] == " ") {
			theBoard[1][3] = symbol;
		}
		else if (coordinate == 3 && theBoard[1][5] == " ") {
			theBoard[1][5] = symbol;
		}
		else if (coordinate == 4 && theBoard[3][1] == " ") {
			theBoard[3][1] = symbol;
		}
		else if (coordinate == 5 && theBoard[3][3] == " ") {
			theBoard[3][3] = symbol;
		}
		else if (coordinate == 6 && theBoard[3][5] == " ") {
			theBoard[3][5] = symbol;
		}
		else if (coordinate == 7 && theBoard[5][1] == " ") {
			theBoard[5][1] = symbol;
		}
		else if (coordinate == 8 && theBoard[5][3] == " ") {
			theBoard[5][3] = symbol;
		}
		else if (coordinate == 9 && theBoard[5][5] == " ") {
			theBoard[5][5] = symbol;
		}
	}

	public void draw() {
		for (int i = 0; i < HEIGHT; i++) {
			for (int j = 0; j < WIDTH; j++) {
				System.out.print(theBoard[i][j]);
			}
			System.out.println();
		}			
	}
	
	public void drawCanvas(){
		for (int i = 0; i < HEIGHT; i++) {
			for (int j = 0; j < WIDTH; j++) {
				if (i % 2 == 0) {
					if (j % 2 == 0) {
						theBoard[i][j] = " ";
					}
					else {
						theBoard[i][j] = "-";
					}
				}
				else {
					if (j % 2 == 0) {
						theBoard[i][j] = "|";
					}
					else {
						theBoard[i][j] = " ";
					}
				}
			}
		}
	}

}
