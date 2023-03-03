package org.example.tictactoe;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Tictactoe {
    static PrintStream l = new PrintStream((new FileOutputStream(FileDescriptor.out)));
    public static void draw(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                l.print(board[i][j]);
            }
            l.println(" ");
        }
    }
    public static char won(char[][] board) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] !='-') {
                return board[i][0];
            }
        }
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j]&& board[0][j] !='-') {
                return board[0][j];
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]&& board[0][0] !='-' ) {
            return board[0][0];
        }
        if (board[2][0] == board[1][1] && board[1][1] == board[0][2]&& board[2][0] !='-') {
            return board[2][0];
        }
        return '-';
    }
    public static boolean tied(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
    public static void tic() {
        int a = 0;
        do {
            Scanner sc = new Scanner(System.in);
            l.println("Enter player 1 name");
            String p1 = sc.nextLine();
            l.println("Enter player 2 name");
            String p2 = sc.nextLine();
            int stop = 1;
            char[][] board = new char[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = '-';
                }
            }
            boolean isp1 = true;
            boolean gameended = false;

            while (!gameended && stop == 1) {

                char symbol;
                if (isp1) {
                    symbol = 'x';
                } else {
                    symbol = 'o';
                }
                if (isp1) {
                    l.println( p1 + " turn");
                } else {
                    l.println( p2 + " turn");
                }
                try{
                    l.println("Enter the row position");
                    int r = sc.nextInt();
                    l.println("Enter the column position");
                    int c = sc.nextInt();

                    if (board[r][c] != '-') {
                        l.println("Move made already");
                        continue;
                    } else {
                        board[r][c] = symbol;
                    }
                } catch(ArrayIndexOutOfBoundsException e) {
                    l.println( "Array index out of bounds: " + e.getMessage());
                }
                char win = won(board);
                boolean tie = tied(board);
                if (win == 'x') {
                    l.println(p1 + "have won");
                    gameended = true;
                    stop = 0;
                } else if (win == 'o') {
                    l.println( p2 + " have won");
                    gameended = true;
                    stop = 0;
                } else if (tie) {
                    l.println("Match tied ");
                    gameended = true;
                    stop = 0;
                } else {
                    isp1 = !isp1;
                }
                draw(board);
            }
            l.println("Press 1 for continue playing ");
            a = sc.nextInt();
        } while (a == 1) ;
    }
}

