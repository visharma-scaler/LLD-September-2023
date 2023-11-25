package scaler.lld3.tictactoe.models;

import scaler.lld3.tictactoe.exceptions.DuplicateSymbolException;
import scaler.lld3.tictactoe.exceptions.MoreThanOneBotException;
import scaler.lld3.tictactoe.exceptions.PlayersCountDimensionMismatchException;
import scaler.lld3.tictactoe.strategies.winningStrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private Player winner;
    private GameState state;
    private int nextPlayerMoveIndex;
    private List<WinningStrategy> winningStrategies;

    public Game(int size, List<Player> players, List<WinningStrategy> winningStrategies) {
        this.nextPlayerMoveIndex = 0;
        this.state = GameState.IN_PROGRESS;
        this.moves = new ArrayList<>();
        this.players = players;
        this.board = new Board(size);
        this.winningStrategies = winningStrategies;

    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public void displayBoard() {
        board.display();
    }

    public void makeMove() {
        Player currentPlayer = players.get(nextPlayerMoveIndex);
        System.out.println("It's " + currentPlayer.getName() + "'s turn. Please make your move");

        Move move = currentPlayer.makeMove(board);
        System.out.println(currentPlayer.getName() + " has made a move at row: " + move.getCell().getRow() + " column: " + move.getCell().getCol() + ".");
        if (!isMoveValid(move)) {
            System.out.println("Invalid move! Please try again");
            return;
        }

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Cell cellToChange = board.getBoard().get(row).get(col);
        cellToChange.setCellState(CellState.FILLED);
        cellToChange.setPlayer(currentPlayer);

        Move finalMove = new Move(cellToChange, currentPlayer);
        moves.add(finalMove);


        nextPlayerMoveIndex += 1;
        nextPlayerMoveIndex %= players.size();

        if (checkWinner(board, finalMove)) {
            state = GameState.WIN;
            winner = currentPlayer;
        } else if (moves.size() == this.board.getSize() * this.board.getSize()) {
            state = GameState.DRAW;
        }
    }

    private boolean checkWinner(Board board, Move finalMove) {
        for (WinningStrategy winningStrategy : winningStrategies) {
            if (winningStrategy.checkWinner(board, finalMove)) {
                return true;
            }
        }
        return false;
    }

    private boolean isMoveValid(Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        if (row >= board.getSize()) {
            return false;
        }
        if (col >= board.getSize()) {
            return false;
        }

        if (board.getBoard().get(row).get(col).getCellState().equals(CellState.EMPTY)) {
            return true;
        }
        return false;
    }


    public static class Builder {
        private int size = 0;

        private List<Player> players = new ArrayList<>();
        private List<WinningStrategy> winningStrategies = new ArrayList<>();

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public Builder addPlayer(Player player) {
            this.players.add(player);
            return this;
        }

        public Builder addWinningStrategy(WinningStrategy winningStrategy) {
            this.winningStrategies.add(winningStrategy);
            return this;
        }

        public Game build() throws MoreThanOneBotException, PlayersCountDimensionMismatchException, DuplicateSymbolException {
            validateBotCounts();
            validateDimensionAndPlayer();
            validateUniqueSymbolsForPlayers();
            return new Game(size, players, winningStrategies);
        }

        private void validateUniqueSymbolsForPlayers() throws DuplicateSymbolException {
            Map<Character, Integer> symbolCounts = new HashMap<>();
            for (Player player : players) {
                char character = player.getSymbol().getCharacter();
                symbolCounts.put(character, symbolCounts.getOrDefault(character, 0) + 1);

                if (symbolCounts.get(character) > 1) {
                    throw new DuplicateSymbolException();
                }
            }
        }

        private void validateDimensionAndPlayer() throws PlayersCountDimensionMismatchException {
            if (players.size() != size - 1) {
                throw new PlayersCountDimensionMismatchException();
            }
        }

        private void validateBotCounts() throws MoreThanOneBotException {
//            int count = 0;
//            for (Player player : players) {
//                if (player.getType().equals(PlayerType.BOT)) {
//                    count++;
//                }
//            }

            long count = players.stream()
                    .filter(player -> player.getType().equals(PlayerType.BOT))
                    .count();

            if (count > 1) {
                throw new MoreThanOneBotException();
            }
        }
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameState getState() {
        return state;
    }

    public void setState(GameState state) {
        this.state = state;
    }

    public int getNextPlayerMoveIndex() {
        return nextPlayerMoveIndex;
    }

    public void setNextPlayerMoveIndex(int nextPlayerMoveIndex) {
        this.nextPlayerMoveIndex = nextPlayerMoveIndex;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }
}
