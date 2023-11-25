package scaler.lld3.tictactoe.models;

import scaler.lld1.interfaces.A;
import scaler.lld1.interfaces.C;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> board;


    public Board(int size) {
        this.size = size;
        this.board = initBoard(size);
    }

    private List<List<Cell>> initBoard(int size) {
        List<List<Cell>> board = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            List<Cell> row = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                row.add(new Cell(i, j));
            }
            board.add(row);
        }
        return board;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

    public void display() {
        for (List<Cell> row: board) {
            for(Cell cell: row) {
                if (cell.getCellState().equals(CellState.EMPTY)) {
                    System.out.print("| - |");
                } else {
                    System.out.print("| " + cell.getPlayer().getSymbol().getCharacter() + " |");
                }
            }
            System.out.println();
        }
    }
}
