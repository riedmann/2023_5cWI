package at.ran.oo;

import java.util.Scanner;

public class TicTacToe {
    // static int[][] field = new int[3][3];
    static int[][] field = {{1, 0, 1}, {2, 2, 2}, {1, 2, 2}};
    static Scanner scanner = new Scanner(System.in);
    static boolean isPlayer1 = true;

    public static void main(String[] args) {
        run();
    }

    public static void run() {

        // while (true){
        if (isPlayer1) {
            System.out.println("Player 1");
        } else {
            System.out.println("Player 2");
        }
        //getUserInput();

        if (hasWinner()){
            System.out.println("Winner");
        }
        isPlayer1 = !isPlayer1;
        // }
    }

    private static void getUserInput() {
        String inputOfPlayer = scanner.next();
        String[] input = inputOfPlayer.split(",");
        int input1 = Integer.parseInt(input[0]);
        int input2 = Integer.parseInt(input[1]);
        if (isPlayer1) {
            field[input1][input2] = 1;
        } else {
            field[input1][input2] = 2;
        }
    }

    public static boolean hasWinner() {
        for (int row = 0; row < field.length; row++) {
            if ((field[row][0] == field[row][1]) && (field[row][1] == field[row][2]) && (field[row][0]!=0)) {
                return true;
            }
        }
        return false;
    }
}
