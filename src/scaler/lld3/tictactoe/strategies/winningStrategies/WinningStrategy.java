package scaler.lld3.tictactoe.strategies.winningStrategies;

import scaler.lld3.tictactoe.models.Board;
import scaler.lld3.tictactoe.models.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move finalMove);
}
