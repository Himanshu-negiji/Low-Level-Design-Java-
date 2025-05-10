package TicTacToeDesign.Model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public int size;
    public PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean placeMove(int row, int column, PlayingPiece piece) {
        if(board[row][column] == null) {
            board[row][column] = piece;
            return true;
        }
        return false;
    }

    public List<Pair<Integer, Integer>> getAvailableMoves() {
        List<Pair<Integer, Integer>> moves = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(board[i][j] == null) {
                    Pair<Integer, Integer> newMove = new Pair<>(i, j);
                    moves.add(newMove);
                }
            }
        }
        return moves;
    }

    public boolean checkWinner(int row, int column, PlayingPiece piece) {
        // Check row
        for (int i = 0; i < size; i++) {
            if (board[row][i] != piece) {
                break;
            }
            if (i == size - 1) {
                return true;
            }
        }

        // Check column
        for (int i = 0; i < size; i++) {
            if (board[i][column] != piece) {
                break;
            }
            if (i == size - 1) {
                return true;
            }
        }

        // Check diagonal
        if (row == column) {
            for (int i = 0; i < size; i++) {
                if (board[i][i] != piece) {
                    break;
                }
                if (i == size - 1) {
                    return true;
                }
            }
        }

        // Check anti-diagonal
        if (row + column == size - 1) {
            for (int i = 0; i < size; i++) {
                if (board[i][size - 1 - i] != piece) {
                    break;
                }
                if (i == size - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] == null ? "   " : " " + board[i][j].pieceType + " ");
                if (j < size - 1) System.out.print("|");
            }
            System.out.println();
            if (i < size - 1) {
                for (int k = 0; k < size; k++) {
                    System.out.print("---");
                    if (k < size - 1) System.out.print("+");
                }
                System.out.println();
            }
        }
    }
}
