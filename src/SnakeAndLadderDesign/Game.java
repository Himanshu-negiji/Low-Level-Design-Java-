package SnakeAndLadderDesign;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class Game {
    HashMap<Integer, Integer> jump = new HashMap<Integer, Integer>();
    Board board;
    Deque<Player> playerList = new LinkedList<>();;
    Player winner;
    Dice dice;

    public Game() {
        initialiseGame();
    }

    public void initialiseGame() {
        board = new Board(10, 5,4); // Assuming a 10x10 board
        dice = new Dice();
        winner = null;
        addPlayer();
    }

    public void addPlayer() {
        Player player1 = new Player("Player 1", 1, 0);
        Player player2 = new Player("Player 2", 2, 0);

        playerList.add(player1);
        playerList.add(player2);
    }

    public void startGame() {
        while(winner == null) {
            Player currentPlayer = findPlayerTurn();
            System.out.println("Current Player: " + currentPlayer.name);

            int diceCount = dice.rollDice();
//            System.out.println("Dice rolled: " + diceCount);

            int newPosition = currentPlayer.currentPosition + diceCount;
            newPosition = jump(newPosition);

            currentPlayer.currentPosition = newPosition;
            System.out.println("New Position: " + newPosition);
            if(newPosition > board.cells.length * board.cells.length-1) {
                winner = currentPlayer;
            }
        }
        System.out.println("Winner is: " + winner.name + " with position: " + winner.currentPosition);
    }

    private int jump(int newPosition) {
        if(newPosition > board.cells.length * board.cells.length-1) {
            return newPosition;
        }
        Cell cell = board.getCell(newPosition);
        if(cell.jump != null && cell.jump.start == newPosition) {
            String snakeOrLadder = (cell.jump.start > cell.jump.end) ? "Snake" : "Ladder";
            System.out.println("Jump done by" + snakeOrLadder + " from " + cell.jump.start + " to " + cell.jump.end);
            return cell.jump.end;
        }
        return newPosition;
    }

    private Player findPlayerTurn() {
        Player currentPlayer = playerList.removeFirst();
        playerList.addLast(currentPlayer);
        return currentPlayer;
    }
}
