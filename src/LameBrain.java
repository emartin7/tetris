import cs5044.tetris.*;

/**
 * @author emartin7
 * @version 2016.03.10
 */
public class LameBrain
    implements Brain
{

    /**
     * @param board
     * @param piece
     * @param heightLimit
     * @param move
     *            Lame brain implementation of best move.
     */
    public void bestMove(Board board, Piece piece, int heightLimit, Move move)
    {
        // Leave the piece unrotated
        move.setPiece(piece);

        // Set the goal column to be the middle of the board
        move.setX((board.getWidth() - piece.getWidth()) / 2);

        // Set the goal row to be the bottom row
        move.setY(0);

        // Make up a score for this move (lower scores are better)
        move.setScore(100000.0);
    }
}
