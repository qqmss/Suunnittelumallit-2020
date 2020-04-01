package templatemethod;

import java.util.Scanner;

public class TicTacToe extends Game {
    private static final int ROWS = 3;
    private static final int COLUMS = 3;
    private static final int TIE = -1;
    private static final int EMPTY = 0;
    private static final int TIC = 1;
    private static final int TAC = 2;
    private int winner;
    private int turn;
    private int[][] board = new int[COLUMS][ROWS];

    @Override
    void initializeGame() {
        winner = EMPTY;
        turn = 0;
        for(int[] row : board){
            for(int i = 0; i < row.length; i++){
                row[i] = EMPTY;
            }
        }
    }

    @Override
    void makePlay(int player) {
        turn++;
        System.out.println("Current player: " + getPlayersMark(player));
        if (player != 0 && player != 1) {
            System.out.println("Only 2 players supported");
            return;
        }
        if (endOfGame()) {
            System.out.println("Game Over");
            printWinner();
            return;
        }
        int markType = getPlayersMark(player);
        makeMark(markType);
        if (isWinner(markType)){
            winner = markType;
        }
        printBoard();
        if (turn >= COLUMS * ROWS){
            winner = TIE;
        }

    }

    @Override
    boolean endOfGame() {
        return winner != EMPTY;
    }

    @Override
    void printWinner() {
        if (!endOfGame()){
            System.out.println("Game Not Over");
        } else {
            switch (winner){
                case TIC:
                    System.out.println("Winner is Tic");
                    break;
                case TAC:
                    System.out.println("Winner is Tac");
                    break;
                case TIE:
                    System.out.println("Tie");
            }
        }

    }

    private void makeMark(int markType) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        boolean illegalMove;
        do {
            System.out.print("X Y:");
            x = scanner.nextInt();
            y = scanner.nextInt();
            if(0 <= x && x < ROWS && 0 <= y && y < COLUMS && board[y][x] == EMPTY) {
                board[y][x] = markType;
                illegalMove = false;
            } else {
                System.out.println("illegal move (x,y) = " + x + "," + y);
                illegalMove = true;
            }
        } while (illegalMove);
    }

    private int getPlayersMark(int player) {
        return player == 0 ? TIC : TAC;
    }

    private boolean isWinner(int mark) {
        //check columns
        for (int j = 0; j < ROWS; j++){
            for (int i = 0; i < COLUMS; i++){
                if (board[i][j] == mark){
                    if (i == COLUMS - 1){
                        return true;
                    }
                } else {
                    break;
                }
            }
        }
        //check rows
        for (int j = 0; j < COLUMS; j++){
            for (int i = 0; i < ROWS; i++){
                if (board[j][i] == mark){
                    if (i == ROWS - 1){
                        return true;
                    }
                } else {
                    break;
                }
            }
        }
        //check diagonals
        if(COLUMS == ROWS) {
            for (int i = 0; i < ROWS && i < COLUMS; i++) {
                if (board[i][i] == mark) {
                    if (i == ROWS - 1 || i == COLUMS - 1) {
                        return true;
                    }
                } else {
                    break;
                }
            }
            for (int i = 0; i < ROWS && i < COLUMS; i++) {
                if (board[i][ROWS - i - 1] == mark) {
                    if (i == ROWS - 1 || i == COLUMS - 1) {
                        return true;
                    }
                } else {
                    break;
                }
            }
        }
        return false;
    }

    private void printBoard(){
        for(int i = board.length - 1; i >= 0 ; i--){
            for(int cel : board[i]){
                System.out.print(cel);
            }
            System.out.println();
        }
    }
}
