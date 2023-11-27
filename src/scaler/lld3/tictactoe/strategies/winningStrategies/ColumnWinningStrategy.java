package scaler.lld3.tictactoe.strategies.winningStrategies;

import scaler.lld3.tictactoe.models.*;

import java.util.HashMap;
import java.util.Map;

public class ColumnWinningStrategy implements WinningStrategy {
//    @Override
//    public boolean checkWinner(Board board, Move finalMove) {
       /* int col = finalMove.getCell().getCol();
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
        }*/
//        return false;
//    }

    private Map<Integer, Map<Symbol, Integer>> counts = new HashMap<>();



    // [0] -> [X -> 0, O -> 1]
    // [1] -> [X -> 2, O -> 1]
    // [2] -> [X -> 1, O -> 1]
    // [3] -> [X -> 0, O -> 1]


    @Override
    public boolean checkWinner(Board board, Move move) {
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        if (!counts.containsKey(col)) {
            counts.put(col, new HashMap<>());
        }

        Map<Symbol, Integer> symbolMap = counts.get(col);
        symbolMap.put(symbol, symbolMap.getOrDefault(symbol, 0) + 1);
        return symbolMap.get(symbol) == board.getSize();
    }

    @Override
    public void handleUndo(Board board, Move lastMove) {
        int col = lastMove.getCell().getCol();
        Symbol symbol = lastMove.getPlayer().getSymbol();

        Map<Symbol, Integer> symbolMap = counts.get(col);
        symbolMap.put(symbol, symbolMap.get(symbol) - 1);
    }
}
