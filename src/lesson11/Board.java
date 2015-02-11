package lesson11;

public class Board {
	private Cell[][] table = new Cell[3][];

	public Board() {
		table[0] = new Cell[3];
		table[1] = new Cell[3];
		table[2] = new Cell[3];

	}

	public void print() {
		System.out.println("*****");
		for (int i = 0; i < 3; i++) {
			System.out.print("*");
			for (int j = 0; j < 3; j++) {
				char c = cellToChar(table[i][j]);
				System.out.print(c);
			}
			System.out.println("*");
		}

		System.out.println("*****");
		System.out.println("The winner is..." + whoWon());
	}

	public static char cellToChar(Cell cell) {
		if (cell == null) {
			return '-';
		}
		if (cell == Cell.CIRCLE) {
			return 'O';

		} else {
			return 'X';
		}
	}

	public static Cell charToCell(char c) {
		if (c == 'X') {
			return Cell.CROSS;
		}
		if (c == 'O') {
			return Cell.CIRCLE;
		}
		return null;
	}

	public static void main(String[] args) {
		Board board = new Board();
		board.whoWon();
		board.fillCellByText("O20");
		board.fillCellByText("O00");
		board.fillCellByText("O10");
		board.print();
		System.out.println(board.whoWon());
	}

	public boolean checkWinner(Cell cell) {
		for (int i = 0; i < 3; i++) {
			if (table[i][0] == cell && table[i][1] == cell
					&& table[i][2] == cell) {
				return true;
			}
			if (table[0][i] == cell && table[1][i] == cell
					&& table[2][i] == cell) {
				return true;

			}

		}
		if (table[0][0] == cell && table[1][1] == cell && table[2][2] == cell) {
			return true;
		}
		if (table[0][2] == cell && table[1][1] == cell && table[2][0] == cell) {
			return true;
		}

		return false;

	}

	public Cell whoWon() {
		if (checkWinner(Cell.CIRCLE)) {
			return Cell.CIRCLE;
		}
		if (checkWinner(Cell.CROSS)) {
			return Cell.CROSS;
		}
		return null;
	}

	public void fillCell(Cell cell, int row, int col) {
		table[row][col] = cell;

	}

	public void fillCellByText(String move) {
		Cell cell = charToCell(move.charAt(0));
		int row = Character.digit(move.charAt(1), 10);
		int col = Character.digit(move.charAt(2), 10);
		fillCell(cell, row, col);
		

	}
}
