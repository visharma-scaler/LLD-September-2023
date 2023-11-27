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

    public void displayV2() {
        System.out.println();

        for (int i = 0; i < board.size(); i++) {
            System.out.println();
            for (int j = 0; j < board.size(); j++) {
                Cell cell = board.get(i).get(j);
                System.out.print(" ");
                if (cell.getCellState().equals(CellState.EMPTY)) {
                    System.out.print(" ");
                } else {
                    System.out.print(cell.getPlayer().getSymbol().getCharacter());
                }

                if (j < board.size() - 1) {
                    System.out.print(" |");
                }
            }
            if (i < board.size() - 1) {
                System.out.println();
                for(int p = 0; p < board.size(); p++) {
                    System.out.print("----");
                }
            }
        }
        System.out.println("\n");
    }
}
