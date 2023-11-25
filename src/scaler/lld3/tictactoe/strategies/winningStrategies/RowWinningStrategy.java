package scaler.lld3.tictactoe.strategies.winningStrategies;

import scaler.lld3.tictactoe.models.Board;
import scaler.lld3.tictactoe.models.Move;

public class RowWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Board board, Move finalMove) {
        return false;
    }
}
