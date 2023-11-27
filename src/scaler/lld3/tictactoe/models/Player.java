package scaler.lld3.tictactoe.models;

import scaler.lld1.interfaces.C;

import java.util.Scanner;

public class Player {
    private Long id;
    private String name;
    private Symbol symbol;
    private PlayerType type;
    private final Scanner scanner;

    public Player(Long id, String name, Symbol symbol, PlayerType type) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.type = type;
        this.scanner = new Scanner(System.in);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public PlayerType getType() {
        return type;
    }

    public void setType(PlayerType type) {
        this.type = type;
    }

    public Move makeMove(Board board) {
        System.out.println("Please tell the row count where you want to make a move (Starting from 0): ");
        int row = scanner.nextInt();

        System.out.println("Please tell the column count where you want to make a move (Starting from 0): ");
        int col = scanner.nextInt();

        return new Move(new Cell(row, col), this);
    }
}
