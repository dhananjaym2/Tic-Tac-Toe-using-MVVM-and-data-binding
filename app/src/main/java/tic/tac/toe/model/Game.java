package tic.tac.toe.model;

import android.util.Log;

import static tic.tac.toe.utilities.StringUtility.isNullOrEmpty;

public class Game {

    private final String TAG = Game.class.getSimpleName();
    private static final int BOARD_SIZE = 3;
    public final Cell[][] cells;
    public final Player player1, player2, currentPlayer;

    public Game(String playerOne, String playerTwo) {
        cells = new Cell[BOARD_SIZE][BOARD_SIZE];
        player1 = new Player(playerOne, "x");
        player2 = new Player(playerTwo, "o");
        currentPlayer = player1;
    }

    public boolean hasGameEnded() {
        if (hasThreeSameHorizontalCells() || hasThreeSameVerticalCells())
    }

    private boolean hasThreeSameHorizontalCells() {
        try {
            for (int i = 0; i < BOARD_SIZE; i++)
                if (areEqual(cells[i][0], cells[i][1], cells[i][2]))
                    return true;

            return false;
        } catch (NullPointerException e) {
            Log.e(TAG, e.getMessage());
            return false;
        }
    }

    private boolean hasThreeSameVerticalCells() {
        try {
            for (int i = 0; i < BOARD_SIZE; i++) {

            }
        }
        return false;
    }

    private boolean areEqual(Cell... cells) {
        if (cells == null || cells.length == 0) {
            return false;
        }

        for (Cell cell : cells) {
            if (cell == null || isNullOrEmpty(cell.player.value))
                return false;
        }

        Cell comparisonBase = cells[0];
        for (int i = 1; i < cells.length; i++) {
            if (!comparisonBase.player.value.equals(cells[i].player.value))
                return false;
        }

        return true;
    }
}
