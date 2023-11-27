package scaler.lld3.tictactoe.strategies.winningStrategies;

import scaler.lld3.tictactoe.models.Board;
import scaler.lld3.tictactoe.models.Move;
import scaler.lld3.tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy{

    private Map<Integer, Map<Symbol, Integer>> counts = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        Symbol symbol = move.getPlayer().getSymbol();

        if (!counts.containsKey(row)) {
            counts.put(row, new HashMap<>());
        }

        Map<Symbol, Integer> symbolMap = counts.get(row);
        symbolMap.put(symbol, symbolMap.getOrDefault(symbol, 0) + 1);
        return symbolMap.get(symbol) == board.getSize();
    }

    @Override
    public void handleUndo(Board board, Move lastMove) {
        int row = lastMove.getCell().getRow();
        Symbol symbol = lastMove.getPlayer().getSymbol();

        Map<Symbol, Integer> symbolMap = counts.get(row);
        symbolMap.put(symbol, symbolMap.get(symbol) - 1);
    }
}
