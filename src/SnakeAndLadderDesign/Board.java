package SnakeAndLadderDesign;

import TicTacToeDesign.Model.PlayingPiece;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;

    public Board(int size, int numberOfSnakes, int numberOfLadders) {
        initialiseBoard(size);
        addSnakeLadders(cells, numberOfSnakes, numberOfLadders);
    }

    private void initialiseBoard(int size) {
        cells = new Cell[size+1][size+1];
        for(int x = 0; x <= size; x++) {
            for(int y = 0; y <= size; y++) {
                cells[x][y] = new Cell();
            }
        }
    }

    private void addSnakeLadders(Cell[][] cells, int numberOfSnakes, int numberOfLadders) {
        while(numberOfSnakes > 0) {
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length * cells[0].length - 1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length * cells[0].length - 1);

            if(snakeTail >= snakeHead) {
                continue;
            }
            Jump snakeJump = new Jump();
            snakeJump.start = snakeHead;
            snakeJump.end = snakeTail;

            Cell cell = getCell(snakeHead);
            cell.jump = snakeJump;
            numberOfSnakes--;
        }

        while(numberOfLadders > 0) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);

            if(ladderStart >= ladderEnd) {
                continue;
            }
            Jump ladderJump = new Jump();
            ladderJump.start = ladderStart;
            ladderJump.end = ladderEnd;

            Cell cell = getCell(ladderStart);
            cell.jump = ladderJump;
            numberOfLadders--;
        }
    }

    Cell getCell(int snakeHead) {
        int row = snakeHead / cells.length;
        int col = snakeHead % cells.length;
        return cells[row][col];
    }
}
