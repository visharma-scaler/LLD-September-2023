package scaler.lld3.tictactoe.strategies.winningStrategies;

import scaler.lld3.tictactoe.models.Board;
import scaler.lld3.tictactoe.models.Move;
import scaler.lld3.tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStrategy implements WinningStrategy {

    private Map<Symbol, Integer> leftDiagonalCounts = new HashMap<>();
    private Map<Symbol, Integer> rightDiagonalCounts = new HashMap<>();


    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        if (row == col) {
            leftDiagonalCounts.put(symbol, leftDiagonalCounts.getOrDefault(symbol, 0) + 1);
            if (leftDiagonalCounts.get(symbol) == board.getSize()) {
                return true;
            }
        }

        if (row + col == board.getSize() - 1) {
            rightDiagonalCounts.put(symbol, rightDiagonalCounts.getOrDefault(symbol, 0) + 1);
            if (rightDiagonalCounts.get(symbol) == board.getSize()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void handleUndo(Board board, Move lastMove) {
        int row = lastMove.getCell().getRow();
        int col = lastMove.getCell().getCol();
        Symbol symbol = lastMove.getPlayer().getSymbol();

        if (row == col) {
            leftDiagonalCounts.put(symbol, leftDiagonalCounts.get(symbol) - 1);
        }
        if (row + col == board.getSize() - 1) {
            rightDiagonalCounts.put(symbol, rightDiagonalCounts.get(symbol) - 1);
        }
    }
}

// UNDO:-
// 1. KKHH -> Reverse the last move
// 2. OSO -> Redo all move except the last
// 3. Doaraemon -> store all the states
