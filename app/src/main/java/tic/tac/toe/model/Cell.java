package tic.tac.toe.model;

import tic.tac.toe.model.Player;
import tic.tac.toe.utilities.StringUtility;

public class Cell {

    public Player player;

    public Cell(Player player) {
        this.player = player;
    }

    public boolean isEmpty() {
        return player == null || StringUtility.isNullOrEmpty(player.value);
    }
}
