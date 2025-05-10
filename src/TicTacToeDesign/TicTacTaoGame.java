package TicTacToeDesign;

import TicTacToeDesign.Model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class TicTacTaoGame {
    Deque<Player> players;
    Board board;

    public TicTacTaoGame() {
        initializeGame();
    }

    public void initializeGame() {
        players = new LinkedList<>();

        PlayingPieceO playingPiece0 = new PlayingPieceO();
        Player player1 = new Player("Himanshu", playingPiece0);

        PlayingPieceX playingPieceX = new PlayingPieceX();
        Player player2 = new Player("Komal", playingPieceX);

        players.add(player1);
        players.add(player2);
        board = new Board(3);
    }

    public void startGame() {
        while(true) {
            Player currentPlayer = players.removeFirst();

            List<Pair<Integer, Integer>> availableMoves = board.getAvailableMoves();

            if(availableMoves.isEmpty()) {
                System.out.println("Game Over! No winner.");
                break;
            }

            System.out.println("Current Player: " + currentPlayer.name + " Enter your move -> row, column");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            String[] move = s.split(",");
            int row = Integer.parseInt(move[0]);
            int column = Integer.parseInt(move[1]);

            boolean isValidMove = board.placeMove(row, column, currentPlayer.playingPiece);

            if(!isValidMove) {
                System.out.println("Invalid move");
                players.addFirst(currentPlayer);
                continue;
            }

            players.addLast(currentPlayer);
            boolean winner = board.checkWinner(row, column, currentPlayer.playingPiece);
            if(winner) {
                System.out.println("Player " + currentPlayer.name + " wins!");
                break;
            }
            board.printBoard();
        }
    }
}
