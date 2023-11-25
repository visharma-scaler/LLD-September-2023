package scaler.lld3.tictactoe.strategies.winningStrategies;

import scaler.lld3.tictactoe.models.Board;
import scaler.lld3.tictactoe.models.Cell;
import scaler.lld3.tictactoe.models.CellState;
import scaler.lld3.tictactoe.models.Move;

import java.util.HashMap;
import java.util.Map;

public class ColumnWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWinner(Board board, Move finalMove) {
        int col = finalMove.getCell().getCol();
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < board.getSize(); i++) {
            Cell cell = board.getBoard().get(i).get(col);
            if (cell.getCellState().equals(CellState.EMPTY)) {
                continue;
            }

            char character = cell.getPlayer().getSymbol().getCharacter();
            freq.put(character, freq.getOrDefault(character, 0) + 1);

            if (freq.get(character) == board.getSize()) {
                return true;
            }
        }
        return false;
    }
}
