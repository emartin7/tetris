import cs5044.tetris.*;

/**
 * @author emartin7
 * @version 2016.03.10
 */
public class CleverBrain implements Brain {

	/**
	 * @param board
	 * @param piece
	 * @param heightLimit
	 * @param move
	 *            Iterates through board columns and rotation of piece to find
	 *            best move
	 */
	@Override
	public void bestMove(Board board, Piece piece, int heightLimit, Move move) {
		// TODO Auto-generated method stub
		double rotationCount = 0;
		double originalValue = 1e20;
		move.setScore(originalValue);

		while (rotationCount < piece.numRotations()) {

			tryAllColumns(board, piece, heightLimit, move);
			piece = piece.nextRotation();
			++rotationCount;
		}

	}

	/**
	 * @param board
	 * @param piece
	 * @param heightLimit
	 * @param move
	 *            Tries a column and drops piece to see if move is better than
	 *            the last
	 */
	public void tryAllColumns(Board board, Piece piece, int heightLimit, Move move) {
		int column = 0;
		while (column < board.getWidth() - piece.getWidth() + 1) {

			// drop piece in the current column (you can use a combination
			// of board.rowAfterDrop() followed by board.place())
			int row = board.rowAfterDrop(piece, column);
			board.place(piece, column, row);
			// clear any rows that were filled in by dropping the piece
			board.clearRows();
			// compute the score of the resulting board state
			double thisScore = rateBoard(board);

			if (thisScore < move.score()) {
				// This is the best move so far, so remember it
				move.setPiece(piece);
				move.setX(column);
				move.setY(row);
				move.setScore(thisScore);
			}

			// revert back to original situation for next try
			board.undo();
			column++;

		}

	}

	/**
	 * @param board
	 * @return The score of the board where a lower score is a better move
	 * 
	 */
	public double rateBoard(Board board) {
		double totalScore;
		double heightOfBoard;
		int blockedHolesOnBoard;
		int openSidedHolesOnBoard;
		double heightDisparity;
		int weightedHeightScore;

		heightOfBoard = board.getLargestHeight();
		blockedHolesOnBoard = numOfHoles(board)[0];
		openSidedHolesOnBoard = numOfHoles(board)[1];
		heightDisparity = getDisparity(board);
		weightedHeightScore = getAggregateHeightOfBoard(board);

		totalScore = blockedHolesOnBoard * 10000 + openSidedHolesOnBoard * 7500
				+ ((heightOfBoard * heightOfBoard * (heightOfBoard / 2)) * 130)
				+ ((heightDisparity * heightDisparity / 2) * 200) + weightedHeightScore * 200;
		return totalScore;
		// place your scoring code in here
	}

	/**
	 * @param board
	 * @return an integer array of the number of open holes and closed holes
	 */
	private int[] numOfHoles(Board board) {
		int[] numOfHoles = new int[2];
		int numOfBlockedHoles = 0;
		int numOfOpenSidedHoles = 0;
		for (int column = 0; column < board.getWidth(); column++) {
			int height = board.getColumnHeight(column);
			for (int row = 0; row < height; row++) {
				if (!board.hasBlockAt(column, row)) {
					if (column == 0) {
						if (board.getColumnHeight(column + 1) <= row) {
							numOfOpenSidedHoles++;
						} else {
							numOfBlockedHoles++;
						}
					} else if (column == board.getWidth() - 1) {
						if (board.getColumnHeight(column - 1) <= row) {
							numOfOpenSidedHoles++;
						} else {
							numOfBlockedHoles++;
						}
					} else {
						if ((board.getColumnHeight(column - 1) <= row) || (board.getColumnHeight(column + 1) <= row)) {
							numOfOpenSidedHoles++;
						} else {
							numOfBlockedHoles++;
						}
					}
				}
			}
		}
		numOfHoles[0] = numOfBlockedHoles;
		numOfHoles[1] = numOfOpenSidedHoles;
		return numOfHoles;

	}

	/**
	 * @param board
	 * @return The overall disparity in height aggregated between neighboring
	 *         columns
	 */
	private int getDisparity(Board board) {
		int localDisparity = 0;
		for (int column = 1; column < board.getWidth(); column++) {
			localDisparity += Math.abs(board.getColumnHeight(column) - board.getColumnHeight(column - 1));
		}
		return localDisparity;

	}

	/**
	 * @param board
	 * @return a weighted aggregate height total where height is a product of
	 *         the height of each column added together
	 */
	private int getAggregateHeightOfBoard(Board board) {
		int weightedAggregateHeight = 0;
		for (int column = 0; column < board.getWidth(); column++) {
			weightedAggregateHeight += (board.getColumnHeight(column) * board.getColumnHeight(column));
		}
		return weightedAggregateHeight;
	}

}
