import static org.junit.Assert.*;

import org.junit.Test;

import cs5044.tetris.Board;
import cs5044.tetris.Brain;
import cs5044.tetris.Move;
import cs5044.tetris.Piece;

/**
 * @author emartin7
 * @version 2016.03.10
 */
public class CleverBrainTest {

	/**
	 * Test right L on Board 1.
	 */
	@Test
	public void testLonBoard1() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "#### #####");
		Piece piece = Piece.getPiece(Piece.RIGHT_L, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		// This should produce a board like this:
		// | |
		// | ### |
		// |##########|
		// ------------
		// But after clearing the resulting row, we end up with
		// just three blocks that fall to the bottom row.
		assertEquals(board, new Board(10, 24, "    ###   "));
	}

	/**
	 * Tests left L on Board 1.
	 */
	@Test
	public void testLeftLonBoard1() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "#### #####");
		Piece piece = Piece.getPiece(Piece.LEFT_L, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		// This should produce a board like this:
		// | |
		// | ### |
		// |##########|
		// ------------

		assertEquals(board, new Board(10, 24, "  ###     "));
	}

	/**
	 * Tests the T on board 1.
	 */
	@Test
	public void testTonBoard1() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "#### #####");
		Piece piece = Piece.getPiece(Piece.T, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		// This should produce a board like this:
		// | |
		// | ### |
		// |##########|
		// ------------

		assertEquals(board, new Board(10, 24, "   ###   "));
	}

	/**
	 * Tests the Left Dog on board 1.
	 */
	@Test
	public void testLeftDogonBoard1() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "#### #####");
		Piece piece = Piece.getPiece(Piece.LEFT_DOG, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		// This should produce a board like this:
		// | # |
		// | ## |
		// |##########|
		// ------------

		assertEquals(board, new Board(10, 24, "     #    ", "    ##    "));
	}

	/**
	 * Tests right dog on board 1.
	 */
	@Test
	public void testRightDogonRow0Board1() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "#### #####");
		Piece piece = Piece.getPiece(Piece.RIGHT_DOG, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		// This should produce a board like this:
		// | # |
		// | ## |
		// |##########|
		// ------------

		assertEquals(board, new Board(10, 24, "   #      ", "   ##     "));
	}

	/**
	 * Test the stick on board 1.
	 */
	@Test
	public void testStickonBoard1() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "#### #####");
		Piece piece = Piece.getPiece(Piece.STICK, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		assertEquals(board, new Board(10, 24, "####      ", "#### #####"));
	}

	/**
	 * Tests the block on board 1.
	 */
	@Test
	public void testBlockonBoard1() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "#### #####");
		Piece piece = Piece.getPiece(Piece.SQUARE, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		assertEquals(board, new Board(10, 24, "##        ", "##        ", "#### #####"));
	}

	/**
	 * Tests the right L on board 2.
	 */
	@Test
	public void testLonBoard2() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "####  ####");
		Piece piece = Piece.getPiece(Piece.RIGHT_L, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		// This should produce a board like this:
		// | # |
		// | # |
		// |##########|
		// ------------
		// But after clearing the resulting row, we end up with
		// just three blocks that fall to the bottom row.
		assertEquals(board, new Board(10, 24, "    #     ", "    #     "));
	}

	/**
	 * Tests the left L on board 2.
	 */
	@Test
	public void testLeftLonBoard2() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "####  ####");
		Piece piece = Piece.getPiece(Piece.LEFT_L, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		// This should produce a board like this:

		assertEquals(board, new Board(10, 24, "     #    ", "     #    "));
	}

	/**
	 * Tests the T on board 2.
	 */
	@Test
	public void testTonBoard2() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "####  ####");
		Piece piece = Piece.getPiece(Piece.T, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		assertEquals(board, new Board(10, 24, " #        ", "###       ", "####  ####"));
	}

	/**
	 * Tests the left dog on board 2.
	 */
	@Test
	public void testLeftDogonBoard2() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "####  ####");
		Piece piece = Piece.getPiece(Piece.LEFT_DOG, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		// This should produce a board like this:

		assertEquals(board, new Board(10, 24, "   ##     "));
	}

	/**
	 * Tests the right dog on board 2.
	 */
	@Test
	public void testRightDogonRow0Board2() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "####  ####");
		Piece piece = Piece.getPiece(Piece.RIGHT_DOG, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		// This should produce a board like this:
		// | # |
		// | ## |
		// |##########|
		// ------------

		assertEquals(board, new Board(10, 24, "     ##   "));
	}

	/**
	 * Tests the stick on board 2.
	 */
	@Test
	public void testStickonBoard2() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "####  ####");
		Piece piece = Piece.getPiece(Piece.STICK, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		assertEquals(board, new Board(10, 24, "####      ", "####  ####"));
	}

	/**
	 * Tests the block on board 2.
	 */
	@Test
	public void testBlockonBoard2() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "####  ####");
		Piece piece = Piece.getPiece(Piece.SQUARE, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		assertEquals(board, new Board(10, 24, "    ##    "));
	}

	/**
	 * Tests the right L on board 3.
	 */
	@Test
	public void testLonBoard3() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "###   ####");
		Piece piece = Piece.getPiece(Piece.RIGHT_L, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		// This should produce a board like this:

		assertEquals(board, new Board(10, 24, "     #    "));
	}

	/**
	 * Tests the left L on board 3.
	 */
	@Test
	public void testLeftLonBoard3() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "###   ####");
		Piece piece = Piece.getPiece(Piece.LEFT_L, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		// This should produce a board like this:

		assertEquals(board, new Board(10, 24, "   #      "));
	}

	/**
	 * Tests the T on board 3.
	 */
	@Test
	public void testTonBoard3() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "###   ####");
		Piece piece = Piece.getPiece(Piece.T, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		assertEquals(board, new Board(10, 24, "    #     "));
	}

	/**
	 * Tests the left dog on board 3.
	 */
	@Test
	public void testLeftDogonBoard3() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "###   ####");
		Piece piece = Piece.getPiece(Piece.LEFT_DOG, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		// This should produce a board like this:

		assertEquals(board, new Board(10, 24, "  ##      ", "##### ####"));
	}

	/**
	 * Tests the right dog on board 3.
	 */
	@Test
	public void testRightDogonRow0Board3() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "###   ####");
		Piece piece = Piece.getPiece(Piece.RIGHT_DOG, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		assertEquals(board, new Board(10, 24, "     ##   ", "### ######"));
	}

	/**
	 * Tests the stick on board 3.
	 */
	@Test
	public void testStickonBoard3() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "###   ####");
		Piece piece = Piece.getPiece(Piece.STICK, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		assertEquals(board, new Board(10, 24, "      ####", "###   ####"));
	}

	/**
	 * Tests the block on board 3.
	 */
	@Test
	public void testBlockonBoard3() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "###   ####");
		Piece piece = Piece.getPiece(Piece.SQUARE, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		assertEquals(board, new Board(10, 24, "   ##     ", "##### ####"));
	}

	/**
	 * Tests the right L on board 4.
	 */
	@Test
	public void testLonBoard4() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "###    ###");
		Piece piece = Piece.getPiece(Piece.RIGHT_L, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		// This should produce a board like this:

		assertEquals(board, new Board(10, 24, "     #    ", "###### ###"));
	}

	/**
	 * Tests the left L on board 4.
	 */
	@Test
	public void testLeftLonBoard4() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "###    ###");
		Piece piece = Piece.getPiece(Piece.LEFT_L, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		// This should produce a board like this:

		assertEquals(board, new Board(10, 24, "   #      ", "###### ###"));
	}

	/**
	 * Tests the T on board 4.
	 */
	@Test
	public void testTonBoard4() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "###    ###");
		Piece piece = Piece.getPiece(Piece.T, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		assertEquals(board, new Board(10, 24, "    #     ", "###### ###"));
	}

	/**
	 * Tests the left dog on board 4.
	 */
	@Test
	public void testLeftDogonBoard4() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "###    ###");
		Piece piece = Piece.getPiece(Piece.LEFT_DOG, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		// This should produce a board like this:

		assertEquals(board, new Board(10, 24, "  ##      ", "#####  ###"));
	}

	/**
	 * Tests the right dog on board 4.
	 */
	@Test
	public void testRightDogonRow0Board4() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "###    ###");
		Piece piece = Piece.getPiece(Piece.RIGHT_DOG, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		assertEquals(board, new Board(10, 24, "      ##  ", "###  #####"));
	}

	/**
	 * Tests the stick on board 4.
	 */
	@Test
	public void testStickonBoard4() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "###    ###");
		Piece piece = Piece.getPiece(Piece.STICK, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		assertEquals(board, new Board(10, 24, "          "));
	}

	/**
	 * Tests the block on board 4.
	 */
	@Test
	public void testBlockonBoard4() {
		// First, set up the objects to use in this test
		Board board = new Board(10, 24, "###    ###");
		Piece piece = Piece.getPiece(Piece.SQUARE, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		assertEquals(board, new Board(10, 24, "   ##     ", "#####  ###"));
	}

	/**
	 * Tests the stick on a board to make sure that a stick completes a 4 rows.
	 */
	@Test
	public void testStickBoard5() {
		Board board = new Board(10, 24, "######### ", "######### ", "######### ", "######### ");
		Piece piece = Piece.getPiece(Piece.STICK, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);

		assertEquals(board, new Board(10, 24, "          "));

	}

	/**
	 * Tests the left L on a board which is 4 columns high except for one
	 * column.
	 */
	@Test
	public void testLeftLBoardLow() {
		Board board = new Board(10, 24, "######### ", "######### ", "######### ", "######### ");
		Piece piece = Piece.getPiece(Piece.LEFT_L, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);
		// My Strategy is very against holes at a low height
		assertEquals(board, new Board(10, 24, "#", "###", "######### ", "######### ", "######### ", "######### "));

	}

	/**
	 * Tests the left L on a board where each column is filled for a medium
	 * height board.
	 */
	@Test
	public void testLeftLBoardMedium() {
		Board board = new Board(10, 24,

				"######### ", "######### ", "######### ", "######### ", "######### ", "######### ", "######### ",
				"######### ", "######### ", "######### ");
		Piece piece = Piece.getPiece(Piece.LEFT_L, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);
		// My Strategy is very against holes even at a medium height
		assertEquals(board, new Board(10, 24, "#", "###", "######### ", "######### ", "######### ", "######### ",
				"######### ", "######### ", "######### ", "######### ", "######### ", "######### "));

	}

	/**
	 * Tests the Left L on a board that is highly filled where each column is
	 * full except one.
	 */
	@Test
	public void testLeftLBoardHigh() {
		Board board = new Board(10, 24,

				"######### ", "######### ", "######### ", "######### ", "######### ", "######### ", "######### ",
				"######### ", "######### ", "######### ", "######### ", "######### ", "######### ");
		Piece piece = Piece.getPiece(Piece.LEFT_L, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);
		// My Strategy is very against holes even at a medium height
		assertEquals(board, new Board(10, 24,

				"       ###", "######### ", "######### ", "######### ", "######### ", "######### ", "######### ",
				"######### ", "######### ", "######### ", "######### ", "######### ", "######### "));

	}

	/**
	 * Tests right dog on a board with no pieces.
	 */
	@Test
	public void testRightDogBoardzero() {
		Board board = new Board(10, 24,

				"");
		Piece piece = Piece.getPiece(Piece.RIGHT_DOG, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);
		// The brain will prefer an open hole
		assertEquals(board, new Board(10, 24,

				" ##", "##"));

	}

	/**
	 * Tests the left dog on a board with zero pieces.
	 */
	@Test
	public void testLeftDogBoardzero() {
		Board board = new Board(10, 24,

				"");
		Piece piece = Piece.getPiece(Piece.LEFT_DOG, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);
		// The brain will prefer an open hole
		assertEquals(board, new Board(10, 24,

				"       ## ", "        ##"));

	}

	/**
	 * Tests the left L on a board with zero pieces.
	 */
	@Test
	public void testLeftLBoardzero() {
		Board board = new Board(10, 24,

				"");
		Piece piece = Piece.getPiece(Piece.LEFT_L, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);
		// The brain will prefer an to place this on the side to reduce height
		// disparity amongst columns
		assertEquals(board, new Board(10, 24,

				"#", "###"));

	}

	/**
	 * Tests the right L on a board with zero pieces.
	 */
	@Test
	public void testRightLBoardzero() {
		Board board = new Board(10, 24,

				"");
		Piece piece = Piece.getPiece(Piece.RIGHT_L, 0);
		Move move = new Move();
		Brain myBrain = new CleverBrain();

		// Now call the brain
		myBrain.bestMove(board, piece, 20, move);

		// Now apply the move and test the result
		board.apply(move);
		// The brain will prefer an to place this on the side to reduce height
		// disparity amongst columns
		assertEquals(board, new Board(10, 24,

				"         #", "       ###"));

	}

}
