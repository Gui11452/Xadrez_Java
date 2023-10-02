package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // Colocando apenas para ficar didático
	}
	
	protected Board getBoard() {
		return board;
	}
	
}
